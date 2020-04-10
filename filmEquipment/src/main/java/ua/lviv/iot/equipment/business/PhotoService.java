package ua.lviv.iot.equipment.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ua.lviv.iot.equipment.dataaccess.PhotoRepository;
import ua.lviv.iot.equipment.model.Photo;

@Service
public class PhotoService {

  @Autowired
  private PhotoRepository photoRepository;

  public Photo createPhoto(Photo photo) {
    return photoRepository.save(photo);
  }

  public List<Photo> getAllPhotos() {
    return photoRepository.findAll();
  }

  public Photo getPhotoById(Integer photoId) {
    if (photoRepository.existsById(photoId)) {
      return photoRepository.findById(photoId).get();
    }
    return null;
  }

  public ResponseEntity<Photo> deletePhoto(Integer photoId) {
    if (photoRepository.existsById(photoId)) {
      photoRepository.deleteById(photoId);
      return ResponseEntity.ok().build();
    }
    return ResponseEntity.notFound().build();
  }

  public ResponseEntity<Photo> updatePhoto(Photo photo, Integer photoId) {
    if (photoRepository.existsById(photoId)) {
      return ResponseEntity.ok(photoRepository.save(photo));
    }
    return ResponseEntity.notFound().build();
  }
}
