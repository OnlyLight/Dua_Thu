package Bt20c_Bai6;

import java.util.Scanner;

public class HinhChuNhat {
	private double chieuDai, chieuRong;

	public HinhChuNhat() {
		super();
	}

	public HinhChuNhat(double chieuDai, double chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	public double chuViHCN() {
		return (this.chieuDai + this.chieuRong) * 2;
	}
	
	public double dienTichHCN() {
		return (this.chieuDai * this.chieuRong);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				System.out.println("Nhap chieu dai: ");
				this.chieuDai = Double.parseDouble(sc.nextLine());
				
				System.out.println("Nhap chieu rong: ");
				this.chieuRong = Double.parseDouble(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Xin hay nhap so !!");
			}
			
			if (this.chieuDai < 0 || this.chieuRong < 0) {
				System.out.println("Xin hay nhap lai !! Canh luon duong");
			}
	
		}while (this.chieuDai < 0 || this.chieuRong < 0);
	}
	
	public String toString() {
		return DataUtil.CHU_VI_HCN + " la: " + chuViHCN() + "\n" + DataUtil.DIEN_TICH_HCN + " la: " + dienTichHCN();
	}
}
