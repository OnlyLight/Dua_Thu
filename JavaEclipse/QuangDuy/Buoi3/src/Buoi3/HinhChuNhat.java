package Buoi3;

public class HinhChuNhat {
	private int chieuDai;
	private int chieuRong;
	
	public int getChieuDai(){
		return this.chieuDai;
	}
	public void setChieuDai(int chieuDai){
		this.chieuDai = chieuDai;
	}
	public int getChieuRong(){
		return this.chieuRong;
	}
	public void setChieuRong(int chieuRong){
		this.chieuRong = chieuRong;
	}
	
	public int tinhChuVi(){
		return (this.chieuDai + this.chieuRong) * 2;
	}
	public int tinhDienTich(){
		 return this.chieuDai * this.chieuRong;
	}
	
	public String toString(){
		return this.chieuDai+ " " +this.chieuRong;
	}
}
