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

import ua.lviv.iot.equipment.business.PhotoService;
import ua.lviv.iot.equipment.model.Photo;

@RequestMapping("/photos")
@RestController
public class PhotoController {

  @Autowired
  private PhotoService photoService;

  private AtomicInteger idCounter = new AtomicInteger();

  @GetMapping
  public List<Photo> getAllPhotos() {
    return photoService.getAllPhotos();
  }

  @GetMapping(path = "/{id}")
  public Photo getPhoto(@PathVariable("id") Integer photoId) {
    return photoService.getPhotoById(photoId);
  }

  @PostMapping
  public Photo addPhoto(final @RequestBody Photo photo) {
    photo.setId(idCounter.incrementAndGet());
    return photoService.createPhoto(photo);
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<Photo> updatePhoto(final @RequestBody Photo photo,
      @PathVariable("id") Integer photoId) {
    photo.setId(photoId);
    return photoService.updatePhoto(photo, photoId);
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Photo> deletePhoto(@PathVariable("id") Integer photoId) {
    return photoService.deletePhoto(photoId);
  }

}
