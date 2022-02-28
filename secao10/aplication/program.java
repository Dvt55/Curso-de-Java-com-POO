package aplication;

import java.text.ParseException; 

import java.util.Scanner;

import entidade.pensionato;

public class program {

	public static void main(String[] args)  throws ParseException  {
		
		Scanner sc = new Scanner(System.in);
		
		pensionato[] vet = new pensionato[10];
		
		System.out.println("Digite o numero de alugueis: ");
		int num_de_alugueis = sc.nextInt();
		
		for(int i=1; i<=num_de_alugueis; i++) {
			sc.nextLine();
			System.out.println("Reserva " + i + ": ");
			System.out.println("Nome do cliente: ");
			String nome = sc.nextLine();
			System.out.println("Email do cliente: ");
			String email = sc.nextLine();
			System.out.println("Quarto reservado: ");
			int quarto = sc.nextInt();
			
			for(int j=0; j<10; j++) {
				if(j == quarto) {
					vet[j] = new pensionato(nome,email);
				}
			}
		}
		for(int i=0; i<10; i++) {
			if(vet[i] != null) {
				System.out.println(i + ":" + vet[i].getNome() + "," + vet[i].getEmail());
				
			}
		}
		
	}
}
