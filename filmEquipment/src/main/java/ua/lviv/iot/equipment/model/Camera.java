package ua.lviv.iot.equipment.model;

public class Camera extends AbstractRecordingDevice {

  private String videoResolutionStandart;
  private int videoFrapsPerSecond;
  private int videoRecordingSpeedInMbps;
  private int viewingAngleInDegrees;
  private boolean hasLcdMonitor;
  private Integer id;

  public Camera(int warrantyWorkPeriodInMonths, double weightInGrams) {
    super(warrantyWorkPeriodInMonths, weightInGrams);
  }

  public Camera(int productionYear, int warrantyWorkPeriodInMonths, String factoryManufacturer,
      String countryManufacturer, String modelName, String material, double weightInGrams,
      String color, boolean isWaterproof, int batteryLifeInHours, String recordFormat,
      String videoResolutionStandart, int videoFrapsPerSecond, int videoRecordingSpeedInMbps,
      int viewingAngleInDegrees, boolean hasLcdMonitor) {
    super(productionYear, warrantyWorkPeriodInMonths, factoryManufacturer, countryManufacturer,
        modelName, material, weightInGrams, color, isWaterproof, batteryLifeInHours, recordFormat);
    this.setVideoResolutionStandart(videoResolutionStandart);
    this.setVideoFrapsPerSecond(videoFrapsPerSecond);
    this.setVideoRecordingSpeedInMbps(videoRecordingSpeedInMbps);
    this.setViewingAngleInDegrees(viewingAngleInDegrees);
    this.setHasLcdMonitor(hasLcdMonitor);
  }

  public Camera() {
    super();
  }

  @Override
  public String getHeaders() {
    return super.getHeaders() + "," + "videoResolutionStandart,videoFrapsPerSecond,"
        + "videoRecordingSpeedInMbps,viewingAngleInDegrees,hasLcdMonitor";

  }

  @Override
  public String toCSV() {
    return super.toCSV() + "," + videoResolutionStandart + "," + videoFrapsPerSecond + ","
        + videoRecordingSpeedInMbps + "," + viewingAngleInDegrees + "," + hasLcdMonitor;
  }

  public String getVideoResolutionStandart() {
    return videoResolutionStandart;
  }

  public void setVideoResolutionStandart(String videoResolutionStandart) {
    this.videoResolutionStandart = videoResolutionStandart;
  }

  public int getVideoFrapsPerSecond() {
    return videoFrapsPerSecond;
  }

  public void setVideoFrapsPerSecond(int videoFrapsPerSecond) {
    this.videoFrapsPerSecond = videoFrapsPerSecond;
  }

  public int getVideoRecordingSpeedInMbps() {
    return videoRecordingSpeedInMbps;
  }

  public void setVideoRecordingSpeedInMbps(int videoRecordingSpeedInMbps) {
    this.videoRecordingSpeedInMbps = videoRecordingSpeedInMbps;
  }

  public int getViewingAngleInDegrees() {
    return viewingAngleInDegrees;
  }

  public void setViewingAngleInDegrees(int viewingAngleInDegrees) {
    this.viewingAngleInDegrees = viewingAngleInDegrees;
  }

  public boolean isHasLcdMonitor() {
    return hasLcdMonitor;
  }

  public void setHasLcdMonitor(boolean hasLcdMonitor) {
    this.hasLcdMonitor = hasLcdMonitor;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

}
