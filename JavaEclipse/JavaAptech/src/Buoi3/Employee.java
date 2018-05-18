package Buoi3;

public class Employee {
	String empId;
	String name;
	String add;
	int salary;
	byte age;
	
	int displaySalary(int salary) {
		return salary;
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.salary = employee.displaySalary(10000);
		System.out.println("Salary: " + employee.salary);
	}
}
