package BaiTap1;

public class Regular extends Employee{

	private int yearOfExperience;
	private double rate;
	private double basicSalary;
	
	public Regular(int id, String fullname, BirthDay birthDay, double allowance, int yearOfExperience, double basicSalary) {
		super(id, fullname, birthDay, allowance);
		this.yearOfExperience = yearOfExperience;
		this.basicSalary = basicSalary;
	}
	
	public int getYearOfExperience(){
		return this.yearOfExperience;
	}
	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	public double getRate() {
		return this.rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getBasicSalary() {
		return this.basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public void rate() {
		if(this.yearOfExperience>= 15) this.rate = 4.5;
		else if(this.yearOfExperience > 10) this.rate = 4.0;
		else if(this.yearOfExperience > 5) this.rate = 3.5;
		else this.rate = 3.0;
	}
	
	@Override
	public void computerSalary() {
		super.setSalary(this.rate*this.basicSalary + super.getAllowance());
	}
	
	public String toString () {
		return super.getId()+" "+ super.getFullname() + " "+super.getBirthDay()+ " " +super.getAllowance() + " "+ this.yearOfExperience+" "+this.rate+" "+super.getSalary();
	}
	

}
