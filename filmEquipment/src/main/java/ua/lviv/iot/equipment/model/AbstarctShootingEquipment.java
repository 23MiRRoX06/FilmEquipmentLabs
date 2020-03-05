package ua.lviv.iot.equipment.model;

public abstract class AbstarctShootingEquipment {

  private int productionYear;
  private int warrantyWorkPeriodInMonths;
  private String factoryManufacturer;
  private String countryManufacturer;
  private String modelName;
  private String material;
  private double weightInGrams;
  private String color;

  public AbstarctShootingEquipment(int productionYear) {
    this.setProductionYear(productionYear);
  }

  public AbstarctShootingEquipment(int warrantyWorkPeriodInMonths, double weightInGrams) {
    this.warrantyWorkPeriodInMonths = warrantyWorkPeriodInMonths;
    this.weightInGrams = weightInGrams;
  }

  public String getFactoryManufacturer() {
    return factoryManufacturer;
  }

  public void setFactoryManufacturer(String factoryManufacturer) {
    this.factoryManufacturer = factoryManufacturer;
  }

  public String getCountryManufacturer() {
    return countryManufacturer;
  }

  public void setCountryManufacturer(String countryManufacturer) {
    this.countryManufacturer = countryManufacturer;
  }

  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public double getWeightInGrams() {
    return weightInGrams;
  }

  public void setWeightInGrams(int weightInGrams) {
    this.weightInGrams = weightInGrams;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getProductionYear() {
    return productionYear;
  }

  public void setProductionYear(int productionYear) {
    this.productionYear = productionYear;
  }

  public int getWarrantyWorkPeriodInMonths() {
    return warrantyWorkPeriodInMonths;
  }

  public void setWarrantyWorkPeriodInMonths(int warrantyWorkPeriodInMonths) {
    this.warrantyWorkPeriodInMonths = warrantyWorkPeriodInMonths;
  }
}
