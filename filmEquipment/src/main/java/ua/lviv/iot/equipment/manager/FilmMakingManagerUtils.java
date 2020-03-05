package ua.lviv.iot.equipment.manager;

import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.equipment.model.AbstarctShootingEquipment;
import ua.lviv.iot.equipment.model.Costume;
import ua.lviv.iot.equipment.model.SortType;

public class FilmMakingManagerUtils {

  private static final CostumeSorterByYearOfUse COSTUME_SORTER_BY_YEAR_OF_USE
        = new CostumeSorterByYearOfUse();

  public static void sortCostumesByYearOfUse(List<Costume> costumes, SortType type) {
    costumes.sort(type == SortType.ASC ? COSTUME_SORTER_BY_YEAR_OF_USE
        : COSTUME_SORTER_BY_YEAR_OF_USE.reversed());
  }

  public static void sortCostumesByProductionYear(List<Costume> costumes, SortType type) {
    FilmMakingManagerUtils utils = new FilmMakingManagerUtils();
    costumes.sort(type == SortType.ASC ? utils.new CostumeSorterByProductionYear()
        : utils.new CostumeSorterByProductionYear().reversed());
  }

  // anonymous inner class
  public static void sortEquipmentByWeight(List<AbstarctShootingEquipment> equipment,
      SortType type) {
    Comparator<AbstarctShootingEquipment> comparator = new Comparator<AbstarctShootingEquipment>() {
      @Override
      public int compare(AbstarctShootingEquipment firstItem,
          AbstarctShootingEquipment secondItem) {
        return (int) (firstItem.getWeightInGrams() - secondItem.getWeightInGrams());
      }
    };
    equipment.sort(type == SortType.ASC ? comparator : comparator.reversed());
  }

  public static void sortEquipmentByWarrantyPeriod(List<AbstarctShootingEquipment> equipment,
      SortType type) {
    Comparator<AbstarctShootingEquipment> comparator = (firstItem,
        secondItem) -> firstItem.getWarrantyWorkPeriodInMonths()
            - secondItem.getWarrantyWorkPeriodInMonths();
    equipment.sort(type == SortType.ASC ? comparator : comparator.reversed());
  }

  static class CostumeSorterByYearOfUse implements Comparator<Costume> {
    @Override
    public int compare(Costume firstCostume, Costume secondCostume) {
      return firstCostume.getYearOfUse() - secondCostume.getYearOfUse();
    }
  }

  class CostumeSorterByProductionYear implements Comparator<Costume> {
    @Override
    public int compare(Costume firstCostume, Costume secondCostume) {
      return firstCostume.compareTo(secondCostume);
    }
  }
}
