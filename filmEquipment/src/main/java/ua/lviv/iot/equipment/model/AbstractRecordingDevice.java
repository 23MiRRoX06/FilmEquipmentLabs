package ua.lviv.iot.equipment.model;

public abstract class AbstractRecordingDevice extends AbstarctShootingEquipment {

  private boolean isWaterproof;
  private int batteryLifeInHours;
  private String recordFormat;

  public AbstractRecordingDevice(int warrantyWorkPeriodInMonths, double weightInGrams) {
    super(warrantyWorkPeriodInMonths, weightInGrams);
  }

  public AbstractRecordingDevice(int productionYear, int warrantyWorkPeriodInMonths,
      String factoryManufacturer, String countryManufacturer, String modelName, String material,
      double weightInGrams, String color, boolean isWaterproof, int batteryLifeInHours,
      String recordFormat) {
    super(productionYear, warrantyWorkPeriodInMonths, factoryManufacturer, countryManufacturer,
        modelName, material, weightInGrams, color);
    this.setWaterproof(isWaterproof);
    this.setBatteryLifeInHours(batteryLifeInHours);
    this.setRecordFormat(recordFormat);
  }

  public AbstractRecordingDevice() {
    super();
  }

  @Override
  public String getHeaders() {
    return super.getHeaders() + "," + "isWaterproof,batteryLifeInHours,recordFormat";

  }

  @Override
  public String toCSV() {
    return super.toCSV() + "," + isWaterproof + "," + batteryLifeInHours + "," + recordFormat;
  }

  public boolean isWaterproof() {
    return isWaterproof;
  }

  public void setWaterproof(boolean isWaterproof) {
    this.isWaterproof = isWaterproof;
  }

  public int getBatteryLifeInHours() {
    return batteryLifeInHours;
  }

  public void setBatteryLifeInHours(int batteryLifeInHours) {
    this.batteryLifeInHours = batteryLifeInHours;
  }

  public String getRecordFormat() {
    return recordFormat;
  }

  public void setRecordFormat(String recordFormat) {
    this.recordFormat = recordFormat;
  }
}
