package aplication;

import java.util.Scanner;

import entidade.aluno;

public class program {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			aluno Aluno = new aluno();
			
			Aluno.nome = sc.nextLine();
			Aluno.nota1 = sc.nextFloat();
			Aluno.nota2 = sc.nextFloat();
			Aluno.nota3 = sc.nextFloat();
			
			System.out.println(Aluno.nome);
			System.out.println(Aluno.soma());
			
			if(Aluno.soma()<Aluno.var()) {
				System.out.println("REPROVADO");
				System.out.println("Faltaram: " + (Aluno.var()-Aluno.soma()) + " pontos");
			}
			else {
				System.out.println("APROVADO");
			}
			
			
			
		}
}
