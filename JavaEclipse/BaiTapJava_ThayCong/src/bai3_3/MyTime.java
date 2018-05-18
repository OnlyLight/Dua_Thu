package bai3_3;

public class MyTime {
	private int hour;
	private int minute;
	private int second;
	public MyTime() {
	}
	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public void setTime(int hour, int minute, int second) {
		if(hour < 0 || hour > 23) System.out.println("Invalid hour");
		else if(minute < 0 || minute > 59) System.out.println("Invalid minute");
		else if(second < 0 || second > 59) System.out.println("Invalid second");
		else System.out.println("Valid");
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	@Override
	public String toString() {
		return "MyTime [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}
	public MyTime nextSecond() {
		if(this.hour == 23 || this.minute == 59 || this.second == 59) {
			this.hour = 0;
			this.minute = 0;
			this.second = 0;
		} else {
			++this.second;
		}
		return new MyTime(this.hour, this.minute, this.second);
	}
	public MyTime nextMinute() {
		if(this.hour == 23 || this.minute == 59 || this.second == 59) {
			this.hour = 0;
			this.minute = 0;
			this.second = 0;
		} else {
			++this.minute;
		}
		return new MyTime(this.hour, this.minute, this.second);
	}
	public MyTime nextHour() {
		if(this.hour == 23 || this.minute == 59 || this.second == 59) {
			this.hour = 0;
			this.minute = 0;
			this.second = 0;
		} else {
			++this.hour;
		}
		return new MyTime(this.hour, this.minute, this.second);
	}
}
