package bai3_1;

public class MyComplex {
	private double real = 0.0;
	private double imag = 0.0;
	public MyComplex() {
		super();
	}
	public MyComplex(double real, double imag) {
		super();
		this.real = real;
		this.imag = imag;
	}
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImag() {
		return imag;
	}
	public void setImag(double imag) {
		this.imag = imag;
	}
	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	@Override
	public String toString() {
		return "MyComplex [real=" + real + ", imag=" + imag + "]";
	}
	public boolean isReal() {
		return (this.imag==0);
	}
	public boolean isImaginary() {
		return (this.imag==0);
	}
	public boolean equals(double real, double imag) {
		return (this.real == real && this.imag == imag);
	}
	public boolean equals(MyComplex another) {
		return (this.real == another.real && this.imag == another.imag);
	}
	public double magnitude() {
		return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imag, 2));
	}
	public double argument() {
		return Math.atan2(this.real, this.imag);
	}
	public MyComplex add (MyComplex right) {
		return this;
	}
	public MyComplex addNew(MyComplex right) {
		return new MyComplex();
	}
	public MyComplex subNew(MyComplex right) {
		return new MyComplex();
	}
}
