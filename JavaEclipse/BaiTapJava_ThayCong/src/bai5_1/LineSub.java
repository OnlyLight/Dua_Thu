package bai5_1;

import bai4_4.Point;

public class LineSub extends Point {
	private Point end;

	public LineSub() {
		super();
	}

	public LineSub(Point end) {
		super();
		this.end = end;
	}

	public LineSub(float x, float y, Point end) {
		super(x, y);
		this.end = end;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "LineSub [end=" + end + "]";
	}
	
}
