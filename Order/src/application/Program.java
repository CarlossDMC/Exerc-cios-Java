package application;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Client;
import entities.Item;
import entities.Order;
import entities.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat dateFormat_ = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("--------------------------------------------------");
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birthay dd/MM/yyyy: ");
		String birthay = sc.next();
		System.out.println("--------------------------------------------------");

		Client client = new Client(name, email, birthay);

		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		System.out.print("How many items to this order? ");
		int quantity = sc.nextInt();
		System.out.println("--------------------------------------------------");

		Order od = new Order(null, status);
		Item pd = new Item();

		for(int i = 0; quantity > i; i++) {

			System.out.println("Enter the #" + (i+1) + " Product data: ");
			System.out.print("Product name: ");
			pd.setName(sc.next()); 
			System.out.print("Product price: ");
			pd.setPrice(sc.nextDouble());
			System.out.print("Quantity: ");
			pd.setQuantity(sc.nextInt());
			od.addItem(pd);
		};

		System.out.println("ORDER SUMARY:");
		
		System.out.println("------------------------------------------------");
		System.out.println("Order moment: " + od.getIndexOfItem(0).getMoment());
		System.out.println("Order status: " + od.getOrder());
		System.out.println("Client: " + client.getName() + " " + client.getBirthay() + " " + client.getEmail());
		System.out.println("------------------------------------------------");
		
		for(int i = 0; i < od.getLenghtOfItem(); i++) {
			
			System.out.println("Product #" + i);
			System.out.println("Order moment: " + od.getIndexOfItem(i).getMoment());
			System.out.println("Order status: " + od.getOrder());
			System.out.println("Client: " + client.getName() + " " + client.getBirthay() + " " + client.getEmail());
			System.out.println("Name: " + pd.getName());
			System.out.println("Price: " + pd.getPrice());
			System.out.println("Quantity: " + pd.getQuantity());
			System.out.println("Subtotal: " + pd.getSubtotal());
			System.out.println("--------------------------------------------------");
		}


		sc.close();
	}
}
