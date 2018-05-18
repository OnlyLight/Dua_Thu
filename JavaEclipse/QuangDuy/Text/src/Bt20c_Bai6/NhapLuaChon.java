package Bt20c_Bai6;

import java.util.Scanner;

public class NhapLuaChon {
	public static void nhap() {
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		String tiepTuc = "";
		
		while(true) {
			System.out.println("---------------Xin hay nhap lua chon---------------");
			System.out.println("1. Hinh tron");
			System.out.println("2. Hinh tam giac");
			System.out.println("3. Hinh chu nhat");
			
			do {
				try {
					System.out.println("Lua chon cua ban la: ");
					luaChon = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("Xin hay nhap so !! Xin nhap lai !!");
				}
				
				if (luaChon < 1 || luaChon > 3) {
					System.out.println("Hay nhap lua chon !!");
				}
			}while(luaChon < 1 || luaChon > 3);
			
			if (luaChon == 1) {
				HinhTron ht = new HinhTron();
				ht.nhap();
				System.out.println(ht);
			}
			else if (luaChon == 2) {
				HinhTamGiac tg = new HinhTamGiac();
				tg.nhap();
				if (tg.checkTg()) {
					System.out.println(tg);
				} else {
					System.out.println("Day khong phai tam giac !!");
				}
			}
			else if (luaChon == 3) {
				HinhChuNhat hcn = new HinhChuNhat();
				hcn.nhap();
				System.out.println(hcn);
			}
			else {
				System.out.println("Xin chon lai !!");
			}
			
			System.out.println("-------------------------------------------------");
			System.out.print("Ban Co Muon Tiep Tuc(Bam phim bat ki de tiep tuc hoac Bam k de dung): ");
			tiepTuc = sc.nextLine();
			
			if (tiepTuc.equals("K") || tiepTuc.equals("k") || tiepTuc.equals("Khong") || tiepTuc.equals("khong")) {
				break;
			}
		}
	}
}
