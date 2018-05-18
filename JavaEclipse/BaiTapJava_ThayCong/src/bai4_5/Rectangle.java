package bai4_5;

public class Rectangle extends Shape {
	private double lenght = 1.0;
	private double width = 1.0;
	public Rectangle() {
		super();
	}
	public Rectangle(double lenght, double width) {
		super();
		this.lenght = lenght;
		this.width = width;
	}
	public Rectangle(String color, boolean filled, double lenght, double width) {
		super(color, filled);
		this.lenght = lenght;
		this.width = width;
	}
	public double getLenght() {
		return lenght;
	}
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Rectangle [lenght=" + lenght + ", width=" + width + "]";
	}
	public double getArea() {
		return this.lenght * this.width;
	}
	public double getPerimeter() {
		return (this.lenght + this.width) * 2;
	}
}
