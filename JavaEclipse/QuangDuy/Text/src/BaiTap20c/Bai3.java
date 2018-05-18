package BaiTap20c;

import java.util.Scanner;

public class Bai3 {
	private int so;
	private int luyThua;
	
	public Bai3() {
	}

	public Bai3(int so, int luyThua) {
		this.so = so;
		this.luyThua = luyThua;
	}

	public int getSo() {
		return this.so;
	}

	public void setSo(int so) {
		this.so = so;
	}

	public int getLuyThua() {
		return this.luyThua;
	}

	public void setLuyThua(int luyThua) {
		this.luyThua = luyThua;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Nhap so vao day: ");
			this.so = Integer.parseInt(sc.nextLine());
			
			System.out.println("Nhap vao luy thua: ");
			this.luyThua = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("Vui long nhap so nguyen !!");
		}	
	}

	public void tinhLuyThua() {
		int soNhanDuoc = 1;
		if (this.luyThua > 0) {
			for(int i = 0; i < this.luyThua; i++) {
				soNhanDuoc *= this.so;
			}
			System.out.println("Ket Qua sau luy thua la: " + soNhanDuoc);
		} 
		else if (this.luyThua == 0) {
			System.out.println("Ket Qua sau luy thua la: 1");
		}
		else if (this.luyThua < 0) {
			for(int i = 0; i < this.luyThua; i++) {
				soNhanDuoc *= this.so;
			}
			System.out.println("Ket Qua sau luy thua la: " + "1/" +soNhanDuoc);
		}
	}
}
