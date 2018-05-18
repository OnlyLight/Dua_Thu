package ued.tqduy.model;

import java.util.Scanner;

public class Fraction {
	private int tuSo;
	private int mauSo;
	
	public Fraction() {
		super();
	}

	public Fraction(int tuSo, int mauSo) {
		super();
		this.tuSo = tuSo;
		this.mauSo = mauSo;
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
		System.out.println("Nhap tu so: ");
		this.tuSo = Integer.parseInt(sc.nextLine());
		
		System.out.println("Nhap mau so: ");
		this.mauSo = Integer.parseInt(sc.nextLine());
	}
	
	public Fraction tong(Fraction fraction) {
		int tongTu = this.tuSo * fraction.getMauSo() + fraction.getTuSo() * this.mauSo;
		int tongMau = this.mauSo * fraction.getMauSo();
		Fraction fractionModel = new Fraction(tongTu, tongMau);
		return fractionModel;
	}
	
	public Fraction hieu(Fraction fraction) {
		int hieuTu = this.tuSo * fraction.getMauSo() - fraction.getTuSo() * this.mauSo;
		int hieuMau = this.mauSo * fraction.getMauSo();
		Fraction fractionModel = new Fraction(hieuTu, hieuMau);
		return fractionModel;
	}
	
	public Fraction tich(Fraction fraction) {
		int tichTu = this.tuSo * fraction.getTuSo();
		int tichMau = this.mauSo * fraction.getMauSo();
		Fraction fractionModel = new Fraction(tichMau, tichMau);
		return fractionModel;
	}
	
	public Fraction thuong(Fraction fraction) {
		int thuongTu = this.tuSo * fraction.getMauSo();
		int thuongMau = this.mauSo * fraction.getTuSo();
		Fraction fractionModel = new Fraction(thuongTu, thuongMau);
		return fractionModel;
	}
	
	public String toString() {
		return this.tuSo + "/" + this.mauSo;
	}
}
