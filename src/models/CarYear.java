package models;

public class CarYear {
  private int year ;
  private Boolean isValid ;
  public CarYear(int year, Boolean isValid) {
    this.year = year;
    this.isValid = isValid;
  }
  public int getYear() {
    return year;
  }
  public void setYear(int year) {
    this.year = year;
  }
  public Boolean getIsValid() {
    return isValid;
  }
  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }
  @Override
  public String toString() {
    return "CarYear [year=" + year + ", isValid=" + isValid + "]";
  }
   
  

}
