package ued.tqduy.view;

import ued.tqduy.bussiness.Calculate;
import ued.tqduy.model.Fraction;

public class SubFraction {

	public static void main(String[] args) {
		Fraction fraction1 = new Fraction();
		fraction1.nhap();
		
		Fraction fraction2 = new Fraction();
		fraction2.nhap();
		
		System.out.println(Calculate.getReductFraction(fraction1.hieu(fraction2)));
	}

}
