package menu;

import java.util.Scanner;
import PTB2.*;
import tinhtiendien.*;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------MENU---------------------");
		System.out.println("1. Giai PTB2");
		System.out.println("2. Tinh Tien Dien");
		System.out.println("Nhap lua chon: ");
		
		byte luaChon = Byte.parseByte(sc.nextLine());
		
		switch (luaChon) {
		case 1:
			PTB2Control pt = new PTB2Control();
			pt.nhap();
			pt.giaiPT();
			pt.printDetail();
			break;

		case 2:
			TienDienControl money = new TienDienControl();
			money.nhap();
			money.tinhSoTien();
			break;
			
		default:
			System.out.println("Lua chon khong co !!!");
			break;
		}
	}

}
