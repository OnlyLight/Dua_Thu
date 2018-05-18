package Buoi7_JavaBasic;

import java.util.Scanner;

public class BaiTap {
	private String masv;
	private String ten;
	private String lop;
	private double diemToan;
	private double diemLy;
	private double diemHoa;
	
	public BaiTap() {
		
	}
	
	public String getMasv() {
		return this.masv;
	}
	
	public void setMasv(String masv) {
		this.masv = masv;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public double getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}

	public double getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}

	public double getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào masv: ");
		masv = String.valueOf(scanner.nextLine());
		
		System.out.println("Nhập vào tên: ");
		ten = String.valueOf(scanner.nextLine());
		
		System.out.println("Nhập vào lớp: ");
		lop = String.valueOf(scanner.nextLine());
				
		do{
			try{
				System.out.println("Nhập vào điểm toán: ");
				diemToan = Double.parseDouble(scanner.nextLine());
				
				System.out.println("Nhập vào điểm lý: ");
				diemLy = Double.parseDouble(scanner.nextLine());
				
				System.out.println("Nhập vào điểm hóa: ");
				diemHoa = Double.parseDouble(scanner.nextLine());
			} catch(NumberFormatException e){
				System.out.println("Error!!!");
			}
			
			if(diemToan < 0 || diemToan > 10 || diemLy < 0 || diemLy > 10 || diemHoa < 0 || diemHoa > 10) {
				System.out.println("Điểm phải Lớn Hơn không và bé hơn hoặc bằng 10");
			}
		}while(diemToan < 0 || diemToan > 10 || diemLy < 0 || diemLy > 10 || diemHoa < 0 || diemHoa > 10);
	}
	
	public void inThongTin() {
		System.out.println("MaSV: " + masv);
		System.out.println("Tên: " + ten);
		System.out.println("Lớp: " + lop);
		System.out.println("Điểm Toán: " + diemToan);
		System.out.println("Điểm Lý: " + diemLy);
		System.out.println("Điểm Hóa: " + diemHoa);
		System.out.println("Điểm TB: " + tinhDiemTB());
	}
	
	public String toString() {
		return "\nMaSV: " + masv + "\nTên: " + ten + "\nLớp: " + lop
				+ "\nĐiểm Toán: " + diemToan + "\nĐiểm Lý: " + diemLy + "\nĐiểm Hóa: " + diemHoa
				+ "\nĐiểm TB: " + tinhDiemTB();
	}
	
	public double tinhDiemTB() {
		return (diemToan + diemLy + diemHoa) / 3;
	}

	public static void main(String[] args) {
		BaiTap sv1 = new BaiTap();
		BaiTap sv2 = new BaiTap();
		
		System.out.println("---------Nhập Sv 1---------");
		sv1.nhap();
		
		System.out.println("---------Nhập Sv 2---------");
		sv2.nhap();
		
		System.out.println(sv1);
		System.out.println(sv2);
		
//		System.out.println("Điểm Max là: " + Math.max(sv1.tinhDiemTB(), sv2.tinhDiemTB()));
		
		if(sv1.tinhDiemTB() > sv2.tinhDiemTB()) 
			System.out.println("\nSV1 Có điểm TB cao hơn nhá !! Những " + sv1.tinhDiemTB() + " :D");
		else if(sv1.tinhDiemTB() < sv2.tinhDiemTB())
			System.out.println("\nSV2 Có điểm TB cao hơn nhá !! Những " + sv2.tinhDiemTB() + " :D");
		else
			System.out.println("\n2 thằng bằng nhau !! Méo có thằng nào cao hơn nhé !!");
		
	}

}