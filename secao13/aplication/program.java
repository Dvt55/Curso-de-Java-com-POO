package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidade.Client;
import entidade.Order;
import entidade.OrderItem;
import entidade.product;
import entidade.enums.OrderStatus;

public class program {
	
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("name: ");
		String Name = sc.nextLine();
		System.out.println("Email: ");
		String Email = sc.nextLine();
		System.out.println("Birth Date (DD/MM/YYYY): ");
		Date BirthDate = sf1.parse(sc.next());
		
		Client cliente = new Client(Name, Email, BirthDate);
		
		System.out.println("Enter Order Date ");
		System.out.println();
		System.out.println("Status ");
		OrderStatus status = OrderStatus.valueOf("PROCESSING");
		
		Order order = new Order(new Date(), status, cliente);
		
		System.out.println("How many items to this order?: ");
		int quantity_items = sc.nextInt();
		
		for(int i=0; i<quantity_items; i++) {
			System.out.println("Product name: ");
			sc.nextLine();
			String name_product = sc.nextLine();
			System.out.println("Product price: ");
			double price = sc.nextDouble();
			
			product Product = new product(name_product, price);
			
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderitem = new OrderItem(quantity, price, Product);
			
			order.addItem(orderitem);
			
			
		}
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
	}
}
