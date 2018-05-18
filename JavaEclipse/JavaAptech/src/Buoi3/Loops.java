package Buoi3;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		int dem = 1;
		int tong = 0;
		int nhap;
		Scanner sc = new Scanner(System.in);
//		while(dem <= 3) {
//			tong += dem;
//			dem++;
//		}
//		System.out.println("Tong la: " + tong);
//		System.out.println("So lan la: " + dem);
		
//		for (int i = 1; i <= 100; i++) {
//			tong += i;
//			System.out.println("Tong la: " + tong);
//		}
		
		int tich = 1;
		int i = 1;
//		for (;;) {
//			tich = 10*i;
//			System.out.print("10 * " + i + " = " +tich + "\t");
//			if (i == 5) {
//				System.out.println();
//			}
//			if (i >= 10) break;
//			i++;
//		}
		for(;;) {
			System.out.println("Nhap vao di nao: ");
			nhap = sc.nextInt();
			
			if(nhap == 0) {
				System.out.println("Da out !!");
				break;
			}
			System.out.println("Nhap lai nao !!");
		}
	}
}
