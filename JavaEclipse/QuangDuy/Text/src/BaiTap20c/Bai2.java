package BaiTap20c;

import java.util.Scanner;

public class Bai2 {
	private int soNguyen;
	private final int temp = soNguyen;	
	
	public Bai2() {
	}

	public Bai2(int soNguyen) {
		this.soNguyen = soNguyen;
	}

	public int getSoNguyen() {
		return this.soNguyen;
	}

	public void setSoNguyen(int soNguyen) {
		this.soNguyen = soNguyen;
	}
	
	public boolean kiemTraSoAmstrong(int soNguyen1) {
		final int temp = soNguyen1;
		int tong = 0;
		while (soNguyen1 > 0) {
			int tam = soNguyen1 % 10;
			soNguyen1 /= 10;
			
			tong += (int) Math.pow(tam, 3);
		}
		if (tong == temp) {
			return true;
		}
		return false;
	}
	
	public boolean kiemTraSoAmstrong() {
		int tong = 0;
		while (this.soNguyen > 0) {
			int tam = this.soNguyen % 10;
			this.soNguyen /= 10;
			
			tong += (int) Math.pow(tam, 3);
		}
			if (tong == this.temp) {
				return true;
			}
		return false;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Nhap so nguyen duong: ");
			this.soNguyen = Integer.parseInt(sc.nextLine());
		} catch(NumberFormatException ex) {
			System.out.println("Xin hay nhap so !!");
		}
	}
	
	public void xuatCacSoAmstrong() {
		System.out.println("So vua nhap " + kiemTraSoAmstrong() + " la so Amstrong !!");
		
		System.out.println("--------------Cac so Amstrong co trong doan tu 0 den 1000 la--------------");
		
		for(int i = 0; i <= 10000; i++) {
			if (kiemTraSoAmstrong(i)) {
				System.out.println(i);
			}
		}
	}
}
