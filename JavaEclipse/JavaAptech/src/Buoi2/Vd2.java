package Buoi2;

import java.util.Scanner;

public class Vd2 {
	
	public static void main(String[] args) {
		
//		int first = 400, second = 700, result;
//		result = first + second;
//		
//		if (result > 1000) {
//			second = second + 100;
//		}
//		System.out.println("the value of second is: " + second);
		
//		int i = 15;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so o day nhe: ");
		int num = sc.nextInt();
		
		if ((num % 3 != 0) || (num % 5 != 0))
			System.out.println("So 15 ko chia het cho 3 va 5");
		else
			System.out.println("So 15 chia het cho 3 va 5");
	}
}
