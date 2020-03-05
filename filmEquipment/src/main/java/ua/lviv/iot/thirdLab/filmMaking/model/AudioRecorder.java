package ua.lviv.iot.thirdLab.filmMaking.model;

public class AudioRecorder extends AbstractRecordingDevice {

	private int recordingChannelsNumber;
	private int recordingDurationInMinutes;

	public AudioRecorder(int productionYear, int warrantyWorkPeriodInMonths) {
		super(productionYear, warrantyWorkPeriodInMonths);
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
