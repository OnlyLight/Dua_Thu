package PracticeTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public final class DataDetail {
	public static void sortSalary(Employee e1, Employee e2) { // method dung de sap xep doi tuong theo Salary.
		ArrayList<Employee> arrEmp = new ArrayList<>();
		arrEmp.add(e1);
		arrEmp.add(e2);
		
		// Sort Salary
		Collections.sort(arrEmp, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.getSalary() < e2.getSalary()) {
					return 1;
				} else {
					if (e1.getSalary() == e2.getSalary()) {
						return 0;
					} else {
						return -1;
					}
				}
			}
		});
		
		System.out.println("------------------AFTER SORT SALARY------------------");
		for (Employee employee : arrEmp) {
			System.out.println("\nID: " + employee.getEmpId());
			System.out.println("Name: " + employee.getName());
			System.out.println("Age: " + employee.getAge());
			System.out.println("Salary: " + employee.getSalary());
		}
	}
	
	public static void sortAge(Employee e1, Employee e2) { // method dung de sap xep doi tuong theo Age.
		
		ArrayList<Employee> arrEmp = new ArrayList<>();
		arrEmp.add(e1);
		arrEmp.add(e2);
		
		// Sort Age
		Collections.sort(arrEmp, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.getAge() < e2.getAge()) {
					return 1;
				} else {
					if (e1.getAge() == e2.getAge()) {
						return 0;
					} else {
						return -1;
					}
				}
			}
		});
		
		System.out.println("------------------AFTER SORT AGE------------------");
		for (Employee employee : arrEmp) {
			System.out.println("\nID: " + employee.getEmpId());
			System.out.println("Name: " + employee.getName());
			System.out.println("Age: " + employee.getAge());
			System.out.println("Salary: " + employee.getSalary());
		}
	}
}
