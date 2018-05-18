package ádasd;

import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
//		Mời ban  nhap a:
//		Moi ban nhap b:
//			
//		moi ban chon phep tinh (+-*/);
//		ket qua cua a    b la:
		
		System.out.print("Mời bạn nhập a: ");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		System.out.print("Mời bạn nhập b: ");
		int b=in.nextInt();
		//in.nextLine(); 
		System.out.print("moi ban chon phep tinh (+-*/) :");
		String phepTinh=in.nextLine();
		
		if (phepTinh.equals("+")) {
			System.out.println(a+b);
		}
		
		if (phepTinh.equals("-")) {
			System.out.println(a-b);
		}
		if (phepTinh.equals("*")) {
			System.out.println(a*b);
		}
		if (phepTinh.equals("/")) {
			System.out.println(a/b);
		}
	}

}
