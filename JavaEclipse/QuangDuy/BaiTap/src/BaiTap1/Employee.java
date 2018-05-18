package BaiTap1;

public abstract class Employee{
	private int id;
	private String fullname;
	private BirthDay birthDay;
	private double allowance;
	private double salary;
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary() {
		return this.salary;
	}
	public abstract void computerSalary();
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getFullname() {
		return this.fullname;
	}
	public void setBirthDay (BirthDay birthDay) {
		this.birthDay = birthDay;
	}
	public BirthDay getBirthDay() {
		return this.birthDay;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	public double getAllowance() {
		return this.allowance;
	}
	
	public Employee(int id, String fullname, BirthDay birthDay, double allowance) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.birthDay = birthDay;
		this.allowance = allowance;
	}
	public String toString () {
		return this.id + "\n" + this.fullname + "\n" + this.birthDay+ "\n" + this.allowance;
	}
}
