package Buoi1_Demo;

import java.util.Scanner;

public class Buoi1 {
	private int so;
	private String ten, tuoi;
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap so vao day di: ");
//		so = sc.nextInt();
		
		System.out.println("Nhap ten: ");
		ten = sc.next();
		
		System.out.println("Nhap tuoi: ");
		tuoi = sc.next();
	}
	
	public void inThongTin() {
		System.out.println("Tuoi do la: " + tuoi);
		System.out.println("Ten: " + ten);
	}
	
	public String toString() {
		return "Ten: " + ten + "\nTuoi: " + tuoi;
	}
	
	public static void main(String[] args) {
		Buoi1 may = new Buoi1();
		may.nhap();
//		may.inThongTin();
		System.out.println(may);
	}
}
