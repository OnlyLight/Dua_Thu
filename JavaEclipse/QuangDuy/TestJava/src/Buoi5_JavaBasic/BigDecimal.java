package Buoi5_JavaBasic;

public class BigDecimal {
	
	private int number;
	
	public BigDecimal(int number) {
		this.number = number;
	}
	
	public int add (BigDecimal value) {
		return this.number + value.number;
	}
	
	public int tru (BigDecimal value) {
		return this.number - value.number;
	}
	
	public int nhan (BigDecimal value) {
		return this.number * value.number;
	}
	
	public float chia (BigDecimal value) {
		if(value.number <= 0) {
			System.out.println("So chia phai lon hon khong !!.. Nhap lai !!");
		}
		return this.number / (float) value.number;
	}

	public BigDecimal cong (BigDecimal value) {
		BigDecimal ob = new BigDecimal(this.number);
		return ob;
	}
	
	public String toString() {
		return String.valueOf(this.number);
	}
}
