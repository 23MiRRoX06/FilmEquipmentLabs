package ua.lviv.iot.equipment.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ua.lviv.iot.equipment.dataaccess.CameraRepository;
import ua.lviv.iot.equipment.model.Camera;

@Service
public class CameraService {

  @Autowired
  private CameraRepository cameraRepository;

  public Camera createCamera(Camera camera) {
    return cameraRepository.save(camera);
  }

  public List<Camera> getAllCameras() {
    return cameraRepository.findAll();
  }

  public Camera getCameraById(Integer cameraId) {
    if (cameraRepository.existsById(cameraId)) {
      return cameraRepository.findById(cameraId).get();
    }
    return null;
  }

  public ResponseEntity<Camera> deleteCamera(Integer cameraId) {
    if (cameraRepository.existsById(cameraId)) {
      cameraRepository.deleteById(cameraId);
      return ResponseEntity.ok().build();
    }
    return ResponseEntity.notFound().build();
  }

  public ResponseEntity<Camera> updateCamera(Camera camera, Integer cameraId) {
    if (cameraRepository.existsById(cameraId)) {
      return ResponseEntity.ok(cameraRepository.save(camera));
    }
    return ResponseEntity.notFound().build();
  }
}
