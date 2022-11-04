package main;

import java.text.ParseException;
import java.util.Scanner;

import entities.Pessoa;

public class Program {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		Pessoa ps = new Pessoa();
		
		int vzs = 0;
		
		System.out.println("---------------------------------------------");
		System.out.print("Digite quantas pessoas voce quer cadastrar: ");
		vzs = sc.nextInt();
		System.out.println("---------------------------------------------");
		
		for(int i = 0; i<vzs; i++) {
			System.out.print(" Nome: ");
			String nome = sc.next();
			System.out.print(" Data de nascimento (dd/mm/yy): ");
			String nascimento = sc.next();
			System.out.print(" Sexo: (M/F): ");
			String sexo = sc.next().toUpperCase();
			System.out.print(" Salario: ");
			Double salario = sc.nextDouble();
			System.out.print(" Peso: ");
			Double peso = sc.nextDouble();
			System.out.print(" Altura: ");
			Double altura = sc.nextDouble();
			System.out.println("--------------------------------------");
			
			Pessoa pessoa = new Pessoa(nome, nascimento, sexo, salario, peso, altura);
			
			ps.addObject(pessoa);
			
		}
		
		for(int i = 0; i<ps.getLenght(); i++) {
			System.out.println((i != 0) ? "--------------------------------------" : "---------Listagem de Pessoas----------");
			System.out.print(ps.getPessoa(i).printAll());
			System.out.println(ps.getPessoa(i).getIdade());
			System.out.println(ps.getPessoa(i).getIMC());
			System.out.println("--------------------------------------");
		}
		
		System.out.println("-------------Dados Gerais-------------");
		System.out.println(" Numero de cadastros: " + ps.getLenght());
		System.out.println(ps.getHomensMulheres());
		System.out.println(ps.getAcumuloDeSalarioEMedia());
		System.out.println("--------------------------------------");
		
		sc.close();	
		
		
	}

}
