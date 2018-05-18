package bai3_4;

public class MyDate {
	private int year;
	private int month;
	private int day;
	private String[] strMonths = {"jan", "Feb", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	private String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	private int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public boolean isLeapYear(int year) {
		if((this.year % 4 == 0 && this.year != 100) || (this.year % 400 == 0)) {
			return true;
		}
		return false;
	}
	public boolean isValidDate(int year, int month, int day) {
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if(day > 31) return false;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if(day > 30) return false;
		} else {
			if(isLeapYear(year)) {
				if(day > 29) return false;
			}
		}
		return true;
	}
	public MyDate(int year, int month, int day, String[] strMonths, String[] strDays, int[] daysInMonths) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.strMonths = strMonths;
		this.strDays = strDays;
		this.daysInMonths = daysInMonths;
	}
	public MyDate() {
		super();
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
	public String[] getStrMonths() {
		return strMonths;
	}
	public void setStrMonths(String[] strMonths) {
		this.strMonths = strMonths;
	}
	public String[] getStrDays() {
		return strDays;
	}
	public void setStrDays(String[] strDays) {
		this.strDays = strDays;
	}
	public int[] getDaysInMonths() {
		return daysInMonths;
	}
	public void setDaysInMonths(int[] daysInMonths) {
		this.daysInMonths = daysInMonths;
	}
	
}
