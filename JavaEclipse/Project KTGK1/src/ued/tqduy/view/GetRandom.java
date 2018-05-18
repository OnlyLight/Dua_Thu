package ued.tqduy.view;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GetRandom {	
	public static void randomNumKb() {
		ArrayList<Integer> arrRandom = new ArrayList<>();
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int soLuong = 0 ,soDau = 0, soCuoi = 0, range, dem = 0;
		
		do {
			System.out.println("Số lượng lấy random: ");
			soLuong = Integer.parseInt(sc.nextLine());
			
			if (soLuong <= 0) {
				System.out.println("Số lượng quá nhỏ !!");
			}
		} while (soLuong <= 0);
		
		do {
			System.out.println("Khoang can lay (So Dau): ");
			soDau = Integer.parseInt(sc.nextLine());
			
			System.out.println("Khoang can lay (So Cuoi): ");
			soCuoi = Integer.parseInt(sc.nextLine());
			
			range = soCuoi - soDau + 1;
			
			if(range < soLuong) {
				System.out.println("Khoảng cần lấy quá nhỏ !!");
			}
		} while (range < soLuong);
		
		for(int i = soDau; i <= soCuoi; ++i) {
			arrRandom.add(i);
		}
		
		for(int i = 0; i < soLuong; i++) {
			int position = rn.nextInt(arrRandom.size());
			System.out.println(arrRandom.get(position));
			arrRandom.remove(position);
			dem++;
			if (dem == soLuong) {
				return;
			}
		}
	}
	
	public static void randomNum(int soDau, int soCuoi) {
		int randomNum = 0;
		int dem = 0;
		ArrayList<Integer> arrRandom = new ArrayList<>();
		Random rn = new Random();
		
		for(int i = soDau; i <= soCuoi; ++i) {
			arrRandom.add(i);
		}
		
		for(int i = 0; i < 3; i++) {
			int position = rn.nextInt(arrRandom.size());
			randomNum = arrRandom.get(position);
			arrRandom.remove(position);
			
			switch (randomNum) {
			case 0:
				System.out.println("Monday");
				break;
			case 1:
				System.out.println("Tuesday");
				break;
			case 2:
				System.out.println("We");
				break;
			case 3:
				System.out.println("Thursday");
				break;
			case 4:
				System.out.println("Friday");
				break;
			case 5:
				System.out.println("Saturday");
				break;
			case 6:
				System.out.println("Sunday");
				break;
			}
			
			dem++;
			if (dem == 3) {
				break;
			}
		}
		
//		return randomNum;
	}
	
	public static void main(String[] args) {
//		randomNumKb();
//		System.out.println(randomNum(0, 7));
	}
}
