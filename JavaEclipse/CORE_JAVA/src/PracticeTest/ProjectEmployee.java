package PracticeTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProjectEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("123", "John", 19, 1000); // Gan du lieu cho doi tuong 1.
		Employee e2 = new Employee("113", "David", 22, 4000); // Gan du lieu cho doi tuong 2.
		
		System.out.println("------------------BEFORE UPDATE------------------");
		e1.showData();
		e2.showData();
		
		System.out.println("------------------AFTER UPDATE------------------");
		e1.upgradeSalary(5000); // Update salary doi tuong 1
		e2.upgradeSalary(10000); // Update salary doi tuong 2
		
		e1.changeAge(22); // Update age doi tuong 1
		e2.changeAge(28); // Update age doi tuong 2
		
		e1.showData();
		e2.showData();
		
		int luaChon; // Bien dung de xet chon sort age hay sort salary.
		boolean check = true; // Bien dung de kiem tra nhap lua chon nao.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------NHAP LUA CHON------------------");
		System.out.println("1. SORT AGE");
		System.out.println("2. SORT SALARY");
		
		while(true) { // Vong lap dung de nhap lai khi nhap khac kieu du lieu.
			try {
				while(check) { // Vong lap dung de nhap lai khi lua chon khac 1 hoac 2.
					luaChon = Integer.parseInt(sc.nextLine());
					if (luaChon == 1) {
						sortAge(e1, e2);
						check = false;
					} else if (luaChon == 2) {
						sortSalary(e1, e2);
						check = false;
					} else {
						System.out.println("Chon 1 hoac 2 !! Xin nhap lai !!");
					}
				}
			} catch (NumberFormatException e) {
				System.out.println("Nhap sai dinh dang !! Xin nhap lai !!");
			}
			
			if (check == false) break; // Dung chuong trinh.
		}
		
	}
	
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