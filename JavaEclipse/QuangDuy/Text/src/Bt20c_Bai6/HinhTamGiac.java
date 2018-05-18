package Bt20c_Bai6;

import java.util.Scanner;

public class HinhTamGiac {
	private double canh1, canh2, canh3;

	public HinhTamGiac() {
		super();
	}

	public HinhTamGiac(double canh1, double canh2, double canh3) {
		super();
		this.canh1 = canh1;
		this.canh2 = canh2;
		this.canh3 = canh3;
	}

	public double getCanh1() {
		return canh1;
	}

	public void setCanh1(double canh1) {
		this.canh1 = canh1;
	}

	public double getCanh2() {
		return canh2;
	}

	public void setCanh2(double canh2) {
		this.canh2 = canh2;
	}

	public double getCanh3() {
		return canh3;
	}

	public void setCanh3(double canh3) {
		this.canh3 = canh3;
	}
	
	public double chuViTamGiac() {
		return this.canh1 + this.canh2 + this.canh3;
	}
	
	public double dienTichTamGiac() {
		return (Math.sqrt(chuViTamGiac() * (chuViTamGiac() - this.canh1) * (chuViTamGiac() * this.canh2) * (chuViTamGiac() - this.canh3)));
	}
	
	public boolean checkTg() {
		if ((this.canh1 + this.canh2 < this.canh3) || (this.canh1 + this.canh3 < this.canh2) || (this.canh2 + this.canh3 < this.canh1)) {
			return false;
		}
		return true;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				System.out.println("Nhap canh 1: ");
				this.canh1 = Double.parseDouble(sc.nextLine());
				
				System.out.println("Nhap canh 2: ");
				this.canh2 = Double.parseDouble(sc.nextLine());
				
				System.out.println("Nhap canh 3: ");
				this.canh3 = Double.parseDouble(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Xin hay nhap so !!");
			}
			
			if (this.canh1 < 0 || this.canh2 < 0 || this.canh3 < 0) {
				System.out.println("Xin hay nhap lai !! Canh luon duong");
			}
	
		}while (this.canh1 < 0 || this.canh2 < 0 || this.canh3 < 0);
	}
	
	public String toString() {
		return DataUtil.CHU_VI_HINH_TGiac + " la: " + chuViTamGiac() + "\n" + DataUtil.DIEN_TICH_HINH_TGiac + " la: " + dienTichTamGiac();
	}
}
