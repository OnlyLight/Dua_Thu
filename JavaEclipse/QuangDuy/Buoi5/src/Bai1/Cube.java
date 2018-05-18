package Bai1;

import java.util.Scanner;

public class Cube extends Shap {
	double a, b, c;
	Scanner n = new Scanner(System.in);
	
	@Override
	public void input() {
		a = n.nextDouble();
		b = n.nextDouble();
		c = n.nextDouble();
	}
	
	@Override
	public double getArea() {
		return 2 * (a*b + b*c + c*a);
	}

	@Override
	public double getVolume() {
		return a * b * c;
	}
}
