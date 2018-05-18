package Buoi6_JavaBasic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VongLap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		while(true) {
//			System.out.println("Nhap vao thu: ");
//			int a = scanner.nextInt();
//			
//			if(a > 2 && a < 8) {
//				break;
//			}
//		}
		
		// equals: dùng để so sánh chuỗi
		/*char luaChon;
		do{
			System.out.println("Ban co muon out(c/k): ");
			// charAt để lấy kí tự đầu tiên trong chuỗi.
			luaChon = scanner.nextLine().charAt(0);
			
			if(luaChon == 'k' || luaChon == 'K') {
				break;
			}
			else {
				System.out.println("Nhap k/K di con cho !!");
			}
		}while(true);*/
		
		int n;
		while(true) {
			try{
				System.out.println("Nhap vao n(n > 0): ");
				n = scanner.nextInt();
				if(n > 0) {
					break;
				}
				else {
					System.out.println("Nhập lại nào !!");
				}
			}catch(InputMismatchException e){
				e.getMessage();
			} 
		}
		
		int i = 1;
		int Tong = 0;
		while(i <= n) {
			Tong += i;
			i++;
		}
		
		System.out.println("Tong: " + Tong);
	}

}
