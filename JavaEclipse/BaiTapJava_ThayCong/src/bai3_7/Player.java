package bai3_7;

public class Player {
	private int number;
	private float x;
	private float y;
	private float z = 0.0f;
	public Player(int number, float x, float y, float z) {
		super();
		this.number = number;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void move(float xDisp, float yDisp) {
		this.x += this.x + xDisp;
		this.y += this.y + yDisp;
	}
	public void jump(float zDisp) {
		this.z += this.z + zDisp;
	}
	public boolean near(Ball ball) {
		double distance = (Math.sqrt(Math.pow(ball.getX() - this.x, 2) - Math.pow(ball.getY() - this.y, 2)));
		if(distance < 8) return true;
		return false;
	}
}
