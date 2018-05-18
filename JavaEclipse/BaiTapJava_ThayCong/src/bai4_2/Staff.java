package bai4_2;

public class Staff extends Person {
	private String school;
	private double pay;
	public Staff(String school, double pay) {
		super();
		this.school = school;
		this.pay = pay;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "Staff [school=" + school + ", pay=" + pay + "]";
	}
	
}
