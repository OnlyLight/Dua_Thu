package bai1_3;

public class Rectangle {
	private float lenght;
	private float width;
	public Rectangle() {
		this.lenght = 1.0f;
		this.width = 1.0f;
	}
	public Rectangle(float lenght, float width) {
		this.lenght = lenght;
		this.width = width;
	}
	public float getLenght() {
		return lenght;
	}
	public void setLenght(float lenght) {
		this.lenght = lenght;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public double getArea() {
		return this.lenght * this.width;
	}
	public double getPerimeter() {
		return (this.lenght + this.width) * 2;
	}
	@Override
	public String toString() {
		return "Rectangle [lenght=" + lenght + ", width=" + width + "]";
	}
	
}
