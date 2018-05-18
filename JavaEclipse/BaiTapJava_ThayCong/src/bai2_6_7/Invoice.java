package bai2_6_7;

public class Invoice extends Customer {
	private int ID;
	private Customer customer;
	private double amount;
	public Invoice(int iD2, Customer customer, double amount) {
		ID = iD2;
		this.customer = customer;
		this.amount = amount;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getID() {
		return ID;
	}
	public String getCustomerName() {
		return this.customer.getName();
	}
	public double getAmountAfterDiscount() {
		return this.amount - (this.amount - this.customer.getDiscount());
	}
}
