package Bai6_3;

public class MovableCircle implements Movable {
	private MovablePoint center;
	private int radius;
	

	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		center = new MovablePoint(x, y, xSpeed, ySpeed);
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		center.y -= center.ySpeed;
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		
	}

}
