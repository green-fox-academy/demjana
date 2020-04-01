package reservations;

public class Reservation implements Reservationy {
  private String bookingCode;
  private String dow;

  public Reservation(){
    bookingCode = createBookingCode();
    dow = createDow();
  }

  private String createBookingCode(){
   String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   String code = "";
    for (int i = 0; i < 8; i++) {
      code += characters.charAt((int) (Math.random() * characters.length()));
    }
    return code;
  }

  private String createDow(){
    String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    return days[(int) (Math.random() * days.length)];
  }

  @Override
  public String getCodeBooking() {
    return bookingCode;
  }

  @Override
  public String getDowBooking() {
    return dow;
  }
}
