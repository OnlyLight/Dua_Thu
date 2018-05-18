package bai8;

public class MyIntStack {
	private int[] contents;
	private int tos;
	
	public MyIntStack(int capacity) {
		this.contents = new int[capacity];
		this.tos = -1;
	}
	
	public void push(int element) {
		this.contents[++this.tos] = element;
	}
	
	public int pop() {
		return this.contents[--this.tos];
	}
	
	public int peek() {
		return this.contents[tos];
	}
	
	public boolean isEmpty() {
		return tos < 0;
	}
	
	public boolean isFull() {
		return this.tos == this.contents.length - 1;
	}
}
