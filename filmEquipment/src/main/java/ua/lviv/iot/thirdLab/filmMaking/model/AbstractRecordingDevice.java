package ua.lviv.iot.thirdLab.filmMaking.model;

public abstract class AbstractRecordingDevice extends AbstarctShootingEquipment {

	private boolean isWaterproof;
	private int batteryLifeInHours;
	private String recordFormat;

	public AbstractRecordingDevice(int productionYear, int warrantyWorkPeriodInMonths) {
		super(productionYear, warrantyWorkPeriodInMonths);
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
