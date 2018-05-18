package BaiTap20c;

import java.util.Scanner;

public class Bai1 {
	private int soNguyen;
	
	public Bai1() {
	}

	public Bai1(int soNguyen) {
		this.soNguyen = soNguyen;
	}

	public int getSoNguyen() {
		return this.soNguyen;
	}

	public void setSoNguyen(int soNguyen) {
		this.soNguyen = soNguyen;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhap so (100 <= x <= 999): ");
			this.soNguyen = sc.nextInt();
			
			if (this.soNguyen < 100 || this.soNguyen > 999) {
				System.out.println("Xin nhap lai !! So nam trong đoan tu 100 den 999");
			}
		}while(this.soNguyen < 100 || this.soNguyen > 999);
	}
	
	private int soDaoNguoc(int N) {
		int sodaoNguoc = 0;
	    while (N > 0)
	    {
	        sodaoNguoc *= 10 + N % 10;
	        N /= 10;
	    }
	    return sodaoNguoc;
	}
	
	public void xuat() {
		int soDaoNguoc = 0;
		int soChuSo = 0;
		soDaoNguoc = soDaoNguoc(this.soNguyen);
		
		soChuSo = (int) Math.log10(this.soNguyen) + 1;
		
		System.out.println("So Dao Nguoc: " + soDaoNguoc);
		System.out.println("So Chu So: " + soChuSo);
		
		int temp;
		while(this.soNguyen > 0) {
			temp = soDaoNguoc % 10;
			soDaoNguoc /= 10;
			
			if (temp == 1) {
				System.out.print("Mot ");
			}
			else if (temp == 2) {
				System.out.print("Hai ");
			}
			else if (temp == 3) {
				System.out.print("Ba ");
			}
			else if (temp == 4) {
				System.out.print("Bon ");
			}
			else if (temp == 5) {
				System.out.print("Nam ");
			}
			else if (temp == 6) {
				System.out.print("Sau ");
			}
			else if (temp == 7) {
				System.out.print("Bay ");
			}
			else if (temp == 8) {
				System.out.print("Tam ");
			}
			else if (temp == 9) {
				System.out.print("Chin ");
			}
			
			if (soChuSo == 3) {
				System.out.print("Tram ");
			}
			else if (soChuSo == 2) {
				System.out.print("Chuc ");
			}
			else if (soChuSo == 1) {
				System.out.print("Don vi ");
			}
			soChuSo--;
		}
	}
}
