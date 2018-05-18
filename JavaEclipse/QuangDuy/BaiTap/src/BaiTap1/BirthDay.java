package BaiTap1;

public class BirthDay {
	private int day;
	private int month;
	private int year;
	
	public void setDay(int day) {
		this.day = day;
	}
	public int getDay(){
		return this.day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getMonth(){
		return this.month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear(){
		return this.year;
	}
	public BirthDay(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}
}
