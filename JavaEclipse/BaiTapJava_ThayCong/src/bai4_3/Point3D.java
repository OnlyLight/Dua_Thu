package bai4_3;

public class Point3D extends Point2D {
	private float x = 0.0f;

	public Point3D(float x) {
		super();
		this.x = x;
	}

	public Point3D(float x, float y, float x2) {
		super(x, y);
		x = x2;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Point3D [x=" + x + "]";
	}
	
}
