package Buoi4_JavaBasic;
/*
 * Qua package khác thì inport lại class cần dùng ở package khác trước */

import java.util.Scanner;

public class SinhVien {
	/*
	 * static là kiểu thằng nào gọi vào thay đổi là mấy thằng khác gọi lại biến đó cũng nhận lại giá trị vừa thay đổi
	 * public là kiểu thằng nào gọi vào thay đổi thì chỉ có thằng đó thay đổi không ảnh hưởng tới mấy thằng khác gọi tới !! */
	
	private String masv;
	private String hoTen;
	private int tuoi;

	public SinhVien() {
		super();
	}

	public SinhVien(String masv, String hoTen, int tuoi) {
		super();
		this.masv = masv;
		this.hoTen = hoTen;
		this.tuoi = tuoi;
	}

	public String getMasv() {
		return masv;
	}



	public void setMasv(String masv) {
		this.masv = masv;
	}



	public String getHoTen() {
		return hoTen;
	}



	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}



	public int getTuoi() {
		return tuoi;
	}



	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	public static void main(String[] args) {
		SinhVien sv = new SinhVien("c291998", "Tran Quang duy", 19);
		SinhVien sv1 = new SinhVien();
		System.out.println("Nhập vào tên: ");
		Scanner scanner = new Scanner(System.in);
		/*
		 * next(): gặp khoảng trống là dừng trả về giá trị
		 * nextLine(): đọc hết đến khi Enter là trả về giá trị */
		
		sv.setHoTen(scanner.nextLine());
		
		System.out.println("Nhập vào masv: ");
		sv.setMasv(scanner.nextLine());
		
		System.out.println("Tên: " + sv.getHoTen());
		System.out.println("Masv: " + sv.getMasv());
	}
}