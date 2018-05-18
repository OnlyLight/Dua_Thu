package bai7_2;

import java.util.ArrayList;
import java.util.List;

import bai4_4.Point;

public class PolyLine {
	private List<Point> points;

	public PolyLine() {
		super();
		points = new ArrayList<Point>();
	}

	public PolyLine(List<Point> points) {
		super();
		this.points = points;
	}
	
	public void appendPoint(int x, int y) {
		Point newPoint = new Point(x, y);
		points.add(newPoint);
	}
	
	public void appendPoint(Point point) {
		points.add(point);
	}
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		for (Point aPoint : points) {
			sb.append(aPoint.toString());
		}
		sb.append("}");
		return sb.toString();
	}
}
