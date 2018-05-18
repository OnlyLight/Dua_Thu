package Bai1_1;

import java.util.Scanner;

public class Cau_2 {
	private int so;
	private int tong = 0;
	private int check = 0;
	
	public boolean kiemTraSoAmstrong() {
		while(so > 0) {
			tong += Math.pow((double)so % 10, 3);
			so /= 10;
		}
		
		if(tong == so) {
			return true;
		}
		return false;
	}
	
	public void nhap() {
		System.out.println("Nhap vào số nguyên dương (100 - 999): ");

		do{
			Scanner n = new Scanner(System.in);
			so = n.nextInt();
			
			if(so < 100 || so > 999) {
				System.out.println("Nhap lai !!");
			}
		}while(so < 100 || so > 999);
	}
	
	public void xuatRaSoAmstrong() {
		for(int i = 0; i <= 999; i++) {
			if(kiemTraSoAmstrong()) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Cau_2 c2 = new Cau_2();
		c2.nhap();
		c2.kiemTraSoAmstrong();
		c2.xuatRaSoAmstrong();
	}

}
