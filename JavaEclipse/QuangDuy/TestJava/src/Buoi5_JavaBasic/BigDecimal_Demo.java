package Buoi5_JavaBasic;

public class BigDecimal_Demo {

	public static void main(String[] args) {
		BigDecimal so1 = new BigDecimal(2);
		BigDecimal so2 = new BigDecimal(-1);
		
		System.out.println(so1.cong(so2));
		System.out.println(so1.tru(so2));
		System.out.println(so1.nhan(so2));
		System.out.println(so1.chia(so2));
		
//		so1.toString();
	}

}
