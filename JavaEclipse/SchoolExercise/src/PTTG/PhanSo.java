package PTTG;

import java.util.Scanner;

public class PhanSo {
	private UCLN ucln;
	private int tuSo, mauSo;
	
	public PhanSo() {
	}
	public PhanSo(UCLN uc, int tuSo, int mauSo) {
		this.ucln = uc;
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}
	public UCLN getUc() {
		return ucln;
	}
	
	public void setUc(UCLN uc) {
		this.ucln = uc;
	}
	
	public int getTuSo() {
		return tuSo;
	}
	
	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}
	
	public int getMauSo() {
		return mauSo;
	}
	
	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap tu so: ");
		this.tuSo = Integer.parseInt(sc.nextLine());
		
		System.out.println("nhap mau so: ");
		this.mauSo = Integer.parseInt(sc.nextLine());
	}
	
	public void toiGianPhanSo() {
		ucln = new UCLN(this.tuSo, this.mauSo);
		
		this.tuSo /= ucln.ucln();
		this.mauSo /= ucln.ucln();
		
		System.out.println("Phan so toi gian la: " + this.tuSo + "/" + this.mauSo);
	}
}
