package entidade;

public class aluno {
	
	public String nome;
	public float nota1;
	public float nota2;
	public float nota3;
	
	public float soma() {
		return nota1+nota2+nota3;
	}
	public double var() {
		float x = 100;
		return x*(60.0/100.0);
	}
	
}
