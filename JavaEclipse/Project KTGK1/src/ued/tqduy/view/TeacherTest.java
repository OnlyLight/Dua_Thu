package ued.tqduy.view;

import java.util.Scanner;
import ued.tqduy.model.Teacher;

public class TeacherTest {
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		
        Teacher a = new Teacher();
        while (true) {
            System.out.println("-----Chuong trinh quan ly giao vien-----");
            System.out.println("1.Nhap danh sach giao vien");
            System.out.println("2.Xem danh sach giao vien");
            System.out.println("3.Sap xep giao vien theo tuoi, ten");
            System.out.println("4.Sap xep giao vien theo ten, tuoi");
            System.out.println("5.Tim giao vien theo ten");
            System.out.println("6.Thoat");
            int num;

            System.out.print("Nhap mot so de chon chuc nang: ");
            num = keyboard.nextInt();
            switch (num) {
                case 1:
                    a.input();
                    break;
                case 2:
                    a.view();
                    break;
                case 3:
                    a.sort();
                    break;
                case 4:
                    a.sort2();
                    break;
                case 5:
                    a.search();
                    break;
                case 6:
                    System.out.print("Chuong trinh ket thuc");
                    return;
            }
        }
    }
}
