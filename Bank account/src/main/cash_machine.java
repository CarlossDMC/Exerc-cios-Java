package main;

import java.util.Scanner;

import utilities.operations;

public class cash_machine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double deposit = 0;
		
		System.out.println("Insert the owner name: ");
		String owner_name = sc.next();
		
		System.out.println("Insert the number account: ");
		int number_account = sc.nextInt();
		
		System.out.println("If you want to make a initial deposit press (y/n): ");
		String r = sc.next();
		
		if(r == "y") {
			System.out.println("Insert the initial deposit: ");
			deposit = sc.nextDouble();
		}
		
		operations op = new operations(number_account, owner_name, deposit);
		
		System.out.printf(op.getOwner_name() + " |" + op.getNumber_account() + "| The balance of your account is: $ %.2f\n" , op.getBalance());
		
		System.out.println("Insert the value of deposit: ");
		deposit = sc.nextDouble();
		op.deposit(deposit);
		
		System.out.printf(op.getOwner_name() + " |" + op.getNumber_account() + "| The balance of your account is: $ %.2f\n" , op.getBalance());
		
		System.out.println("Insert the value of withdraw: ");
		double withdraw = sc.nextFloat();
		op.withdraw(withdraw);
		
		System.out.printf(op.getOwner_name() + " |" + op.getNumber_account() + "| The balance of your account is: $ %.2f\n" , op.getBalance());
		
		
		sc.close();
		

	}

}
