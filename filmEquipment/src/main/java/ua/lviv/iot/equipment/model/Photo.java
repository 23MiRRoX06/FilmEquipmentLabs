package ua.lviv.iot.equipment.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Photo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @ManyToOne(fetch = FetchType.EAGER)
  @JsonIgnoreProperties("photosTaken")
  private Camera cameraTakenBy;

  private String fileFormat;
  private int sizeInMb;

  public Photo() {

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Camera getCameraTakenBy() {
    return cameraTakenBy;
  }

  public void setCameraTakenBy(Camera cameraTakenBy) {
    this.cameraTakenBy = cameraTakenBy;
  }

  public String getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }

  public int getSizeInMb() {
    return sizeInMb;
  }

  public void setSizeInMb(int sizeInMb) {
    this.sizeInMb = sizeInMb;
  }
}
