package Buoi3;

public class HinhTron {
	final float pi = (float) 3.14;
	private int banKinh;
	
	public int getBanKinh() {
		return this.banKinh;
	}
	public void setBanKinh(){
		this.banKinh = banKinh;
	}
	public HinhTron(int banKinh){
		this.banKinh = banKinh;
	}
	public float tinhChuvi(){
		return 2*this.pi*this.banKinh;
	}
	public float tinhDienTich(){
		return this.pi*this.banKinh*this.banKinh;
	}
	public String toString(){
		return this.banKinh + " ";
	}
}
