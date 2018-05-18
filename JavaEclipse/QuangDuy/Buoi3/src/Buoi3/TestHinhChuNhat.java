package Buoi3;

import javax.print.attribute.standard.PrinterLocation;

public class TestHinhChuNhat {

	public static void main(String[] args) {
		HinhChuNhat hcn = new HinhChuNhat();
		hcn.setChieuDai(2);
		hcn.setChieuRong(3);
		System.out.println("Chu vi hinh chu nhat: "+hcn.tinhChuVi());
		System.out.println("Dien tich hinh chu nhat: " +hcn.tinhDienTich());
		System.out.println(hcn);
	}

}
