package entitites;

public class OrderItem {

	private Integer quatity;
	private Double price;
	private Product product;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quatity, Double price, Product product) {
		this.quatity = quatity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuatity() {
		return quatity;
	}

	public void setQuatity(Integer quatity) {
		this.quatity = quatity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double subTotal() {
		return quatity * price;
	}
	
	@Override
	public String toString() {
		return product.getName()
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quatity + ", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
}
