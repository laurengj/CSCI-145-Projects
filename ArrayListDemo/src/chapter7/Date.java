package chapter7;

public class Date {
	// declare variables
	int year;
	int month;
	int day;

	// constructor to create a Date object
	public Date(int aYear, int aMonth, int aDay) {
		year = aYear;
		month = aMonth;
		day = aDay;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	// get the string output of the Date object
	public String toString()
	{
		return "" + year + "/" + month + "/" + day;
	}

}
