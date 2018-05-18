package bai6_1;

public abstract class Shape {
	public String color;
	public boolean filled;
	public Shape() {
		super();
	}
	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public abstract double getArea();
	public abstract double Perimeter();
	@Override
	public abstract String toString();
}
