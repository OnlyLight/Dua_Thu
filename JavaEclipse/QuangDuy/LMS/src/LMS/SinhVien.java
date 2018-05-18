package LMS;

public class SinhVien {
	private int maSinhVien;
	private String hoVaTen;
	private int ngaySinh;
	private int diem1;
	private int diem2;
	private int diem3;
	
	public int getMaSinhVien(){
		return this.maSinhVien;
	}
	public void setMaSinhVien(int maSinhVien){
		this.maSinhVien = maSinhVien;
	}
	public String getHoVaTen(){
		return this.hoVaTen;
	}
	public void setHoVaTen(String hoVaTen){
		this.hoVaTen = hoVaTen;
	}
	public int getNgaySinh(){
		return this.ngaySinh;
	}
	public void setNgaySinh(int ngaySinh){
		this.ngaySinh = ngaySinh;
	}
	public int getDiem1(){
		return this.diem1;
	}
	public void setDiem1(int diem1){
		this.diem1 = diem1;
	}
	public int getDiem2(){
		return this.diem2;
	}
	public void setDiem2(int diem2){
		this.diem2 = diem2;
	}
	public int getDiem3(){
		return this.diem3;
	}
	public void setDiem3(int diem3){
		this.diem3 = diem3;
	}
	public String toString(){
		return this.maSinhVien + " " +this.hoVaTen + " " +this.ngaySinh + "\n" +this.diem1+" "+this.diem2+" "+this.diem3;
	}
	public int tinhDiemTB(){
		return this.diem1 + this.diem2 + this.diem3;
	}
	public void xepLoai(){
		if(this.tinhDiemTB() >= 8) System.out.println("Gioi !! \3");
		else if(this.tinhDiemTB() >= 6) System.out.println("Kha !! \3");
		else if(this.tinhDiemTB() >= 4) System.out.println("Trung Binh !! \3");
		else System.out.println("Yeu !! \3");
	}
	
}
