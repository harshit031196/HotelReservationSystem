import java.util.List;

public class HotelList {
	private List<Hotel> hotelList;

	public List<Hotel> getHotelList() {
		return hotelList;
	}

	public void setHotelList(List<Hotel> hotelList) {
		this.hotelList = hotelList;
	}
	@Override
	public String toString() {
		return hotelList.toString();
	}
}
