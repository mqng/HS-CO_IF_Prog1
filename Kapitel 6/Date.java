public class Date {
	int day,month,year;
	
	Date(int month, int day, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	Date(String month, int day, int year){
		
	}
	Date(int month, int year){
		
	}
	public String toString() {
		return "" + month;
	}
}
