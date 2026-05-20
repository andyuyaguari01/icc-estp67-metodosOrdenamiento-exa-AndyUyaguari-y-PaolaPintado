package models;

import java.util.Arrays;

public class CarModel {

  private String modelName ;
  private CarYear[] year;
  
  public CarModel(String modelName, CarYear[] year) {
    this.modelName = modelName;
    this.year = year;
  }

  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public CarYear[] getYear() {
    return year;
  }

  public void setYear(CarYear[] year) {
    this.year = year;
  }

  

  @Override
  public String toString() {
    return "CarModel [modelName=" + modelName + ", year=" + Arrays.toString(year) + "]";
  }

  

  


}
