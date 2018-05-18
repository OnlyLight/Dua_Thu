package fraction;

import java.util.ArrayList;
import java.util.Scanner;

public class FractionView {
	public static void main(String[] args) {
		Fraction fraction = new Fraction();
		fraction.nhap();
		Fraction fraction1 = new Fraction();
		fraction1.nhap();
		
		System.out.println(fraction.tong(fraction1));
//		int n = 0;
//	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap so phan tu: ");
//		n = Integer.parseInt(sc.nextLine());
//		FractionModel[] arrFraction = new FractionModel[n];
		
//		Fraction[] arrFraction = null;
//				
//		FractionControl.initArray(arrFraction);
		
//		System.out.println(n);
		
//		System.out.println(fraction.tong(fraction1));
//		System.out.println(FractionControl.getReductFraction(fraction.tong(fraction1)));

//		ArrayList<FractionModel> arrFraction = new ArrayList<>();
//		arrFraction.add(fraction);
//		arrFraction.add(fraction1);
//		
//		System.out.println(FractionControl.getReductFraction(FractionControl.sumFractionArray(arrFraction)));
	}
}
