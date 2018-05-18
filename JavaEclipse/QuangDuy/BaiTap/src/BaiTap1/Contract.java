package BaiTap1;

public class Contract extends Employee{

	private double gradeSalary;
	public Contract(int id, String fullname, BirthDay birthDay, double allowance, double gradeSalary) {
		super(id, fullname, birthDay, allowance);
		this.gradeSalary = gradeSalary;
	}

	public void setGradeSalary(double gradeSalary) {
		this.gradeSalary = gradeSalary;
	}
	public double getGradeSalary() {
		return this.gradeSalary;
	}
	@Override
	public void computerSalary() {
		super.setSalary(gradeSalary + super.getAllowance());
	}
	public String toString(){
		return super.getId()+" "+ super.getFullname() + " "+super.getBirthDay()+ " " +super.getAllowance() + " "+ this.gradeSalary;
	}	
}
