package ua.lviv.iot.equipment.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ua.lviv.iot.equipment.dataaccess.StoreRepository;
import ua.lviv.iot.equipment.model.Store;

@Service
public class StoreService {

  @Autowired
  private StoreRepository storeRepository;

  public Store createStore(Store store) {
    return storeRepository.save(store);
  }

  public List<Store> getAllStores() {
    return storeRepository.findAll();
  }

  public Store getStoreById(Integer storeId) {
    if (storeRepository.existsById(storeId)) {
      return storeRepository.findById(storeId).get();
    }
    return null;
  }

  public ResponseEntity<Store> deleteStore(Integer storeId) {
    if (storeRepository.existsById(storeId)) {
      storeRepository.deleteById(storeId);
      return ResponseEntity.ok().build();
    }
    return ResponseEntity.notFound().build();
  }

  public ResponseEntity<Store> updateStore(Store store, Integer storeId) {
    if (storeRepository.existsById(storeId)) {
      return ResponseEntity.ok(storeRepository.save(store));
    }
    return ResponseEntity.notFound().build();
  }
}
