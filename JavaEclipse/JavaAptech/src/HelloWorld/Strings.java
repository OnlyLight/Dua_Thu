package HelloWorld;

import java.lang.String;
import java.util.ArrayList;

public class Strings {
	public static void main(String[] args) {
		ArrayList<String> arrStr = new ArrayList<>();
		
		arrStr.add("Duy dep trai");
		arrStr.add("Hon !!");
		System.out.println(arrStr);
		System.out.println("So luong phan tu la: " + arrStr.size());
		System.out.println("Phan tu dau tien: " + arrStr.get(0));
		System.out.println("Index dau tien chua ky tu la: " + arrStr.indexOf("Duy dep trai"));
		System.out.println("Index cuoi cung: " + arrStr.lastIndexOf("Duy dep trai"));
		arrStr.remove(1);
		System.out.println("Xoa phan tu thu 1: " + arrStr);
		arrStr.clear();
		System.out.println(arrStr + ", " + arrStr.size());
	}
}
