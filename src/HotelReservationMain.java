import java.awt.List;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class HotelReservationMain {
	Hotel h = new Hotel();
	
	public static void hotelInitialize(HotelList hotelList) {
		Scanner sc = new Scanner(System.in);
		Hotel h1 = new Hotel();
		System.out.println("Please enter the name of the hotel");
		h1.setName(sc.next());
		System.out.println("Please enter the regular price of the hotel");
		h1.setRegularRate(sc.nextInt());
		System.out.println("Please enter the weekday price of the hotel");
		h1.setWeekdayRates(sc.nextInt());
		System.out.println("Please enter the weekend price of the hotel");
		h1.setWeekendRates(sc.nextInt());
		hotelList.getHotelList().add(h1);
	}
	public static int noOfDays(String startDay, String endDay) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
		LocalDate date1 = LocalDate.parse(startDay, dtf);
		LocalDate date2 = LocalDate.parse(endDay, dtf);
		return (int) Duration.between(date1, date2).toDays();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HotelList hotelList = new HotelList();
		hotelList.setHotelList(new ArrayList<Hotel>());
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Hotel Management System");
		System.out.println("Please enter the existing hotel details first");
		hotelInitialize(hotelList);
		System.out.println("Please enter the start date in the format dd MM yyyy");
		String startDay = sc.next();
		System.out.println("Please enter the end date in the format dd MM yyyy");
		String endDay = sc.next();
		int days = noOfDays(startDay,endDay);
		Optional<Hotel> hotel = hotelList.getHotelList().stream().min(Comparator.comparing(Hotel::getRegularRate));
		System.out.println("The hotel with the cheapest price for the given start date and end date is :" +hotel.get().getName()+ " and the price is : "+hotel.get().getRegularRate()*days);
		
	}

}
