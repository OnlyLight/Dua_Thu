package Buoi4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProjectStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student st1 = new Student("123", "Duy", "Cntt", 10, 10);
		Student st2 = new Student("124", "Huyen", "VHH", 9, 9);
		
		ArrayList<Student> arrStu = new ArrayList<>();
		
		System.out.println("Enter number of Strudent: ");
		int n = Integer.parseInt(sc.nextLine());
		
		boolean check = true;
		while(check) {
			try {
				for (int i = 0; i < n; i++) {
					System.out.println("-----------------Nhap SV-----------------");
					System.out.println("Enter ID: ");
					String id = sc.nextLine();
					System.out.println("Enter Name: ");
					String name = sc.nextLine();
					System.out.println("Enter Class: ");
					String grade = sc.nextLine();
					System.out.println("Enter Diem 1: ");
					float point1 = Float.parseFloat(sc.nextLine());
					System.out.println("Enter Diem 2: ");
					float point2 = Float.parseFloat(sc.nextLine());
					
					if(id.equals("") || name.equals("") || grade.equals("")) {
						System.out.println("Thieu du lieu !!");
						check = true;
					} else {
						arrStu.add(new Student(id, name, grade, point1, point2));
						check = false;
					}
				}
			} catch (NumberFormatException e) {
				System.out.println("Nhap sai du lieu !!!");
			}
		}
		
		sc.close();
		
		for (Student student : arrStu) {
			System.out.println("-----------------Thong tin SV " + student.getStud_name() + "-----------------");
			System.out.println("ID: " + student.getStud_id());
			System.out.println("Name: " + student.getStud_name());
			System.out.println("Class: " + student.getStud_class());
			System.out.println("Diem 1: " + student.getPoint1());
			System.out.println("Diem 2: " + student.getPoint2());
		}
		
		Collections.sort(arrStu, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.tinhDTB() > o2.tinhDTB()) {
					return 1;
				} else {
					if (o1.tinhDTB() == o2.tinhDTB()) {
						return 0;
					} else {
						return -1;
					}
				}
			}
		});
		
		System.out.println("-----------------Thong tin SV sau khi sap xep-----------------");
		
		for (Student student : arrStu) {
			System.out.println("\n\nID: " + student.getStud_id());
			System.out.println("Name: " + student.getStud_name());
			System.out.println("Class: " + student.getStud_class());
			System.out.println("Diem 1: " + student.getPoint1());
			System.out.println("Diem 2: " + student.getPoint2());
		}
	}
}
