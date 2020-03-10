package ua.lviv.iot.equipment.manager;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.equipment.model.SortType;

class FilmMakingManagerUtilsTest extends BaseFilmMakingManagerTest {

  @Test
  void testSortingCostumesByProductionYearAscending() {
    FilmMakingManagerUtils.sortCostumesByProductionYear(costumes, SortType.ASC);
    for (int costumeIndex = 0; costumeIndex < costumes.size() - 1; costumeIndex++) {
      assertTrue(costumes.get(costumeIndex).getProductionYear() < costumes.get(++costumeIndex)
          .getProductionYear());
    }
  }

  @Test
  void testSortingCostumesByProductionYearDescending() {
    FilmMakingManagerUtils.sortCostumesByProductionYear(costumes, SortType.DESC);
    for (int costumeIndex = 0; costumeIndex < costumes.size() - 1; costumeIndex++) {
      assertTrue(costumes.get(costumeIndex).getProductionYear() > costumes.get(++costumeIndex)
          .getProductionYear());
    }
  }

  @Test
  void testSortingCostumesByYearOfUseAscending() {
    FilmMakingManagerUtils.sortCostumesByYearOfUse(costumes, SortType.ASC);
    for (int costumeIndex = 0; costumeIndex < costumes.size() - 1; costumeIndex++) {
      assertTrue(
          costumes.get(costumeIndex).getYearOfUse() < costumes.get(++costumeIndex).getYearOfUse());
    }
  }

  @Test
  void testSortingCostumesByYearOfUseDescending() {
    FilmMakingManagerUtils.sortCostumesByYearOfUse(costumes, SortType.DESC);
    for (int costumeIndex = 0; costumeIndex < costumes.size() - 1; costumeIndex++) {
      assertTrue(
          costumes.get(costumeIndex).getYearOfUse() > costumes.get(++costumeIndex).getYearOfUse());
    }
  }

  @Test
  void testSortingEquipmentByWarrantyPeriodAscending() {
    FilmMakingManagerUtils.sortEquipmentByWarrantyPeriod(equipment, SortType.ASC);
    for (int itemIndex = 0; itemIndex < equipment.size() - 1; itemIndex++) {
      assertTrue(equipment.get(itemIndex).getWarrantyWorkPeriodInMonths() < equipment
          .get(++itemIndex).getWarrantyWorkPeriodInMonths());
    }
  }

  @Test
  void testSortingEquipmentByWarrantyPeriodDescending() {
    FilmMakingManagerUtils.sortEquipmentByWarrantyPeriod(equipment, SortType.DESC);
    for (int itemIndex = 0; itemIndex < equipment.size() - 1; itemIndex++) {
      assertTrue(equipment.get(itemIndex).getWarrantyWorkPeriodInMonths() > equipment
          .get(++itemIndex).getWarrantyWorkPeriodInMonths());
    }
  }

  @Test
  void testSortingEquipmentByWeightAscending() {
    FilmMakingManagerUtils.sortEquipmentByWeight(equipment, SortType.ASC);
    for (int itemIndex = 0; itemIndex < equipment.size() - 1; itemIndex++) {
      assertTrue(equipment.get(itemIndex).getWeightInGrams() < equipment.get(++itemIndex)
          .getWeightInGrams());
    }
  }

  @Test
  void testSortingEquipmentByWeightDescending() {
    FilmMakingManagerUtils.sortEquipmentByWeight(equipment, SortType.DESC);
    for (int itemIndex = 0; itemIndex < equipment.size() - 1; itemIndex++) {
      assertTrue(equipment.get(itemIndex).getWeightInGrams() > equipment.get(++itemIndex)
          .getWeightInGrams());
    }
  }
}
