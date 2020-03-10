package ua.lviv.iot.equipment.model;

public class AudioRecorder extends AbstractRecordingDevice {

  private int recordingChannelsNumber;
  private int recordingDurationInMinutes;

  public AudioRecorder(int warrantyWorkPeriodInMonths, double weightInGrams) {
    super(warrantyWorkPeriodInMonths, weightInGrams);
  }

  public AudioRecorder(int productionYear, int warrantyWorkPeriodInMonths,
      String factoryManufacturer, String countryManufacturer, String modelName, String material,
      double weightInGrams, String color, boolean isWaterproof, int batteryLifeInHours,
      String recordFormat, int recordingChannelsNumber, int recordingDurationInMinutes) {
    super(productionYear, warrantyWorkPeriodInMonths, factoryManufacturer, countryManufacturer,
        modelName, material, weightInGrams, color, isWaterproof, batteryLifeInHours, recordFormat);
    this.setRecordingChannelsNumber(recordingChannelsNumber);
    this.setRecordingDurationInMinutes(recordingDurationInMinutes);
  }

  @Override
  public String getHeaders() {
    return super.getHeaders() + "," + "recordingChannelsNumber,recordingDurationInMinutes";

  }

  @Override
  public String toCSV() {
    return super.toCSV() + "," + recordingChannelsNumber + "," + recordingDurationInMinutes;
  }

  public int getRecordingChannelsNumber() {
    return recordingChannelsNumber;
  }

  public void setRecordingChannelsNumber(int recordingChannelsNumber) {
    this.recordingChannelsNumber = recordingChannelsNumber;
  }

  public int getRecordingDurationInMinutes() {
    return recordingDurationInMinutes;
  }

  public void setRecordingDurationInMinutes(int recordingDurationInMinutes) {
    this.recordingDurationInMinutes = recordingDurationInMinutes;
  }
}
