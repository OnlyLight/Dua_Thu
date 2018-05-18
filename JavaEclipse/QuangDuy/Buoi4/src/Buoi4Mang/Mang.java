package Buoi4Mang;

import java.util.Scanner;

public class Mang {

	int [] a;
	
	Scanner n = new Scanner(System.in);
	
	public void duyetMang() {
		System.out.print("Nhap so luong phan tu: ");
		int b = n.nextInt();
		a = new int[b];
		
		for(int i = 0; i < a.length; i++) {
			System.out.print("a[" + i +"]: ");
			a[i] = n.nextInt();
		}
		
	}
	
	public int tongSoLe() {
		int tong = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 != 0) {
				tong += a[i];
			}
		}
		return tong;
	}
	
	public void timMax(){
		int max = a[0];
		for(int i = 0; i < a.length; i++){
			if(a[i] > max) max = a[i];
		}
		System.out.print("Max: "+max);
	}
	
	public void timMin(){
		int min = a[0];
		for(int i = 0; i < a.length; i++){
			if(a[i] < min) min = a[i];
		}
		System.out.println("Min la: "+min);
	}
	
	public int demPhanTu() {
		int dem = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] % 2 == 0) dem++;
		}
		return dem;
	}
	
	public boolean soNguyenTo(int x){
		if(x <= 1) return false;
		else{
			for(int i = 2; i<x/2; i++){
				if(x % i == 0) return false;
			}
			return true;
		}
	}
	
	public void inSoNGuyenTo(){
		for(int i = 0; i< a.length; i++){
			if(soNguyenTo(a[i])) System.out.println("So Nguyen To: "+a[i]);
		}
	}
	
	public void hoanVi(int a, int b){
		int temp = a;
		a = b;
		b = temp;
	}
	
	public void sapXepTangDan(){
		for(int i = 0;i<a.length - 1; i++){
			for(int j = i + 1; j< a.length; j++){
				if(a[i]>a[j]) { 
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				}
			}
		}
		for(int i =0; i < a.length; i++){
			System.out.print(a[i]+ " ");
		}
	}
	
	public int timPhanTu(){
		int vt = 0;
		System.out.println("Phan Tu can tim: ");
		int x = n.nextInt();
		for(int i = 0; i < a.length;i++){
			if(a[i] == x) vt = i;
		}
		return vt;
	}
	
	public void xuatMang(){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mang m = new Mang();
		m.duyetMang();
//		System.out.println("Tong So le: "+m.tongSoLe());
//		m.timMax();
//		m.timMin();
//		System.out.println("Phan tu chan: "+m.demPhanTu());
//		m.inSoNGuyenTo();
		m.sapXepTangDan();
		m.xuatMang();
		System.out.println(m.timPhanTu());
	}
}