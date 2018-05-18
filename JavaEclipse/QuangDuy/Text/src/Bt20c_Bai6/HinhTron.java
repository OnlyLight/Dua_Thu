package Bt20c_Bai6;

import java.util.Scanner;

public class HinhTron {
	private double banKinh;
	private final double pi = Math.PI;

	public HinhTron(double banKinh) {
		super();
		this.banKinh = banKinh;
	}

	public HinhTron() {
		super();
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	
	public double chuViHinhTron() {
		return 2 * this.banKinh * this.pi;
	}
	
	public double dienTichHinhTron() {

		return this.pi * this.banKinh;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				System.out.println("Nhap ban kinh: ");
				this.banKinh = Double.parseDouble(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Xin hay nhap so !!");
			}
			
			if (this.banKinh < 0) {
				System.out.println("Xin hay nhap lai !! Ban kinh luon duong");
			}
		}while (this.banKinh < 0);
	}
	
	public String toString() {
		return DataUtil.CHU_VI_HINH_TRON + " hinh tron la: " + chuViHinhTron() + "\n" + DataUtil.DIEN_TICH_HINH_TRON + " la: " + dienTichHinhTron();
	}
}
