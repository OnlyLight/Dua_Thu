package Buoi5_JavaBasic;

import java.util.Scanner;

public class SinhVien {
	private String ten;
	private float diemToan;
	private Scanner scanner;
	
	public void nhap() {
		System.out.println("Nhập tên: ");
		ten = scanner.nextLine();
		
		do{
			System.out.println("Nhập điểm toán: ");
			diemToan = scanner.nextFloat();
			
			if(diemToan < 0 || diemToan > 10) {
				System.out.println("Nhập lại !! Điểm phải lớn hơn 0 hoặc phải nhỏ hơn 10");
			}
		}while(diemToan < 0 || diemToan > 10);
	}
	
	public String toString() {
		return "\nTên: " + ten + "\nĐiểm Toán: " + diemToan;
	}

	public static void main(String[] args) {
		SinhVien sv = new SinhVien();
		sv.nhap();
		System.out.println(sv);
	}

}
