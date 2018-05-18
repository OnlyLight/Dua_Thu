package HelloWorld;

import java.lang.String;

public class HelloWorld {
	private String stdTen;
	private int stdTuoi;
	private int stdLuong;

	public HelloWorld(String stdTen, int stdTuoi, int stdTuong) {
		this.stdTen = stdTen;
		this.stdTuoi = stdTuoi;
		this.stdLuong = stdTuong;
	}

	public static void main(String[] args) {
		HelloWorld [] arrStu = new HelloWorld[5];
		
		for (int i = 0; i < 10; i++) {
			arrStu[0] = new HelloWorld("Duy", 19, 5000);
			arrStu[1] = new HelloWorld("Duyen", 20, 100);
			arrStu[2] = new HelloWorld("Dung", 21, 300);
			arrStu[3] = new HelloWorld("Huyen", 19, 800);
			arrStu[4] = new HelloWorld("Hang", 22, 900);
		}
		
		for (HelloWorld helloWorld : arrStu) {
			System.out.println("-------------------------------");
			System.out.println(helloWorld.stdTen);
			System.out.println(helloWorld.stdTuoi);
			System.out.println(helloWorld.stdLuong);
		}
	}
}
