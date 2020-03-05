package ua.lviv.iot.equipment.model;

public class AudioRecorder extends AbstractRecordingDevice {

  private int recordingChannelsNumber;
  private int recordingDurationInMinutes;

  public AudioRecorder(int warrantyWorkPeriodInMonths, double weightInGrams) {
    super(warrantyWorkPeriodInMonths, weightInGrams);
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
