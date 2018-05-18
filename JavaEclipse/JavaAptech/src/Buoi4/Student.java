package Buoi4;

import java.util.Collection;

public class Student {
	private String stud_id;
	private String stud_name;
	private String stud_class;
	private float point1;
	private float point2;
	
	public Student() {
	}

	public Student(String stud_id, String stud_name, String stud_class, float point1, float point2) {
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.stud_class = stud_class;
		this.point1 = point1;
		this.point2 = point2;
	}

	public String getStud_id() {
		return stud_id;
	}

	public void setStud_id(String stud_id) {
		this.stud_id = stud_id;
	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public String getStud_class() {
		return stud_class;
	}

	public void setStud_class(String stud_class) {
		this.stud_class = stud_class;
	}

	public float getPoint1() {
		return point1;
	}

	public void setPoint1(float point1) {
		this.point1 = point1;
	}

	public float getPoint2() {
		return point2;
	}

	public void setPoint2(float point2) {
		this.point2 = point2;
	}

	public void printCollection(Collection<?> collection) {
		for (Object object : collection) {
			System.out.println(object.toString());
		}
	}
	
	public float tinhDTB() {
		return (this.point1 + this.point2)/2;
	}
}
