package bai5_1;

import bai4_4.Point;

public class Line {
	private Point begin;
	private Point end;
	public Line() {
		super();
	}
	public Line(Point begin, Point end) {
		super();
		this.begin = begin;
		this.end = end;
	}
	public Point getBegin() {
		return begin;
	}
	public void setBegin(Point begin) {
		this.begin = begin;
	}
	public Point getEnd() {
		return end;
	}
	public void setEnd(Point end) {
		this.end = end;
	}
	@Override
	public String toString() {
		return "Line [begin=" + begin + ", end=" + end + "]";
	}
}
