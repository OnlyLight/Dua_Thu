package market.model;

public class HangThucPham extends HangHoa {
	private int ngaySx;
	private int ngayHH;
	private String nCC;
	public HangThucPham(String maHh, String tenHh, int soLuong, int slTon, int donGia, int ngaySx, int ngayHH, String nCC) throws Exception {
		super(maHh, tenHh, soLuong, slTon, donGia);
		this.ngaySx = ngaySx;
		this.ngayHH = ngayHH;
		this.nCC = nCC;
	}
	public int getNgaySx() {
		return ngaySx;
	}
	public void setNgaySx(int ngaySx) {
		this.ngaySx = ngaySx;
	}
	public int getNgayHH() {
		return ngayHH;
	}
	public void setNgayHH(int ngayHH) {
		this.ngayHH = ngayHH;
	}
	public String getnCC() {
		return nCC;
	}
	public void setnCC(String nCC) {
		this.nCC = nCC;
	}
	
	
}
