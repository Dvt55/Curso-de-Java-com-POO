package entidade;

public class funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	public void salarioAumentado(double porcentagem) {
	
		salarioBruto = salarioLiquido() + salarioBruto*(porcentagem/100);
	}
	
	
	
}
