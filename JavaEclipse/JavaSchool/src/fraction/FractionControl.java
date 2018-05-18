package fraction;

import java.util.ArrayList;
import java.util.Scanner;

public class FractionControl {
//	public static int n;
	
	public static int getGCD(int a, int b) {
		int ucln = 0;
		int max = a > b ? a : b;
		int min = a < b ? a : b;
		
		if(max % min == 0) {
			ucln = min;
		}
		else {
			for(int i = min / 2; i > 1; i--) {
				if (max % i == 0 && min % i == 0) {
					ucln = i;
					break;
				}
			}
		}
		return ucln;
	}
	
	public static Fraction getReductFraction(Fraction fraction) {
		int ucln = getGCD(fraction.getTuSo(), fraction.getMauSo());
		int tuSoRutGon = fraction.getTuSo() / ucln;
		int mauSoRutGon = fraction.getMauSo() / ucln;
		fraction = new Fraction(tuSoRutGon, mauSoRutGon);
		return fraction;
	}
	
	public static void initArray(Fraction []arrFraction) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu: ");
		int n = Integer.parseInt(sc.nextLine());
		arrFraction = new Fraction[n];
		
		for(int i = 0; i < arrFraction.length; i++) {
			System.out.println(arrFraction.length);
			
//			System.out.println(i);
			
			System.out.println("Nhap phan so " + i + ": ");
			arrFraction[i].nhap();
			
//			System.out.println(arrFraction.length);
//			
//			System.out.println("Nhap mau so " + i + ": ");
//			arrFraction[i].setMauSo(Integer.parseInt(sc.nextLine()));
		}
	}
	
	public static Fraction sumFractionArray(ArrayList<Fraction> arrFraction) {
		Fraction sum = arrFraction.get(0);
		
		for(int i = 1; i < arrFraction.size(); i++) {
			sum = sum.tong(arrFraction.get(i));
		}
		return getReductFraction(sum);
	}
}