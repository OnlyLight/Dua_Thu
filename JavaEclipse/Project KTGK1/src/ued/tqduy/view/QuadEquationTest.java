package ued.tqduy.view;

import ued.tqduy.bussiness.QuadEquationCalculate;

public class QuadEquationTest {
	public static void main(String[] args) {
		QuadEquationCalculate calculate = new QuadEquationCalculate();
		calculate.nhap();
		calculate.giaiPT();
		calculate.printDetail();
	}
}
