package model.entidade;

public class ExcecaoSaque extends Exception{
	private static final long serialVersionUID = 1L;
	
	public ExcecaoSaque(String msg) {
		super(msg);
	}
}
