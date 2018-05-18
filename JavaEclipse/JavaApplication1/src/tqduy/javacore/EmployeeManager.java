/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tqduy.javacore;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author QuangDuy
 */
public class EmployeeManager {
    private ArrayList<Employee> employees;
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private int luaChon;
    private int n;
    private int nGv;
    
    public void nhapNhanVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien: ");
        this.n = Integer.parseInt(sc.nextLine());
        
        employees = new ArrayList<>();
        
        for(int i = 0; i < n; ++i) {
            Employee e = new Employee();
            System.out.println("------NHAP NHAN VIEN " + (i+1) + "------");
            e.nhap();
            employees.add(e);
        }
    }
    
    public void inNhanVien() {
        for(int i = 0; i < n; ++i) {
            System.out.println(this.employees.get(i));
        }
    }
    
    public void nhapGiaoVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong giao vien: ");
        this.nGv = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < nGv; ++i) {
            Teacher t = new Teacher();
            System.out.println("------NHAP GIAO VIEN " + (i+1) + "------");
            t.nhap();
            this.teachers.add(t);
        }
    }
    
    public void inGiaoVien() {
        for(int i = 0; i < nGv; ++i) {
            System.out.println(this.teachers.get(i));
        }
    }
    
    public double tinhTongLuongNhanVien() {
        double tong = 0;
        for(Employee e : employees) {
            tong += e.luongEmployee();
        }
        return tong;
    }
    
    public double tinhTongLuongGiaoVien() {
        double tong = 0;
        for(Teacher t : teachers) {
            tong += t.tinhLuongTeacher();
        }
        return tong;
    }
    
    public void inputData() {
        do {            
            Scanner sc = new Scanner(System.in);
            System.out.println("------CHUONG TRINH QUAN LY NHAN SU------");
            System.out.println("1. Nhap nhan vien");
            System.out.println("2. Nhap giao vien");
            System.out.println("3. In ra thong tin nhan vien va giao vien");
            System.out.println("4. Tinh tong luong phai tra");
            System.out.println("5. Thoat");
            System.out.println("Ban chon: ");
            this.luaChon = Integer.parseInt(sc.nextLine());

            switch(this.luaChon) {
                case 1:
                    nhapNhanVien();
                    break;
                case 2:
                    nhapGiaoVien();
                    break;
                case 3:
                    inNhanVien();
                    inGiaoVien();
                    break;
                case 4:
                    System.out.println("Tong luong Nhan Vien: " + tinhTongLuongNhanVien());
                    System.out.println("Tong luong Giao Vien: " + tinhTongLuongGiaoVien());
                    break;
                case 5: break;
                default:
                    System.out.println("Xin nhap lai !!");
            }
        } while (this.luaChon < 1 || this.luaChon > 5);
    }
    
    public void quanLyNhanSu() {
        while(true) {
            inputData();
            if(this.luaChon == 5) break;
        }
    }
    
    public static void main(String[] args) {
        EmployeeManager e = new EmployeeManager();
        e.quanLyNhanSu();
    }
}
 