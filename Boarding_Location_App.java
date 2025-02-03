import java.time.LocalDate;
import java.time.LocalTime;

public class Boarding_Location_App {

  public static final double BEACHES_PER_NIGHT_RATE = 30.0;
  public static final double PET_PARADISE_PER_NIGHT_RATE = 36.0;

  protected LocalDate departureDate;
  protected LocalTime departureTime;
  protected LocalDate returnDate;
  protected LocalTime returnTime;
  
  public Boarding_Location_App(LocalDate departureDate, LocalTime departureTime, LocalDate returnDate, LocalTime returnTime) {
    this.departureDate = departureDate;
    this.departureTime = departureTime;
    this.returnDate = returnDate;
    this.returnTime = returnTime;

  }



  
  public static void main (String[] args) {
    // System.out.println("Hello World");
    Facility beaches = new Facility("Beaches Animal Clinic", BEACHES_PER_NIGHT_RATE);
    Facility petParadise = new Facility("Pet Paradise", PET_PARADISE_PER_NIGHT_RATE);

    // Set Monday to Friday hours
    for (int i = 1; i <= 5; i++) {
      beaches.setOperatingHours(i, LocalTime.of(7, 0), LocalTime.of(18, 0));
      petParadise.setOperatingHours(i, LocalTime.of(6, 30), LocalTime.of(19, 0));
    }

    beaches.setOperatingHours(6, LocalTime.of(8, 0), LocalTime.of(12, 0));

    petParadise.setOperatingHours(6, LocalTime.of(7, 0), LocalTime.of(18, 0));
    petParadise.setOperatingHours(7, LocalTime.of(7, 0), LocalTime.of(18, 0));

    System.out.println(beaches.toString());
    System.out.println(petParadise.toString());
  }

  
}
