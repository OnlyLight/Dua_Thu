package Buoi6_JavaBasic;

import java.util.Scanner;

public class CauLenhDieuKien_ReNhanh {
	private int n;
	private Scanner scanner;
	
	public void nhap() {
		scanner = new Scanner(System.in);
		do{
			System.out.println("Nhập vào thứ cần in ra: ");
			n = scanner.nextInt();
			
			if(n <= 1 || n > 8) {
				System.out.println("Nhap lai !!");
			}
		}while(n <= 1 || n > 8);
	}
	
	public void kiemTraThu() {
		
		// Sử dụng if khi không có trường hợp ngoại lệ phải xét hết trường hợp
		if(n == 2) System.out.println("Hôm nay là thứ hai");
		else if(n == 3) System.out.println("Hôm nay là thứ Ba");
		else if(n == 4) System.out.println("Hôm nay là thứ Bốn");
		else if(n == 5) System.out.println("Hôm nay là thứ Năm");
		else if(n == 6) System.out.println("Hôm nay là thứ Sáu");
		else if(n == 7) System.out.println("Hôm nay là thứ Bảy");
		else System.out.println("Hôm nay là Chủ nhật");
	}

	public static void main(String[] args) {
		CauLenhDieuKien_ReNhanh ie = new CauLenhDieuKien_ReNhanh();
		ie.nhap();
		ie.kiemTraThu();
	}

}
