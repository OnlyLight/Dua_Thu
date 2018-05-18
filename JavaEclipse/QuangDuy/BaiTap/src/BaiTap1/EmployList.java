package BaiTap1;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployList {
	ArrayList<Employee> nv = new ArrayList<Employee>();
	private static Scanner n;
	public void add(int a) {
//		CACH 1:
		
//		if(a == 1) {
//			Contract duong = new Contract(111, "Duong", new BirthDay(6,7,1989), 500000, 7000000);
//			System.out.println(duong);
//			Contract duyen = new Contract(112, "Duyen", new BirthDay(3,10,1990), 500000, 7000000);
//			System.out.println(duyen);
//			Contract thanh = new Contract(114, "Thanh", new BirthDay(3,2,1989), 1500000, 8000000);
//			System.out.println(thanh);
//		}
//		else if(a == 2){
//			Regular lan = new Regular(113,"Lan",new BirthDay(13,10,1991),700000,5,6000000);
//			System.out.println(lan);
//			Regular man = new Regular(115,"man",new BirthDay(7,7,1991),700000,15,9000000);
//			System.out.println(man);
//			Regular luong = new Regular(116,"Luong",new BirthDay(13,11,1901),600000,10,8000000);
//			System.out.println(luong);
//		}
		
//		CACH 2:
		
		if(a == 1) {
			nv.add(new Contract(111, "Duong", new BirthDay(6,7,1989), 500000, 7000000));
			nv.add(new Contract(112, "Duyen", new BirthDay(3,10,1990), 500000, 7000000));
			nv.add(new Contract(114, "Thanh", new BirthDay(3,2,1989), 1500000, 8000000));
			System.out.println(nv.get(0));
			System.out.println(nv.get(1));
			System.out.println(nv.get(2));
		}
		else if(a == 2) {
			nv.add(new Regular(113, "Lan", new BirthDay(13,10,1991),700000,5, 6000000));
			nv.add(new Regular(115, "Man", new BirthDay(7,7,1991), 700000, 15, 9000000));
			nv.add(new Regular(116,"Luong",new BirthDay(13,11,1901),600000,10,8000000));
			System.out.println(nv.get(0));
			System.out.println(nv.get(1));
			System.out.println(nv.get(2));
		}
	}
	
	public void maxSalary(int a) {
		if(a == 1) {
			Contract duong = new Contract(111, "Duong", new BirthDay(6,7,1989), 500000, 7000000);
			Contract duyen = new Contract(112, "Duyen", new BirthDay(3,10,1990), 500000, 7000000);
			Contract thanh = new Contract(114, "Thanh", new BirthDay(3,2,1989), 1500000, 8000000);
			double max = duong.getGradeSalary();
			if(max < duyen.getGradeSalary()) max = duyen.getGradeSalary();
			else if(max < thanh.getGradeSalary()) max = thanh.getGradeSalary();
			System.out.println("MaxSalary: "+max);
		}
		if(a == 2) {
			Regular lan = new Regular(113,"Lan",new BirthDay(13,10,1991),700000,5,6000000);
			Regular man = new Regular(115,"man",new BirthDay(7,7,1991),700000,15,9000000);
			Regular luong = new Regular(116,"Luong",new BirthDay(13,11,1901),600000,10,8000000);
			double max = lan.getBasicSalary();
			if(max < man.getBasicSalary()) max = man.getBasicSalary();
			else if(max < luong.getBasicSalary()) max = luong.getBasicSalary();
			System.out.println("MaxSalary: "+max);
		}

	}
	
	// TAI SAO HAM HOAN VI KHONG CHAY??
	public void hoanVi(int c, int b){
		int temp = c;
		c = b;
		b = temp;
	}
	
	public void sort(int a){
		if(a == 1) {
			Contract duong = new Contract(111, "Duong", new BirthDay(6,7,1989), 500000, 7000000);
			Contract duyen = new Contract(112, "Duyen", new BirthDay(3,10,1990), 500000, 7000000);
			Contract thanh = new Contract(114, "Thanh", new BirthDay(3,2,1989), 1500000, 8000000);
			ArrayList<Integer> year = new ArrayList<Integer>();
			year.add(duong.getBirthDay().getYear());
			year.add(duyen.getBirthDay().getYear());
			year.add(thanh.getBirthDay().getYear());
			
			for(int i = 0; i < year.size() - 1; i++) {
				for(int j = i + 1; j < year.size(); j++) {
					if(year.get(i)>year.get(j)) {
						hoanVi(year.get(i), year.get(j));
					}
				}
			}
			for(int i = 0; i < year.size(); i++) {
				System.out.println(year.get(i));
			}
		}
		if(a == 2) {
			Regular lan = new Regular(113,"Lan",new BirthDay(13,10,1991),700000,5,6000000);
			Regular man = new Regular(115,"man",new BirthDay(7,7,1991),700000,15,9000000);
			Regular luong = new Regular(116,"Luong",new BirthDay(13,11,1901),600000,10,8000000);
			ArrayList<Integer> year = new ArrayList<Integer>();
			year.add(lan.getBirthDay().getYear());
			year.add(man.getBirthDay().getYear());
			year.add(luong.getBirthDay().getYear());
			
			for(int i = 0; i < year.size() - 1; i++) {
				for(int j = i + 1; j < year.size(); j++) {
					if(year.get(i)>year.get(j)) {
						hoanVi(year.get(i), year.get(j));
					}
				}
			}
			for(int i = 0; i < year.size(); i++) {
				System.out.println(year.get(i));
			}
		}	
	}

	public static void main(String[] args) {
		EmployList e = new EmployList();
		System.out.println("1.Contract");
		System.out.println("2.Regular");
		n = new Scanner(System.in);
		int a = n.nextInt();
		e.add(a);
		e.maxSalary(a);
		e.sort(a);
	}

}
