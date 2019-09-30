package pack;


public class Product {
	private int productId;
	private String productName;
	private int quantityOrdered;
	private int price;
	public Product() {
		super();
	}
	public Product(int productId, String productName, int quantityOrdered, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantityOrdered = quantityOrdered;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", quantityOrdered="
				+ quantityOrdered + ", price=" + price + "]";
	}
}

