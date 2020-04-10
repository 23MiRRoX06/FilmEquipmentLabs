package ua.lviv.iot.equipment.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.equipment.model.Photo;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Integer>{

}
