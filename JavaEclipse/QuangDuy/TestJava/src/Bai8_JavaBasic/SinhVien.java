package Bai8_JavaBasic;

public class SinhVien {

	private String hoTen;
	private String namSinh;
	private double diemToan;
	private double diemLy;
	private double diemHoa;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}
	public double getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}
	public double getDiemly() {
		return diemLy;
	}
	public void setDiemly(double diemly) {
		this.diemLy = diemly;
	}
	public double getDiemHoa() {
		return diemHoa;
	}
	public void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SinhVien(String hoTen, String namSinh, double diemToan, double diemly, double diemHoa) {
		super();
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.diemToan = diemToan;
		this.diemLy = diemly;
		this.diemHoa = diemHoa;
	}
	
	
}
