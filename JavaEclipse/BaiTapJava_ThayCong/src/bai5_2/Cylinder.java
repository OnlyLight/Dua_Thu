package bai5_2;

public class Cylinder {
	private Circle base;
	private double height;
	public Cylinder() {
		super();
		base = new Circle();
		height = 1.0;
	}
	public Cylinder(Circle base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	public Circle getBase() {
		return base;
	}
	public void setBase(Circle base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Cylinder [base=" + base + ", height=" + height + "]";
	}
	
	
}
