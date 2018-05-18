package Buoi5_JavaBasic;

import java.util.Scanner;

public class Casio {
	private int a, b;
	private Scanner scanner;
	
	public void nhap() {
		scanner = new Scanner(System.in);
		
		System.out.println("Nhap vao so thu 1: ");
		a = scanner.nextInt();
		
		do{
			System.out.println("Nhap vao so thu 2: ");
			b = scanner.nextInt();
			
			if(b <= 0) {
				System.out.println("Nhap lai b !! b phai lon hon 0 !!");
			}
		}while(b <= 0);
	}
	
	public int cong () {
		return a + b;
	}
	
	public int tru () {
		return a - b;
	}
	
	public int nhan () {
		return a * b;
	}
	
	public float chia () {
		return a / (float)b;
	}
	
	public String toString() {
		return "\nCong: " + cong() + "\nTru: " + tru() + "\nNhan: " + nhan() + "\nChia: " + chia();
	}
	
	public void soSanh() {
		if(a < b) System.out.println(a < b);
		else if(a == b) System.out.println(a = b);
		else System.out.println(a > b);
	}
	
	public static void main(String[] args) {
		Casio mayTinh = new Casio();
		mayTinh.nhap();
		System.out.println(mayTinh);
		mayTinh.soSanh();
	}
};
/*
 * Bài 1;
 * Tạo class sinh viên có 2 thuộc tính: Tên, Điểm 
 * Viết 1 method nhập, 
 * 1 methodin ra dữ liệu, 1 main run
 * 
 * Bài 2:
 * Tiếp tục casio
 * Thực hiện: Viết phương thức so sánh number 1 và number 2*/
