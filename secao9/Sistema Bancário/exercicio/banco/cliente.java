package banco;

public class cliente {
	private int conta;
	private String nome;
	private double saldo;
	
	
	public cliente(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}
	/* conta = 0, String = null, deposito_ini = 0 ;
	 * palavra this altera;
	 * */
	public cliente(int conta, String nome, double deposito_ini) {
		this.conta = conta;
		this.nome = nome;
		deposito(deposito_ini);
	}
	
	public int getConta() {
		return conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void getSaldo() {
		this.saldo = saldo;
	}
	public void deposito(double deposito) {
		saldo+=deposito;
	}
	public void saque(double saque) {
		saldo-= (saque+5.0);
	}
	public String toString() {
		return "Conta: " + conta + ", " + "Nome: " + nome + ", "
				+ "Saldo: " + saldo;
	}
	
	
}
