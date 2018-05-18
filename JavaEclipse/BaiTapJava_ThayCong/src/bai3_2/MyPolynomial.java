package bai3_2;

public class MyPolynomial {
	private double[] coeffs;

	public MyPolynomial(double[] coeffs) {
		super();
		this.coeffs = coeffs;
	}
	public int getDegree() {
		return 1;
	}
	public double evaluate(double x) {
		return x;
	}
	public MyPolynomial add(MyPolynomial right) {
		return right;
	}
	public MyPolynomial multiply(MyPolynomial right) {
		return right;
	}
}
