package ua.lviv.iot.equipment.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.equipment.model.AbstarctShootingEquipment;
import ua.lviv.iot.equipment.model.Costume;

public class FilmMakingManager {

  private List<AbstarctShootingEquipment> equipment = new LinkedList<AbstarctShootingEquipment>();
  private List<Costume> costumes = new LinkedList<Costume>();

  public void createEquipment(List<AbstarctShootingEquipment> equipment) {
    this.equipment.addAll(equipment);
  }

  public void createEquipment(AbstarctShootingEquipment equipment) {
    this.equipment.add(equipment);
  }

  public void createCostumes(List<Costume> costumes) {
    this.costumes.addAll(costumes);
  }

  public void createCostume(Costume costume) {
    this.costumes.add(costume);
  }

  public List<AbstarctShootingEquipment> findEquipmentWithWarrantyPeriodGreaterThan(
      int warrantyWorkPeriodInMonths) {
    List<AbstarctShootingEquipment> result = new LinkedList<AbstarctShootingEquipment>();
    for (AbstarctShootingEquipment equipment : equipment) {
      if (equipment.getWarrantyWorkPeriodInMonths() > warrantyWorkPeriodInMonths) {
        result.add(equipment);
      }
    }
    return result;
  }

  public List<Costume> findCostumesForHistoricalFilm(String category, int yearOfUse) {
    List<Costume> result = new LinkedList<Costume>();
    for (Costume filmWear : costumes) {
      if (filmWear.getCategory().equals(category)) {
        result.add(filmWear);
      }
      if (filmWear.getYearOfUse() < yearOfUse) {
        result.add(filmWear);
      }
    }
    return result;
  }
}
