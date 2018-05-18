package Buoi4;

public class Customer {
	private String customerName;
	
	private String changeCustomerName(String changeName) {
		return changeName;
	}
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.customerName = "Quang Duy";
		System.out.println("Hello " + customer.customerName + " Ahihi !!");
		System.out.println("Hello again " + customer.changeCustomerName("Duy dep trai qua !!"));
	}
}
