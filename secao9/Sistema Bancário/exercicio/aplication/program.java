package aplication;

import java.util.Scanner;

import banco.cliente;

public class program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Conta: ");
		int conta = sc.nextInt();
		System.out.println("Entre com o nome: ");
		String nome = sc.next();
		
		cliente Cliente;
	
		System.out.println("Deseja fazer um deposito inicial?: ");
		char resposta = sc.next().charAt(0);
		if(resposta == 's') {
			System.out.println("Qual valor?: ");
			double deposito_ini = sc.nextInt();
			Cliente = new cliente(conta, nome, deposito_ini);
		}
		else {
			Cliente = new cliente(conta, nome);
		}
		System.out.println("Dados: ");
		System.out.println(Cliente);
		
		System.out.println();
		
		System.out.println("Entre com um deposito: ");
		double deposito = sc.nextDouble();
		Cliente.deposito(deposito);
		System.out.println(Cliente);
		
		System.out.println("Entre com um saque: ");
		double saque = sc.nextDouble();
		Cliente.saque(saque);
		System.out.println(Cliente);
		
		
		
		
		
		
	}
}
