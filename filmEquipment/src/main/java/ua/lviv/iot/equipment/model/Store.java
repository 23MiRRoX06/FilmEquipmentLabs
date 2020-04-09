package ua.lviv.iot.equipment.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Store {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @ManyToMany(fetch = FetchType.EAGER)
  @JsonIgnoreProperties("storesIsSoldBy")
  private Set<Camera> cameras;

  private String name;
  private int storesNumberInUkraine;
  private int employeesNumber;

  public Store() {

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Set<Camera> getCameras() {
    return cameras;
  }

  public void setCameras(Set<Camera> cameras) {
    this.cameras = cameras;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getStoresNumberInUkraine() {
    return storesNumberInUkraine;
  }

  public void setStoresNumberInUkraine(int storesNumberInUkraine) {
    this.storesNumberInUkraine = storesNumberInUkraine;
  }

  public int getEmployeesNumber() {
    return employeesNumber;
  }

  public void setEmployeesNumber(int employeesNumber) {
    this.employeesNumber = employeesNumber;
  }

}
