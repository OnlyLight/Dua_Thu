
/*
 * Tạo 1 class học sinh, có tên, tuổi, điểm toán, lý, hóa, tính trung binh, in thông tin học sinh*/
public class HocSinh {
	private String ten;
	private int tuoi;
	private double diemToan, diemLy, diemHoa;
	
	public String getTen() {
		return this.ten;
	}
	
	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int t) {
		tuoi = t;
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
	
	public HocSinh() {
		this.ten = "ads";
		this.tuoi = 12;
		this.diemToan = 1;
		this.diemLy = 1;
		this.diemHoa = 2;
	}

	public HocSinh(String ten, int tuoi, double diemToan, double diemLy, double diemHoa) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}
	
	public double tinhDiemTB() {
		double diemTB = (this.diemToan + this.diemLy + this.diemHoa) / 3;
		return diemTB;
	}
	
	public void inThongTin() {
		System.out.println("Ho ten: " + this.ten);
		System.out.println("Ho ten: " + this.ten);
		System.out.println("Ho ten: " + this.ten);
		System.out.println("Ho ten: " + this.ten);
		System.out.println("Ho ten: " + this.ten);
		System.out.println("Diem TB: " + tinhDiemTB());
	}
	
	public String toString() {
		return "Ho ten: " + this.ten + "\n" + "Diem TB: " + tinhDiemTB();
	}
	
}
