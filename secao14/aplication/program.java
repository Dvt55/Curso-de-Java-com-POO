package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidade.UsedProduct;
import entidade.importedProduct;
import entidade.product;

public class program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sf1 = new SimpleDateFormat("dd/MM/yyyy"); 
		Scanner sc = new Scanner(System.in);
		
		List<product>list = new ArrayList<>();
		
		System.out.println("Enter the number of product: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Product" + "#" + i + "Data: ");
			System.out.println("Common, used or imported (c/u/i)?: ");
			char c = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Price: ");
			double price = sc.nextDouble();
			if(c == 'i') {
				System.out.println("Customs Free: ");
				double customsFree = sc.nextDouble();
				
				product prod = new importedProduct(name, price, customsFree);
				
				list.add(prod);
			}
			else if(c == 'u'){
				System.out.println("Manufacture Date (DD/MM/YYYY): ");
				Date manufacture_date = sf1.parse(sc.next());
				
				list.add(new UsedProduct(name, price, manufacture_date));
			}
			else {
				list.add(new product(name, price));
			}
		}
		System.out.println("PRICE TAG: ");
		for(product p : list) {
			System.out.println(p.priceTag());
		}
		
	}
}
