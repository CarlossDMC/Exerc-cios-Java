package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter client data: ");
		
		System.out.println("Name: ");
		String name = sc.next();
		System.out.println("Birth Date (DD/MM/YYYY): ");
		String birthay__ = sc.next();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate birthay = LocalDate.parse(birthay__, formatter);
		System.out.println("Email: ");
		String email = sc.next();
		
		System.out.println("");
		
		System.out.println("Enter order data:");
		
		System.out.println("Status: ");
		String status_ = sc.next();
		OrderStatus status = OrderStatus.valueOf(status_.toUpperCase());
		
		String now = LocalDate.now().format(formatter);
		
		Order order = new Order(now, status, new Client(name, email, birthay));
		
		System.out.println("How many items to this order? ");
		int quantity = sc.nextInt();
		
		for(int i = 0; i<quantity; i++) {
			System.out.print("Product name: ");
			String pdname = sc.next();
			
			System.out.print("Product price: ");
			Double pdprice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int pdquantity = sc.nextInt();
			
			OrderItem item = new OrderItem(pdquantity, pdprice, new Product(pdname, pdprice));
			order.addItem(item);
		}
		
        System.out.println("\nORDER SUMMARY:");
        System.out.println("Order moment: " + order.getMoment());
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client: " + order.getClient().getName() + " (" + formatter.format(order.getClient().getBirthay()) + ") - " + order.getClient().getEmail());

        System.out.println("\nOrder items:");
        for (OrderItem item : order.getItem()) {
            System.out.print(item.getProduct().getName());
            System.out.printf(", $%.2f, ", item.getPrice());
            System.out.print("Quantity: " + item.getQuantity());
            System.out.printf(", Subtotal: $%.2f\n", item.subTotal());
        }

        System.out.printf("\nTotal price: $%.2f", order.total());
		
		

	}

}
