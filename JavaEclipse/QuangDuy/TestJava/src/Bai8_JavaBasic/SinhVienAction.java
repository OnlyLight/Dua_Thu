package Bai8_JavaBasic;

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVienAction {

	public static ArrayList<SinhVien> inputData(int n) {
		ArrayList<SinhVien> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < n; i++) {
			System.out.println("--------Nhap thong tin sinh vien " + (i + 1) +"--------");
			try {
				System.out.println("Nhap ten: ");
				String hoTen = input.nextLine();
				
				System.out.println("Nhap nam sinh: ");
				String namSinh = input.nextLine();
				
				System.out.println("Nhap diem Toan: ");
				double diemToan = Double.parseDouble(input.nextLine());
				
				System.out.println("Nhap diem Ly: ");
				double diemLy = Double.parseDouble(input.nextLine());
				
				System.out.println("Nhap diem Hoa: ");
				double diemHoa = Double.parseDouble(input.nextLine());
				
				SinhVien sv = new SinhVien(hoTen, namSinh, diemToan, diemLy, diemHoa);
				list.add(sv);
			} catch (Exception e) {
				System.out.println("Loi data !!!");
			}
		}
		
		return list;
	}

	public static void displayData(ArrayList<SinhVien> list) {
		for (int i = 0; i < list.size(); i++) {
			SinhVien sv = list.get(i);
			System.out.println(sv.getHoTen());
			System.out.println(sv.getNamSinh());
			System.out.println(sv.getDiemToan());
			System.out.println(sv.getDiemly());
			System.out.println(sv.getDiemHoa());
			System.out.println("Diem TB: " + tinhDiemTB(sv));
		}
	}

	public static double tinhDiemTB(SinhVien sv) {
		double diemTB = (sv.getDiemToan() + sv.getDiemly() + sv.getDiemHoa()) / 3;
		return diemTB;
	}
	
	public static void diemTBMax(ArrayList<SinhVien> list) {
		double diem = tinhDiemTB(list.get(0));;
		for(int i = 0; i < list.size(); i++) {
			if(diem < tinhDiemTB(list.get(i))) {
				diem = tinhDiemTB(list.get(i));
			}
		}
		
		for(int i = 0; i < list.size(); i++) {
			SinhVien sv = list.get(i);
			if(tinhDiemTB(sv) == diem) {
				System.out.println(sv.getHoTen());
				System.out.println(sv.getNamSinh());
				System.out.println(sv.getDiemToan());
				System.out.println(sv.getDiemly());
				System.out.println(sv.getDiemHoa());
				System.out.println("Diem TB: " + tinhDiemTB(sv));
			}
		}
	}

}
