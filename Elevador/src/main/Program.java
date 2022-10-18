package main;

import java.util.Scanner;

import entitites.Elevador;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a capacidade do elevador: ");
		int capacidadeElevador = sc.nextInt();
		
		System.out.print("Digite o total de andares do prédio: ");
		int totalAndares = sc.nextInt();
		
		Elevador elevador = new Elevador(0, totalAndares, capacidadeElevador, 0);
		
		System.out.println("");
		elevador.entra();
		System.out.println("Uma pessoa entrou no elevador, Total de ocupantes: " + elevador.getOcupantesElevador());
		System.out.println("");
		elevador.sai();
		System.out.println("Uma pessoa saiu, Total de ocupantes: " + elevador.getOcupantesElevador());
		System.out.println("");
		elevador.sobe();
		System.out.println("O elevador subiu, andar atual: " + elevador.getAndarAtual());
		System.out.println("");
		elevador.desce();
		System.out.println("O elevador desceu, andar atual: " + elevador.getAndarAtual());
		System.out.println("");
		
		
		sc.close();
		
		
		
	}

}
