package ua.lviv.iot.equipment.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.equipment.business.CameraService;
import ua.lviv.iot.equipment.model.Camera;

@RequestMapping("/cameras")
@RestController
public class CameraController {

  @Autowired
  private CameraService cameraService;

  private AtomicInteger idCounter = new AtomicInteger();

  @GetMapping(path = "/{id}")
  public Camera getCamera(@PathVariable("id") Integer cameraId) {
    return cameraService.getCameraById(cameraId);
  }

  @GetMapping
  public List<Camera> getAllCameras() {
    return cameraService.getAllCameras();
  }

  @PostMapping
  public Camera addCamera(final @RequestBody Camera camera) {
    camera.setId(idCounter.incrementAndGet());
    return cameraService.createCamera(camera);
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<Camera> updateCamera(final @RequestBody Camera camera,
      @PathVariable("id") Integer cameraId) {
    camera.setId(cameraId);
    return cameraService.updateCamera(camera, cameraId);
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Camera> deleteCamera(@PathVariable("id") Integer cameraId) {
    return cameraService.deleteCamera(cameraId);
  }

}
