package PTTG;

public class UCLN {
	private int so1, so2;

	public UCLN() {
	}

	public UCLN(int so1, int so2) {
		this.so1 = so1;
		this.so2 = so2;
	}

	public int getSo1() {
		return so1;
	}

	public void setSo1(int so1) {
		this.so1 = so1;
	}

	public int getSo2() {
		return so2;
	}

	public void setSo2(int so2) {
		this.so2 = so2;
	}
	
	public int ucln() {
		int uc = 0;
		int max = this.so1 > this.so2 ? this.so1 : this.so2;
		int min = this.so1 < this.so2 ? this.so1 : this.so2;
		
		if (max % min == 0) uc = min;
		else {
			for(int i = min / 2; i > 1; i--) {
				if (max % i == 0 && min % i == 0) {
					uc = i;
				}
			}
		}
		return uc;
	}
}
