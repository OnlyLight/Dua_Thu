package BaiTap20c;

import java.util.Scanner;

public class Bai4 {
	private int soNhapVao;

	public Bai4() {
	}

	public Bai4(int soNhapVao) {
		this.soNhapVao = soNhapVao;
	}

	public int getSoNhapVao() {
		return this.soNhapVao;
	}

	public void setSoNhapVao(int soNhapVao) {
		this.soNhapVao = soNhapVao;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Nhap so vao day(so nguyen duong): ");
				this.soNhapVao = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Vui long nhap so nguyen !!");
			}
			
			if (this.soNhapVao <= 0) {
				System.out.println("So nhap vao la so nguyen duong !! Xin nhap lai !!");
			}
		}while(this.soNhapVao <= 0);	
	}
	
	private int giaiThua() {
		int tichGiaiThua = 1;
		for(int i = 1; i <= this.soNhapVao; i++) {
			tichGiaiThua *= i;
		}
		return tichGiaiThua;
	}
	
	public String toString() {
		return "Giai thua cua " + this.soNhapVao + " la: " + giaiThua();
	}
}
