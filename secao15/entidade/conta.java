package entidade;

import model.entidade.ExcecaoSaque;

public class conta {
	
	private Integer numero;
	private String titular;
	private Double balanco;
	private Double limite;
	
	
	public conta(Integer numero, String titular, Double balanco, Double limite) {
		this.numero = numero;
		this.titular = titular;
		this.balanco = balanco;
		this.limite = limite;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getBalanco() {
		return balanco;
	}

	public void setBalanço(Double balanco) {
		this.balanco = balanco;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
	public double deposito(Double valor) {
		return balanco += valor;
	}
	public double saque(Double valorSaque) throws ExcecaoSaque {
		if(getBalanco() <= 0) {
			throw new ExcecaoSaque("O seu saldo não é suficiente para fazer um saque");
		}
		if(valorSaque > getLimite()) {
			throw new ExcecaoSaque("Limite insuficiente para saque");
		}
		return balanco -= valorSaque;
	}

	@Override
	public String toString() {
		return "conta [numero=" + numero + ", titular=" + titular + ", balanco=" + balanco + ", limite=" + limite + "]";
	}
	
	
}
