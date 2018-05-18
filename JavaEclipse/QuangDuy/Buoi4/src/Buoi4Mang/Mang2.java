package Buoi4Mang;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Scanner;

public class Mang2 {
	ArrayList<Integer> inA = new ArrayList<Integer>();
	
	public void duyetMang() {
		inA.add(2);
		inA.add(3);
		inA.add(4);
	}
	
	public void xuatMang() {
		for(int i = 0; i < inA.size(); i++) {
			System.out.print(inA.get(i)+ " ");
		}
	}
	public static void main(String[] args) {
		Mang2 mn = new Mang2();
		mn.duyetMang();
		mn.xuatMang();
	}
	
}
