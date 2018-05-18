package snippet;

public class Snippet {
	public static int getGCD(int a, int b) {
			int ucln = 0;
			int max = a > b ? a : b;
			int min = a < b ? a : b;
			
			if(max % min == 0) {
				ucln = min;
			}
			else {
				for(int i = min / 2; i > 1; i--) {
					if (max % i == 0 && min % i == 0) {
						ucln = i;
						break;
					}
				}
			}
			return ucln;
		}
		
		public static FractionModel getReductFraction(FractionModel fraction) {
			int ucln = getGCD(fraction.getTuSo(), fraction.getMauSo());
			int tuSoRutGon = fraction.getTuSo() / ucln;
			int mauSoRutGon = fraction.getMauSo() / ucln;
			fraction = new FractionModel(tuSoRutGon, mauSoRutGon);
			return fraction;
		}
		
		public static void initArray(FractionModel []arrFraction) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap so phan tu: ");
			int n = Integer.parseInt(sc.nextLine());
			arrFraction = new FractionModel[n];
			
			for(int i = 0; i < arrFraction.length; i++) {
				System.out.println(arrFraction.length);
				
	//			System.out.println(i);
				
				System.out.println("Nhap phan so " + i + ": ");
				arrFraction[i].nhap();
				
	//			System.out.println(arrFraction.length);
	//			
	//			System.out.println("Nhap mau so " + i + ": ");
	//			arrFraction[i].setMauSo(Integer.parseInt(sc.nextLine()));
			}
		}
		
		public static FractionModel sumFractionArray(ArrayList<FractionModel> arrFraction) {
			FractionModel sum = arrFraction.get(0);
			
			for(int i = 1; i < arrFraction.size(); i++) {
				sum = sum.tong(arrFraction.get(i));
			}
			return sum;
		}
}

