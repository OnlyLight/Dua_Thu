package Bai1;

import java.util.Scanner;

public class ShapList {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("Nhap vao n: ");
		int nShap = a.nextInt();
		
		if(nShap % 2 == 0) {
				Cube b = new Cube();
				System.out.println("Nhap canh: ");
				b.input();
				System.out.println("Dien tich hinh lap phuong la: "+b.getArea());
				System.out.println("The tich hinh lap phuong la: "+b.getVolume());
		}
		else { 
			Circle b = new Circle();
			System.out.print("Nhap ban kinh: ");
			b.input();
			System.out.println("Dien tich hinh tron: "+b.getArea());
			System.out.println("The tich hinh tron: "+b.getVolume());
			}
		}
	}
