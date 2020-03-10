package ua.lviv.iot.equipment.model;

public class Microphone extends AbstractRecordingDevice {

  private int frequencyRangeInHz;
  private int dynamicRangeInDb;
  private boolean isWindproof;
  private String mountType;

  public Microphone(int warrantyWorkPeriodInMonths, double weightInGrams) {
    super(warrantyWorkPeriodInMonths, weightInGrams);
  }

  public Microphone(int productionYear, int warrantyWorkPeriodInMonths, String factoryManufacturer,
      String countryManufacturer, String modelName, String material, double weightInGrams,
      String color, boolean isWaterproof, int batteryLifeInHours, String recordFormat,
      int frequencyRangeInHz, int dynamicRangeInDb, boolean isWindproof, String mountType) {
    super(productionYear, warrantyWorkPeriodInMonths, factoryManufacturer, countryManufacturer,
        modelName, material, weightInGrams, color, isWaterproof, batteryLifeInHours, recordFormat);
    this.setFrequencyRangeInHz(frequencyRangeInHz);
    this.setDynamicRangeInDb(dynamicRangeInDb);
    this.setWindproof(isWindproof);
    this.setMountType(mountType);
  }

  @Override
  public String getHeaders() {
    return super.getHeaders() + ","
        + "frequencyRangeInHz,dynamicRangeInDb,isWindproof,mountType";

  }

  @Override
  public String toCSV() {
    return super.toCSV() + "," + frequencyRangeInHz + "," + dynamicRangeInDb + "," + isWindproof
        + "," + mountType;
  }

  public int getFrequencyRangeInHz() {
    return frequencyRangeInHz;
  }

  public void setFrequencyRangeInHz(int frequencyRangeInHz) {
    this.frequencyRangeInHz = frequencyRangeInHz;
  }

  public int getDynamicRangeInDb() {
    return dynamicRangeInDb;
  }

  public void setDynamicRangeInDb(int dynamicRangeInDb) {
    this.dynamicRangeInDb = dynamicRangeInDb;
  }

  public boolean isWindproof() {
    return isWindproof;
  }

  public void setWindproof(boolean isWindproof) {
    this.isWindproof = isWindproof;
  }

  public String getMountType() {
    return mountType;
  }

  public void setMountType(String mountType) {
    this.mountType = mountType;
  }
}
