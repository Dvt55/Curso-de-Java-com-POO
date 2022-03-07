package entidade;

public class importedProduct extends product{
	
	private Double customsFree;

	public importedProduct(String name, Double price, Double customsFree) {
		super(name, price);
		this.customsFree = customsFree;
	}

	public Double getCustomsFree() {
		return customsFree;
	}

	public void setCustomsFree(Double customsFree) {
		this.customsFree = customsFree;
	}
	@Override
	public String priceTag() {
		double x = getPrice() + getCustomsFree();
		return getName() + " $ " + x;
	}
	
}
