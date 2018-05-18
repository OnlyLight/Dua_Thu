package ChungTaKhongThuocVeNhau;

public class VeNhau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baiHat ="D:/music/BaiHat/chungtakhongthuocvenhau.mp3";
		int s1 = baiHat.lastIndexOf("/") + 1;
		System.out.println(baiHat.substring(s1));
		System.out.println(baiHat.substring(s1,baiHat.indexOf(".")));
	}

}
