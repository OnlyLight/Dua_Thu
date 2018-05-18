package Bai1_1;

import java.util.Scanner;

public class Cau_1 {
	public static void main(String[] args) {
		int so;
		System.out.println("Nhap vào số nguyên dương (100 - 999): ");

		do{
			Scanner n = new Scanner(System.in);
			so = n.nextInt();
			
			if(so < 100 || so > 999) {
				System.out.println("Nhap lai !!");
			}
		}while(so < 100 || so > 999);
		
		int soDau = so / 100;
		int hangChuc = (so / 10) % 10;
		so %= 10; 
		System.out.println(soDau + " trăm" + hangChuc + " chục" + so + " đơn vị");
	}
}
