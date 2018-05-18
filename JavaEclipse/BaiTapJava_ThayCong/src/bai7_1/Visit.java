package bai7_1;

import bai1_7.Date;

public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double prouductExpense;
	public Visit(String name, Date date) {
		super();
		this.date = date;
		customer.setName(name);
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getServiceExpense() {
		return serviceExpense;
	}
	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}
	public double getProuductExpense() {
		return prouductExpense;
	}
	public void setProuductExpense(double prouductExpense) {
		this.prouductExpense = prouductExpense;
	}
	@Override
	public String toString() {
		return "Visit [customer=" + customer + ", date=" + date + ", serviceExpense=" + serviceExpense
				+ ", prouductExpense=" + prouductExpense + "]";
	}
	
}
