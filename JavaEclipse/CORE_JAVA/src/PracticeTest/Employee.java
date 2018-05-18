package PracticeTest;

public class Employee {
	private String empId;
	private String name;
	private int age;
	private int salary;
	
	public Employee(String empId, String name, int age, int salary) {
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee() {
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int upgradeSalary(int salary) {
		this.salary = salary;
		return salary;
	}
	
	public  int changeAge(int age) {
		this.age = age;
		return age;
	}
	
	public void showData() {
		System.out.println("\nID: " + empId);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
	}
}
