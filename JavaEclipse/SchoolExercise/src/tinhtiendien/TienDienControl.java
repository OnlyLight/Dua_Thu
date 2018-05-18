package tinhtiendien;

import java.util.Scanner;

public class TienDienControl {
	private TienDien tienDien = new TienDien();
	private TienDienView view = new TienDienView();
	
	public TienDienControl() {
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap so chu dien: ");
			tienDien.setSoDien(Float.parseFloat(sc.nextLine()));
			
			if (tienDien.getSoDien() < 0) {
				System.out.println("Xin nhap lai !! So dien >= 0");
			}
		} while (tienDien.getSoDien() < 0);
		System.out.println(tienDien.getSoDien());
	}
	
	public void tinhSoTien() {
		if (tienDien.getSoDien() < 50) {
			tienDien.setSoTienDien(tienDien.getSoDien()*1000);
			view.inSoTien(tienDien.getSoTienDien());
		} else {
			tienDien.setSoTienDien(50*1000 + (tienDien.getSoDien() - 50) * 1200);
			view.inSoTien(tienDien.getSoTienDien());
		}
	}
}
