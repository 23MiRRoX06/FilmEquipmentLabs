package ua.lviv.iot.equipment.model;

public class Camera extends AbstractRecordingDevice {

  private String videoResolutionStandart;
  private int videoFrapsPerSecond;
  private int videoRecordingSpeedInMbps;
  private int viewingAngleInDegrees;
  private boolean hasLcdMonito;

  public Camera(int warrantyWorkPeriodInMonths, double weightInGrams) {
    super(warrantyWorkPeriodInMonths, weightInGrams);
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

  public boolean isHasLcdMonito() {
    return hasLcdMonito;
  }

  public void setHasLcdMonito(boolean hasLcdMonito) {
    this.hasLcdMonito = hasLcdMonito;
  }
}
