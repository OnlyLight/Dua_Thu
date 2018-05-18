package bai2_3;

public class MyPoint {
	private int x;
	private int y;
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int[] getXY() {
		int[] arrays = new int[2];
		arrays[0] = this.x;
		arrays[1] = this.y;
		return arrays;
	}
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + "]";
	}
	public double distance(int x, int y) {
		return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
	}
	public double distance(MyPoint another) {
		return Math.sqrt(Math.pow((this.x - another.x), 2) + Math.pow((this.y - another.y), 2));
	}
	public double distance() {
		return Math.sqrt(Math.pow((this.x - 0), 2) + Math.pow((this.y - 0), 2));
	}
}
