package SMS;

public class SanPham {
	private int maSoSanPham;
	private String tenSanPham;
	private int giaBan;

	public String toString(){
		return this.maSoSanPham + " " + this.tenSanPham+ " " + this.giaBan+ " " + this.Tinhgiagiam();
	}
	public int getMaSoSanPham(){
		return this.maSoSanPham;
	}
	public void setMaSoSanPham(int maSoSanPham){
		this.maSoSanPham = maSoSanPham;
	}
	public String getTenSanPham(){
		return this.tenSanPham;
	}
	public void setTenSanPham(String tenSanPham){
		this.tenSanPham = tenSanPham;
	}
	public int getGiaBan(){
		return this.giaBan;
	}
	public void setGiaBan(int giaBan){
		this.giaBan = giaBan;
	}
	public int Tinhgiagiam(){
		return this.giaBan * 95 / 100;
	}
}
