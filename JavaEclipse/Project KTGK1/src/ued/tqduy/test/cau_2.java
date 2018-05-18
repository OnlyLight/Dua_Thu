package ued.tqduy.test;

import java.util.ArrayList;

import ued.tqduy.model.Student;

public class cau_2 {
	public static void main(String[] args) {
		
		System.out.println("TRẦN QUANG DUY");
		Student st1 = new Student("Senglath Bounyalid", 20);
		Student st2 = new Student("Huỳnh Đức Tài", 23);
		Student st3 = new Student("Phạm Ngọc Thanh Tài", 19);
		
		Student.list.add(st1);
		Student.list.add(st2);
		Student.list.add(st3);
		
		Student.sort2();
	}
	
}
