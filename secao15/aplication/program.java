package aplication;

import java.util.Scanner;

import entidade.conta;
import model.entidade.ExcecaoSaque;

public class program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
			System.out.println("Número: ");
			Integer numero = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Titular: ");
			String titular = sc.nextLine();
			
			System.out.println("saldoInicial: ");
			Double saldoInicial = sc.nextDouble();
			
			System.out.println("Limite de saque: ");
			Double limite = sc.nextDouble();
			
			conta Conta = new conta(numero, titular, saldoInicial, limite);
			
			System.out.println();
			System.out.println("Digite uma quantia para saque");
			Double saque = sc.nextDouble();
			
			try {
				Conta.saque(saque);
				System.out.println("Novo Saldo: " + Conta.getBalanco());
			}
			catch(ExcecaoSaque e) {
				System.out.println(e.getMessage());
			}
				
		
	}
}
