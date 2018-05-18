package Bai8_JavaBasic;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySv {

	public static void main(String[] args) {
		// Tao
		ArrayList<SinhVien> list;
		
		// Nhap data
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		
		list = SinhVienAction.inputData(n);
		
		
		System.out.println("--------Thong tin sinh vien--------");
		// in data
		SinhVienAction.displayData(list);
		
		/* Cau 2: viết phương thức tìm sv có điểm tB lớn nhất trong danh sách
		 * Cau 1: Viết phương thức tính điểm trung bình của từng sinh viên
		 * 
		 * Gợi ý: câu 1 thông số là líst
		 * 
		 * Câu 2: list for đầu tìm giá trị max. for 2 từ giá trị max tình sinh viên
		 */
		
		System.out.println("--------Thong tin sinh vien co diem TB cao nhat--------");
		SinhVienAction.diemTBMax(list);
	}

}
