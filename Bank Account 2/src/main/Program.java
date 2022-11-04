package main;

import java.util.Scanner;

import entities.Account;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try{

            System.out.println("Enter account data: ");
            System.out.println("Number: ");
            int number = sc.nextInt();
            System.out.println("'Holder: ");
            String holder = sc.next();
            System.out.println("Initial balance: ");
            Double balance = sc.nextDouble();
            System.out.println("Withdraw limit: ");
            Double withdrawlimit = sc.nextDouble();

            Account acc = new Account(number, holder, balance, withdrawlimit);


            System.out.println("Enter amount for withdraw: ");
            acc.withdraw(sc.nextDouble());

            System.out.println("New balance: " + acc.getBalance());



        }

        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        finally{
            sc.close();
        }


        
    }
    
}
