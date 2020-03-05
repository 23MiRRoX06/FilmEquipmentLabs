package ua.lviv.iot.equipment.manager;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.equipment.model.AbstarctShootingEquipment;
import ua.lviv.iot.equipment.model.Costume;

class FilmMakingManagerTest extends BaseFilmMakingManagerTest {

  private FilmMakingManager filmMakingManager;

  @BeforeEach
  public void setUp() {
    filmMakingManager = new FilmMakingManager();
    filmMakingManager.createEquipment(cameras);
    filmMakingManager.createCostumes(costumes);
  }

  @Test
  public void testFindEquipmentWithWarrantyPeriodGreaterThan() {
    List<AbstarctShootingEquipment> gear = filmMakingManager
        .findEquipmentWithWarrantyPeriodGreaterThan(3);
    assertTrue(gear.size() >= 1);
    for (int itemIndex = 0; itemIndex < gear.size(); itemIndex++) {
      assertTrue(gear.get(itemIndex).getWarrantyWorkPeriodInMonths() > 3);
    }
  }

  @Test
  public void testFindCostumesForHistoricalFilm() {
    List<Costume> costumes = filmMakingManager.findCostumesForHistoricalFilm("Historical", 1991);
    assertTrue(costumes.size() >= 1);
    for (int costumeIndex = 0; costumeIndex < costumes.size(); costumeIndex++) {
      assertTrue(costumes.get(costumeIndex).getCategory().equals("Historical")
          || costumes.get(costumeIndex).getYearOfUse() < 1991);
    }
  }
}
