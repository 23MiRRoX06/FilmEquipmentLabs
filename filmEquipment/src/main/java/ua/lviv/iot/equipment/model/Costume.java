package ua.lviv.iot.equipment.model;

public class Costume extends AbstarctShootingEquipment implements Comparable<Costume> {

  private int yearOfUse;
  private String category;
  private String sizeEur;
  private Quality fabricQuality;

  @Override
  public int compareTo(Costume anotherCostume) {
    return this.getProductionYear() - anotherCostume.getProductionYear();
  }

  public Costume(int productionYear, int yearOfUse, String category) {
    super(productionYear);
    this.setYearOfUse(yearOfUse);
    this.setCategory(category);
  }

  public Costume(int productionYear, int warrantyWorkPeriodInMonths, String factoryManufacturer,
      String countryManufacturer, String modelName, String material, double weightInGrams,
      String color, int yearOfUse, String category, String sizeEur, Quality fabricQuality) {
    super(productionYear, warrantyWorkPeriodInMonths, factoryManufacturer, countryManufacturer,
        modelName, material, weightInGrams, color);
    this.setYearOfUse(yearOfUse);
    this.setCategory(category);
    this.setSizeEur(sizeEur);
    this.setFabricQuality(fabricQuality);
  }

  @Override
  public String getHeaders() {
    return super.getHeaders() + "," + "yearOfUse,category,sizeEur,fabricQuality";

  }

  @Override
  public String toCSV() {
    return super.toCSV() + "," + yearOfUse + "," + category + "," + sizeEur + "," + fabricQuality;
  }

  public Costume(int warrantyWorkPeriodInMonths, double weightInGrams) {
    super(warrantyWorkPeriodInMonths, weightInGrams);
  }

  public String getSizeEur() {
    return sizeEur;
  }

  public void setSizeEur(String sizeEur) {
    this.sizeEur = sizeEur;
  }

  public Quality getFabricQuality() {
    return fabricQuality;
  }

  public void setFabricQuality(Quality fabricQuality) {
    this.fabricQuality = fabricQuality;
  }

  public int getYearOfUse() {
    return yearOfUse;
  }

  public void setYearOfUse(int yearOfUse) {
    this.yearOfUse = yearOfUse;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }
}
