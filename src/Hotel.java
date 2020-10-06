
public class Hotel {

	private String name;
	private int rate;
	private int weekendRates;
	private int weekdayRates;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setRegularRate(int rate) {
		this.rate=rate;
	}
	public int getRegularRate() {
		return this.rate;
	}
	public int getWeekendRates() {
		return weekendRates;
	}
	public void setWeekendRates(int weekendRates) {
		this.weekendRates = weekendRates;
	}
	public int getWeekdayRates() {
		return weekdayRates;
	}
	public void setWeekdayRates(int weekdayRates) {
		this.weekdayRates = weekdayRates;
	}
}
