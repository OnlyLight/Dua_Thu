package bai2_2;

import java.util.Arrays;

import bai2_1.Author;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty;
	public Book(String name, Author[] authors, double price) {
		super();
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	public Book(String name, Author[] authors, double price, int qty) {
		super();
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public Author[] getAuthors() {
		return authors;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", authors=" + Arrays.toString(authors) + ", price=" + price + ", qty=" + qty
				+ "]";
	}
	public String getNameAuthor() {
		return this.authors[0].getName();
	}
}
