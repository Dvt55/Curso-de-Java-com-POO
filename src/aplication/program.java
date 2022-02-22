package aplication;

import java.util.Scanner;

import entidade.retangulo;

public class program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		retangulo ret = new retangulo();
		
		System.out.println("Entre com o lado 1 do retangulo: ");
		ret.l1 = sc.nextDouble();
		System.out.println("Entre com o lado 2 do retangulo: ");
		ret.l2 = sc.nextDouble();
		
		double area = ret.area();
		double perimetro = ret.perimetro();
		double diagonal = ret.diagonal();
		
		System.out.printf("Area: %.2f ", ret.area());
		System.out.printf("perimetro: %.2f ", ret.perimetro());
		System.out.printf("Diagonal: %.2f ", ret.diagonal());
	}
}
