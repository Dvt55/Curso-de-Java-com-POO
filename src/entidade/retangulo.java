package entidade;

public class retangulo {
	
	public double l1;
	public double l2;
	
	public double area() {
		return l1*l2;
	}
	public double perimetro() {
		return (2*l1)+(2*l2);
	}
	public double diagonal() {
		return l2*(Math.sqrt(2));
	}
	
}
