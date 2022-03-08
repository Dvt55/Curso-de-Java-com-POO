package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.contribuinte;
import entidade.fisica;
import entidade.juridica;

public class program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<contribuinte>list = new ArrayList<>();
		
		System.out.println("Quantos contribuintes?: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Imposto " + i + ": ");
			System.out.println("Fisica ou juridica?: F/J");
			char c = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			if(c == 'f') {
				System.out.println("Total de gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				list.add(new fisica(nome, rendaAnual, gastosSaude));
			}
			else if(c == 'j'){
				System.out.println("Numero de pessoas: ");
				int pessoas = sc.nextInt();
				list.add(new juridica(nome, rendaAnual, pessoas));
			}
		}
		System.out.println("IMPOSTOS PAGOS: ");
		for(contribuinte func : list) {
			System.out.println(func.getNome() + ": " + "$ " + func.imposto());
		}
	}
}
