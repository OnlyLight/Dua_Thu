package bai4_4;

public class MovablePoint extends Point {
	private float xSpeed = 0.0f;
	private float ySpeed = 0.0f;
	public MovablePoint() {
		super();
	}
	public MovablePoint(float xSpeed, float ySpeed) {
		super();
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public float getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}
	public float getySpeed() {
		return ySpeed;
	}
	public void setySpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
	@Override
	public String toString() {
		return "MovablePoint [xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}
	public MovablePoint move() {
		Point point = new Point();
		return new MovablePoint(point.getX()+this.xSpeed, point.getY()+this.ySpeed);
	}
}
