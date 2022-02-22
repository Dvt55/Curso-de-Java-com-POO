package aplication;

import java.util.Scanner;

import entidade.funcionario;

public class program {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			funcionario func = new funcionario();
			
			func.nome = sc.nextLine();
			func.salarioBruto = sc.nextDouble();
			func.imposto = sc.nextDouble();
			
			System.out.println("Salario Líquido: " + func.nome + ", " + func.salarioLiquido());
			System.out.println("Qual a porcentagem de incremento?: ");
			double porcentagem = sc.nextDouble();
			func.salarioAumentado(porcentagem);
			System.out.println("Salario atualizado: " + func.salarioBruto);
			
			
		}
}
