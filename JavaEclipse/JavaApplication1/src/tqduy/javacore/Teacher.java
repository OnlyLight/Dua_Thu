/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tqduy.javacore;

import java.util.Scanner;

/**
 *
 * @author QuangDuy
 */
public class Teacher extends Person{
    private int hour;

    public Teacher() {
    }

    public Teacher(int hour, int ID, String name, boolean gender, String address, String email, String phone, float salary) {
        super(ID, name, gender, address, email, phone, salary);
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        boolean checkID = false;
        do {            
            try {
                System.out.println("Nhap ID: ");
                super.setID(Integer.parseInt(sc.nextLine()));
            } catch (Exception e) {
                System.out.println("Xin nhap lai !!");
                checkID = false;
            }
        } while (checkID);
        
        System.out.println("Nhap Name: ");
        super.setName(sc.nextLine());
        
        int sex = 1;
        boolean checkSex = false;
        do {
            try {
                System.out.println("Nhap gender: ");
                sex = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                checkSex = true;
            }
        
            if((sex != 1 && sex != 0) || checkSex) {
                System.out.println("Xin nhap lai !!");
            }
        }while((sex != 1 && sex != 0) || checkSex);
        
        if(sex == 1) super.setGender(true);
        else super.setGender(false);
        
        System.out.println("Nhap Address: ");
        super.setAddress(sc.nextLine());
        
        System.out.println("Nhap Email: ");
        super.setEmail(sc.nextLine());
        
        System.out.println("Nhap phone: ");
        super.setPhone(sc.nextLine());
        
        boolean checkHour = false;
        do {            
            try {
                System.out.println("Nhap Hour: ");
                this.hour = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                checkHour = true;
            }
            
            if(this.hour < 0 || this.hour > 24 || checkHour) {
                System.out.println("Xin nhap lai !!");
            }
        } while (this.hour < 0 || this.hour > 24 || checkHour);
    }
    
    public float tinhLuongTeacher() {
        return this.hour * 100000;
    }

    @Override
    public String toString() {
        super.setSalary(tinhLuongTeacher());
        String in = "---------------THONG TIN GIAO VIEN---------------";
        in += "\nID: " + super.getID();
        in += "\nName: " + super.getName();
        in += "\nGender: " + super.isGender();
        in += "\nAddress: " + super.getAddress();
        in += "\nEmail: " + super.getEmail();
        in += "\nPhone: " + super.getPhone();
        in += "\nHour: " + this.hour;
        in += "\nSalary: " + super.getSalary();
        return in;
    }
    
    
}
