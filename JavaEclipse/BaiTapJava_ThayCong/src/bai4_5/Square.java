package bai4_5;

public class Square extends Shape {
	private double side;

	public Square() {
		super();
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	public Square(String color, boolean filled, double side) {
		super(color, filled);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
}
