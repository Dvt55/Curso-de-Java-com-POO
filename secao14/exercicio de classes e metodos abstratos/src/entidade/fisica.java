package entidade;

public class fisica extends contribuinte {
	
	private Double gastosSaude;

	public fisica(String nome, Double renda_anual, Double gastosSaude) {
		super(nome, renda_anual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	@Override
	public double imposto() {
		double x = getRenda_anual();
		double y = getGastosSaude();
		if(x < 2000.00) {
			x = (getRenda_anual()*15)/100;
			if(y > 0) {
				x -= (y*50)/100;
			}
			
		}
		else if(x >= 2000.00) {
			x = (getRenda_anual()*25)/100;
			if(y > 0) {
				x -= (y*50)/100;
			}
		}
		return x;
		
	}
	
	
}
