import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class HotelReservationMain {
	Hotel h = new Hotel();
	
	public void noOfDays(String startDay, String endDay) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");

		LocalDate date1 = LocalDate.parse(startDay, dtf);
		LocalDate date2 = LocalDate.parse(endDay, dtf);
		long daysBetween = Duration.between(date1, date2).toDays();
		System.out.println ("Days: " + daysBetween);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Hotel Management System");
	}

}
