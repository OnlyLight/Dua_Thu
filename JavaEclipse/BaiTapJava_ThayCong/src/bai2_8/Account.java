package bai2_8;

import bai2_6_7.Customer;

public class Account extends Customer{
	private int ID;
	private Customer customer;
	private double balance;
	public Account(int iD, Customer customer, double balance) {
		super();
		this.ID = iD;
		this.customer = customer;
		this.balance = balance;
	}
	public Account(int iD, Customer customer) {
		super();
		this.ID = iD;
		this.customer = customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getID() {
		return ID;
	}
	public Customer getCustomer() {
		return customer;
	}
	@Override
	public String toString() {
		return "Account [ID=" + ID + ", customer=" + customer + ", balance=" + balance + "]";
	}
	public String getCustomerName() {
		return customer.getName();
	}
	public Account deposit(double amount) {
		Account account = new Account(this.ID, this.customer, this.balance+amount);
		return account;
	}
	public Account withdraw(double amount) {
		if(this.balance >= amount) this.balance = this.balance - amount;
		else System.out.println("amount withdraw exceeds the current balance!");
		return new Account(this.ID, this.customer, this.balance);
	}
}
