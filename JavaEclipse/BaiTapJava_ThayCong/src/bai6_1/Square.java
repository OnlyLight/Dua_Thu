package bai6_1;

public class Square extends Shape {
	private double side;
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public Square(String color, boolean filled, double side) {
		super(color, filled);
		this.side = side;
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	public Square() {
		super();
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double Perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
