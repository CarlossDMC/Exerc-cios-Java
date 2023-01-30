package main;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Parcela;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados do contrato");
		
		System.out.println("Numero: ");
		int numero = sc.nextInt();
		
		System.out.println("Insira o valor do contrato: ");
		Double valor = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Data do contrato (dd/mm/yy): ");
		String data = sc.nextLine();
		LocalDate data_ = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println("Numero de parcelas: ");
		int mesesdoparcelamento = sc.nextInt();
		
		Contract contrato = new Contract(numero, data_, valor, mesesdoparcelamento);
		ArrayList<Parcela> parcelas = contrato.processarContrato(mesesdoparcelamento, contrato);
		
		System.out.println("Parcelas");
		for(int i = 0; i<parcelas.size(); i++) {
			
			System.out.println(parcelas.get(i).getValorTotal());
			System.out.println(parcelas.get(i).getVencimento());
		}
		
		
		
		
		
		
	}
	

}
