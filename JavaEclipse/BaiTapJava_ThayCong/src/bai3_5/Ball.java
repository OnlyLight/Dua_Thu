package bai3_5;

public class Ball {
	private float x;
	private float y;
	private int radius;
	private float xDelta;
	private float yDelta;
	public Ball() {
		super();
	}
	public Ball(float x, float y, int radius, float xDelta, float yDelta) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.xDelta = xDelta;
		this.yDelta = yDelta;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public float getxDelta() {
		return xDelta;
	}
	public void setxDelta(float xDelta) {
		this.xDelta = xDelta;
	}
	public float getyDelta() {
		return yDelta;
	}
	public void setyDelta(float yDelta) {
		this.yDelta = yDelta;
	}
	@Override
	public String toString() {
		return "Ball [x=" + x + ", y=" + y + ", radius=" + radius + ", xDelta=" + xDelta + ", yDelta=" + yDelta + "]";
	}
	public void move() {
		this.x += this.xDelta;
		this.y = this.yDelta;
	}
	public void reflecHorizontal() {
		this.xDelta = -this.xDelta;
	}
	public void reflecVertical() {
		this.yDelta = -this.yDelta;
	}
	
}
