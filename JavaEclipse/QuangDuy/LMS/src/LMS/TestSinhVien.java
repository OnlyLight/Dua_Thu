package LMS;

public class TestSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sv = new SinhVien();
		sv.setMaSinhVien(001);
		sv.setHoVaTen("Cai quan Dui");
		sv.setNgaySinh(15);
		sv.setDiem1(10);
		sv.setDiem2(9);
		sv.setDiem3(8);
		System.out.print("Ma Sinh Vien: " +sv.getMaSinhVien());
		System.out.println("Ho Va Ten: " +sv.getHoVaTen());
		System.out.println("Ngay sinh: " +sv.getNgaySinh());
		System.out.println("Diem 1: " +sv.getDiem1());
		System.out.println("Diem 2: " +sv.getDiem2());
		System.out.println("Diem 3: " +sv.getDiem3());
		sv.xepLoai();
	}

}
