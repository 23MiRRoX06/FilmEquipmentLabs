package ua.lviv.iot.equipment.model;

public class Microphone extends AbstractRecordingDevice {

  private int frequencyRangeInHz;
  private int dynamicRangeInDb;
  private boolean isWindproof;
  private String mountType;

  public Microphone(int warrantyWorkPeriodInMonths, double weightInGrams) {
    super(warrantyWorkPeriodInMonths, weightInGrams);
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
