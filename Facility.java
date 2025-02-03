import java.time.LocalTime;
import java.util.Map;
import java.util.HashMap;

public class Facility {

  protected String facilityName;
  protected double perNightRate;
  protected double lateCheckoutFee;
  protected double earlyCheckInFee;
  protected Map<Integer, Map<String, LocalTime>> operatingHours; // Map of days of week to opening hours


  public Facility(String name, double perNight) {
    this.facilityName = name;
    this.perNightRate = perNight;
    this.operatingHours = new HashMap<Integer, Map<String, LocalTime>>();
  }

  public void setFacilityName(String name) {
    this.facilityName = name;
  }

  public void setPerNightRate(double rate) {
    this.perNightRate = rate;
  }

  public void setLateCheckoutFee(double fee) {
    this.lateCheckoutFee = fee;
  }

  public void setEarlyCheckInFee(double fee) {
    this.earlyCheckInFee = fee;
  }

  // public void setOperatingHours(Map<Integer, Map<String, LocalTime>> daysToHoursMap) {
  //   this.operatingHours = daysToHoursMap;
  // }

  public void setOperatingHours(int dayOfWeek, LocalTime openingHour, LocalTime closingHour) {
    Map<String, LocalTime> hours = new HashMap<String, LocalTime>();
    hours.put("open", openingHour);
    hours.put("close", closingHour);

    operatingHours.putIfAbsent(dayOfWeek, hours);

  }

  public String getFacilityName() {
    return this.facilityName;
  }

  public double getPerNightRate() {
    return this.perNightRate;
  }

  public double getLateCheckoutFee() {
    return this.lateCheckoutFee;
  }

  public double getEarlyCheckInFee() {
    return this.earlyCheckInFee;
  }

  public Map<Integer, Map<String, LocalTime>> getOperatingHours() {
    return this.operatingHours;
  }

  public String toString() {
    return "*******************************\nFacility Name: " + this.getFacilityName() + "\nPer Night Rate: " + this.getPerNightRate() + "\nOperating Hours:\n" + this.getOperatingHours().toString()+"\n*******************************";
  }
  
}
