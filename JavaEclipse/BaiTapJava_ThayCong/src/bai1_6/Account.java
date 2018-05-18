package bai1_6;

public class Account {
	private String id;
	private String name;
	private int blance = 0;
	public Account(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Account(String id, String name, int blance) {
		super();
		this.id = id;
		this.name = name;
		this.blance = blance;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBlance() {
		return blance;
	}
	public int credit(int amount) {
		return this.blance + amount;
	}
	public int debit(int amount) {
		if(amount <= this.blance) this.blance = this.blance - amount;
		else System.out.println("Amount exceeded balance");
		return this.blance;
	}
	public int transferTo(Account another, int amount) {
		if(amount <= this.blance) another.blance = amount;
		else System.out.println("Amount exceeded balence");
		return this.blance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", blance=" + blance + "]";
	}
	
}
