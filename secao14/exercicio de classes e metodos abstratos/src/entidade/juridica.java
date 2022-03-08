package entidade;

public class juridica extends contribuinte{
	
	private Integer numeroFuncionarios;

	public juridica(String nome, Double renda_anual, Integer numeroFuncionarios) {
		super(nome, renda_anual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public double imposto() {
		if(getNumeroFuncionarios() > 10) {
			return (getRenda_anual() * 14)/100;
		}
		else {
			return (getRenda_anual() * 16)/100;
		}
	}
	
}
