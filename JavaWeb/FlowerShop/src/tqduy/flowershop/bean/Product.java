package tqduy.flowershop.bean;

public class Product {
	private int productID;
	private String productTitle;
	private String productName;
	private String productImage;
	private String productDescription;
	public Product() {
		super();
	}
	public Product(int productID, String productTitle, String productName, String productImage,
			String productDescription) {
		super();
		this.productID = productID;
		this.productTitle = productTitle;
		this.productName = productName;
		this.productImage = productImage;
		this.productDescription = productDescription;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductTitle() {
		return productTitle;
	}
	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
}
