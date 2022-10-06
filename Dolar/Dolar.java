package Dolar;

import java.util.Scanner;

import Dolar.utilities.CurrencyConverter;

public class Dolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Whats the dollar price: ");
        CurrencyConverter.currency = sc.nextDouble();

        System.out.println("How many dollars will be bought: ");
        CurrencyConverter.value = sc.nextDouble();

        double reais = CurrencyConverter.converter(CurrencyConverter.value, CurrencyConverter.currency);

        System.out.printf("Amount to be paid in reais:  %.2f\n", reais);
    }
    
}
