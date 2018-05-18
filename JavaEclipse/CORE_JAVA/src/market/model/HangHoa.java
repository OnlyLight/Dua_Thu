package market.model;

public class HangHoa {
	private String maHh;
	private String tenHh;
	private int soLuong;
	private int SLTon;
	private int donGia;
	
	public HangHoa() throws Exception {
		super();
		if(this.tenHh.isEmpty()) throw new Exception();
		if(this.maHh.isEmpty()) throw new Exception();
	}

	public HangHoa(String maHh, String tenHh, int soLuong, int slTon, int donGia) throws Exception {
		if(this.tenHh.isEmpty()) throw new Exception();
		if(this.maHh.isEmpty()) throw new Exception();
		this.maHh = maHh;
		this.tenHh = tenHh;
		this.soLuong = soLuong;
		this.SLTon = slTon;
		this.donGia = donGia;
	}

	public String getMaHh() {
		return maHh;
	}
	
	public void setMaHh(String maHh) {
		this.maHh = maHh;
	}
	
	public String getTenHh() {
		return tenHh;
	}
	
	public void setTenHh(String tenHh) {
		this.tenHh = tenHh;
	}
	
	public int getSoLuong() {
		return soLuong;
	}
	
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	public int getSLTon() {
		return SLTon;
	}
	
	public void setSlTon(int slTon) {
		SLTon = slTon;
	}
	
	public int getDonGia() {
		return donGia;
	}
	
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
}
