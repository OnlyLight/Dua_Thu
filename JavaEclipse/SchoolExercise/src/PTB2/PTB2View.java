package PTB2;

public class PTB2View {
	public void printDetail(double x, double x1, double x2, int check) {	
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
