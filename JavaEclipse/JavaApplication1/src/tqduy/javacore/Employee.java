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
public class Employee extends Person{
    private float basicSalary;

    public Employee() {
    }

    public Employee(float basicSalary, int ID, String name, boolean gender, String address, String email, String phone, float salary) {
        super(ID, name, gender, address, email, phone, salary);
        this.basicSalary = basicSalary;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
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
        
        boolean checkBs = false;
        do {            
            try {
                System.out.println("Nhap Salary: ");
                this.basicSalary = Float.parseFloat(sc.nextLine());
            } catch (Exception e) {
                checkBs = true;
            }
            
            if(this.basicSalary < 0 || checkBs) {
                System.out.println("Xin nhap lai !!");
            }
        } while (this.basicSalary < 0 || checkBs);
    }
    
    public float luongEmployee() {
        return (float) (this.basicSalary*2.34);
    } 

    @Override
    public String toString() {
        super.setSalary(luongEmployee());
        String in = "------------THONG TIN NHAN VIEN------------";
        in += "\nID: " + super.getID();
        in += "\nName: " + super.getName();
        in += "\nGender: " + super.isGender();
        in += "\nAddress: " + super.getAddress();
        in += "\nEmail: " + super.getEmail();
        in += "\nPhone: " + super.getPhone();
        in += "\nBasicSalary: " + this.basicSalary;
        in += "\nSalary: " + super.getSalary();
        return in;
    }
    
    public static void main(String[] args) {
        Employee e = new Employee();
        e.nhap();
        System.out.println(e);
    }
}
