package PTB2;

import java.util.Scanner;

// aX^2 + bX + c = 0
public class PTB2Control {
	private PTB2 model = new PTB2();
	private double x, x1, x2;
	private int check;
	private float a, b, c;
	
	public PTB2Control() {
	}

	public PTB2Control(PTB2 model, double x, double x1, double x2, int check) {
		this.model = model;
		this.x = x;
		this.x1 = x1;
		this.x2 = x2;
		this.check = check;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		model.setA(Float.parseFloat(sc.nextLine()));
		
		System.out.println("Nhap b: ");
		model.setB(Float.parseFloat(sc.nextLine()));
		
		System.out.println("Nhap c: ");
		model.setC(Float.parseFloat(sc.nextLine()));
	}
	
	public void giaiPT() {
		if (model.getA() == 0) {
			if (model.getB() == 0) {
				if (model.getC() == 0) {
					x = 0;
					x1 = 0;
					x2 = 0;
					check = 1;
				} else {
					x = 0;
					x1 = 0;
					x2 = 0;
					check = -1;
				}
			} else {
				x = -(model.getC() / model.getB());
				x1 = 0;
				x2 = 0;
				check = 0;
			}
		} else {
			double denta = Math.pow(model.getB(), 2) - 4 * model.getA() * model.getC();
			if (denta > 0) {
				x = 0;
				x1 = (-model.getB() + Math.sqrt(denta)) / (2 * model.getA());
				x2 = (-model.getB() - Math.sqrt(denta)) / (2 * model.getA());
				check = 0;
			} else if (denta == 0) {
				x = -model.getB() / (2 * model.getA());
				x1 = 0;
				x2 = 0;
				check = 0;
			} else {
				x = 0;
				x1 = 0;
				x2 = 0;
				check = -1;
			}
		}
	}
	
	public void printDetail() {
		if (check == 0) {
			if (x != 0 && x1 == 0 && x2 == 0) {
				System.out.println("Phuong trinh co nghiem la: " + x);
			} else if (x == 0 && x1 != 0 && x2 != 0) {
				System.out.println("Phuong trinh co 2 nghiem phan biet \nx1 = " + x1 + "\nx2 = " + x2);
			}
		} else if (check == 1) {
			System.out.println("Phuong trinh vo so nghiem !!");
		} else if (check == -1) {
			System.out.println("Phuong trinh vo nghiem");
		}
	}
}
