package Bai8_JavaBasic;

public class Chuoi {

	public static void main(String[] args) {
		String s1 = new String("Hello Earth");
		
		// Bỏ khoảng trắng đầu và cuối
		System.out.println(s1.trim());
		
		System.out.println(s1.toString());
		System.out.println(s1.concat(" cai quan que"));
		
		// Su dung trong da luong
		StringBuffer buffer = new StringBuffer("Cai quan dui");
		System.out.println(buffer);
	}

}
