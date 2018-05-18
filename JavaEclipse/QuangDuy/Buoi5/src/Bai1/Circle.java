package Bai1;

import java.util.Scanner;

public class Circle extends Shap {

	double radius;
	Scanner a = new Scanner(System.in);
	@Override
	public void input() {
		radius = a.nextDouble();
	}

	@Override
	public double getArea() {
		return super.Pi * radius * radius;
	}

	@Override
	public double getVolume() {
		return 0;
	}

}
