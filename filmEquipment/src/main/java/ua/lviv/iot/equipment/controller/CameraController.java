package ua.lviv.iot.equipment.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.equipment.model.Camera;

@RequestMapping("/cameras")
@RestController
public class CameraController {

  private HashMap<Integer, Camera> cameras = new HashMap<Integer, Camera>();
  private AtomicInteger idCounter = new AtomicInteger();

  @GetMapping(path = "/{id}")
  public Camera getCamera(@PathVariable("id") Integer cameraId) {
    return cameras.get(cameraId);
  }

  @GetMapping
  public List<Camera> getAllCameras() {
    return new LinkedList<Camera>(cameras.values());
  }

  @PostMapping
  public Camera addCamera(final @RequestBody Camera camera) {
    camera.setId(idCounter.incrementAndGet());
    cameras.put(camera.getId(), camera);
    return camera;
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<Camera> updateCamera(final @RequestBody Camera camera,
      @PathVariable("id") Integer cameraId) {
    camera.setId(cameraId);
    if (cameras.containsKey(camera.getId()) == true) {
      cameras.put(camera.getId(), camera);
      return ResponseEntity.status(HttpStatus.OK).build();
    } else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Camera> deleteCamera(@PathVariable("id") Integer cameraId) {
    HttpStatus status = cameras.remove(cameraId) == null ? HttpStatus.NOT_FOUND
        : HttpStatus.OK;
    return ResponseEntity.status(status).build();
  }

  @DeleteMapping
  public ResponseEntity<Camera> deleteAllCameras() {
    if(cameras.isEmpty() == false) {
      cameras.clear();
      return ResponseEntity.status(HttpStatus.OK).build();
    } else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
  }

}
