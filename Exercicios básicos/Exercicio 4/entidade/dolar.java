package entidade;

public class dolar {
	
	public static final double IOF = 0.06;
	
	public static double converte(double preco, double quantidade) {
		
		double valor = preco*quantidade;
		valor = (valor*IOF)+valor;
		return valor;
	}
	
}
