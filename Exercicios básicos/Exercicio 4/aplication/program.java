package aplication;

import java.util.Scanner;

import entidade.dolar;

public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double preco = sc.nextDouble();
		double quantidade = sc.nextDouble();
		
		dolar.converte(preco,quantidade);
		
		
		System.out.println(dolar.converte(preco,quantidade));
	}
}
