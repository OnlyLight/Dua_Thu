package SMS;

public class TestSanPham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp = new SanPham();
		sp.setMaSoSanPham(001);
		sp.setTenSanPham("Cai quan Dai");
		sp.setGiaBan(2000000000);
		System.out.println(sp);
//		System.out.println("Ma So San Pham: "+sp.getMaSoSanPham());
//		System.out.println("Ten San Pham: "+sp.getTenSanPham());
//		System.out.println("Gia Ban: "+sp.getGiaBan());
//		System.out.println("Gia Sau Khi Giam: "+sp.Tinhgiagiam());
	}

}
