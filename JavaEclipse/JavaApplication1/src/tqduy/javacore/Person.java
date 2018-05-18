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
public class Person {
    private int ID;
    private String name;
    private boolean gender;
    private String address;
    private String email;
    private String phone;
    private float salary;

    public Person() {
    }

    public Person(int ID, String name, boolean gender, String address, String email, String phone, float salary) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
