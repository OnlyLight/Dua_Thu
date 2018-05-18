package bai2_4;

import bai2_3.MyPoint;

public class MyCircle extends MyPoint{
	private MyPoint center;
	private int radius;
	public MyCircle() {
		super();
		this.center = new MyPoint(0, 0);
		this.radius = 1;
	}
	public MyCircle(int x, int y, int radius) {
		super();
		this.setX(x);
		this.setY(y);
		this.radius = radius;
	}
	public MyCircle(MyPoint center, int radius) {
		super();
		this.center = center;
		this.radius = radius;
	}
	public MyPoint getCenter() {
		return center;
	}
	public void setCenter(MyPoint center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getCenterX() {
		return center.getX();
	}
	public void setCenterX(int x) {
		this.center.setX(x);
	}
	public int getCenterY() {
		return center.getY();
	}
	public void setCenterY(int y) {
		this.center.setY(y);
	}
	public int[] getCenterXY() {
		int[] arrays = new int [2];
		arrays[0] = center.getX();
		arrays[1] = center.getY();
		return arrays;
	}
	public void setCenterXY(int x, int y) {
		this.center.setX(x);
		this.center.setY(y);
	}
	@Override
	public String toString() {
		return "MyCircle [center=" + center + ", radius=" + radius + "]";
	}
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	public double getCircumference() {
		return Math.PI * 2 * this.radius;
	}
	public double distance(MyCircle another) {
		return Math.sqrt(Math.pow((this.center.getX() - another.center.getX()), 2) + Math.pow((this.center.getY() - another.center.getY()), 2));
	}
}
