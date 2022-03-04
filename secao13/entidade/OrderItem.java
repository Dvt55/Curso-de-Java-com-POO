package entidade;

public class OrderItem {
	
	private Integer quantity;
	private double price;
	private product Product;
	
	public OrderItem(Integer quantity, double price, product Product) {
		this.quantity = quantity;
		this.price = price;
		this.Product = Product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public product getProduct() {
		return Product;
	}

	public void setProduct(product product) {
		this.Product = product;
	}

	public double subTotal() {
		return quantity * price;
	}
	public String toString() {
		return product.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
}
