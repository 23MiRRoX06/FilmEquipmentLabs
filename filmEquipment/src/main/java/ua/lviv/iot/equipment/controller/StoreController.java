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

import ua.lviv.iot.equipment.business.StoreService;
import ua.lviv.iot.equipment.model.Store;

@RequestMapping("/stores")
@RestController
public class StoreController {

  @Autowired
  private StoreService storeService;

  private AtomicInteger idCounter = new AtomicInteger();

  @GetMapping
  public List<Store> getAllStores() {
    return storeService.getAllStores();
  }

  @GetMapping(path = "/{id}")
  public Store getStore(@PathVariable("id") Integer storeId) {
    return storeService.getStoreById(storeId);
  }

  @PostMapping
  public Store addStore(final @RequestBody Store store) {
    store.setId(idCounter.incrementAndGet());
    return storeService.createStore(store);
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<Store> updateStore(final @RequestBody Store store,
      @PathVariable("id") Integer storeId) {
    store.setId(storeId);
    return storeService.updateStore(store, storeId);
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Store> deleteStore(@PathVariable("id") Integer storeId) {
    return storeService.deleteStore(storeId);
  }
}
