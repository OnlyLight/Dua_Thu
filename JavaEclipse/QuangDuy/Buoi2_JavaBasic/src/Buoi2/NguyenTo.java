package Buoi2;

import java.util.Scanner;

public class NguyenTo {
	private int so;
	
	public boolean kiemTraSoNguyenTo(int so) {
		for(int i = 2; i <= so/2; i++) {
			if(so % i != 0) return true;
		}
		return false;
	}
	
	public void nhap() {
		do{
			System.out.println("Nhap vao so nguyen: ");
			Scanner n = new Scanner(System.in);
			int so = n.nextInt();
			
			if(so <= 0) {
				System.out.println("Nhap lai !!");
			}
		}while(so <= 0);
	}
	
	public void inRaSoNuyenTo() {
		if(so < 2) 
			System.out.println("Khong co so nguyen to");
		
		if(so == 2)
			System.out.println("2");
		
		for(int i = 1; i <= so; i++) {
			if(kiemTraSoNguyenTo(i)) {
				System.out.println(i);
			}
		}
	}

	public int getSo() {
		return so;
	}

	public void setSo(int so) {
		this.so = so;
	}

	public static void main(String[] args) {
		NguyenTo nt = new NguyenTo();
		/*nt.setSo(5);
		System.out.println(nt.getSo());*/
		
//		nt.nhap();
//		nt.inRaSoNuyenTo();
	}

}
