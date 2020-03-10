package ua.lviv.iot.equipment.manager;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import ua.lviv.iot.equipment.model.AbstarctShootingEquipment;
import ua.lviv.iot.equipment.model.Camera;
import ua.lviv.iot.equipment.model.Costume;

public abstract class BaseFilmMakingManagerTest {

  protected List<Costume> costumes;
  protected List<AbstarctShootingEquipment> equipment;

  @BeforeEach
  public void createCostumes() {
    costumes = new LinkedList<Costume>();
    costumes.add(new Costume(2016, 1914, "Drama"));
    costumes.add(new Costume(2004, 1995, "Western"));
    costumes.add(new Costume(2010, 1992, "Historical"));
  }

  @BeforeEach
  public void createEquipment() {
    equipment = new LinkedList<AbstarctShootingEquipment>();
    equipment.add(new Camera(6, 232.6));
    equipment.add(new Camera(12, 1645));
    equipment.add(new Camera(1, 567));
  }
}