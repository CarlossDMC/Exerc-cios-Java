package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entities.Equipe;
import utilities.Formulario;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Formulario fm = new Formulario();
		Equipe equipes = new Equipe();
		
		String op = "Y";
		
		while((op).equals("Y")){
			
			Equipe equipe = new Equipe();
			
			fm.clean();

			fm.perguntarStr();
			fm.perguntarInt();
			
			
				equipe.setNome(fm.getFormStr(0));
				equipe.setCidade(fm.getFormStr(1));
				equipe.setNome_Tecnico(fm.getFormStr(2));
				equipe.setEmail(fm.getFormStr(3));
				equipe.setPontos(fm.getFormInt(0));
				equipe.setVitorias(fm.getFormInt(1));
				equipe.setSets_Vencidos(fm.getFormInt(2));
				equipe.setPosicaoFinal(fm.getFormInt(3));
				
			
			equipes.setEquipes(equipe);
			
			System.out.print("Digite Y para cadastrar mais equipes ou qualquer tecla para encerrar: ");
			op = sc.next();
			
		}
			
			List<Integer> posicoes = new ArrayList<>();
			int atual = 0;
			int index_Equipe = 0;
			int qntdEquipes = equipes.getLenghtOfEquipes();
			
			for(int i = 0; i<equipes.getLenghtOfEquipes(); i++) {
				atual = equipes.getEquipes().get(i).getPosicaoFinal();
				posicoes.add(atual);
				System.out.println(atual);
				
			}
					
				System.out.println("-----EQUIPE CAMPEA/MELHOR COLOCADA-----");
				System.out.println("Nome: " + equipes.getEquipes().get(index_Equipe).getNome());
				System.out.println("Cidade: " + equipes.getEquipes().get(index_Equipe).getCidade());
				System.out.println("Posicao: " + equipes.getEquipes().get(index_Equipe).getPosicaoFinal());
				System.out.println("Tecnico: " + equipes.getEquipes().get(index_Equipe).getNome_Tecnico());
				System.out.println("Numero de vitorias: " + equipes.getEquipes().get(index_Equipe).getVitorias());
				System.out.println("Numero de sets vencidos: " + equipes.getEquipes().get(index_Equipe).getSets_Vencidos());
				System.out.println("Email da equipe: " + equipes.getEquipes().get(index_Equipe).getEmail());
				System.out.println("-----3 MELHORES EQUIPES-----");
				if(equipes.getLenghtOfEquipes() == 1) {
					System.out.println("Nome: " + equipes.getEquipes().get(index_Equipe).getNome());
					System.out.println("Cidade: " + equipes.getEquipes().get(index_Equipe).getCidade());
				}
				
				if(equipes.getLenghtOfEquipes() == 2) {
					System.out.println("Nome: " + equipes.getEquipes().get(index_Equipe).getNome());
					System.out.println("Cidade: " + equipes.getEquipes().get(index_Equipe).getCidade());
					equipes.removeEquipes(index_Equipe);
					posicoes.remove(index_Equipe);
					index_Equipe = posicoes.indexOf(Collections.min(posicoes));
					System.out.println("Nome: " + equipes.getEquipes().get(index_Equipe).getNome());
					System.out.println("Cidade: " + equipes.getEquipes().get(index_Equipe).getCidade());
				}
				
				else if (equipes.getLenghtOfEquipes() >= 3){
					System.out.println("Nome: " + equipes.getEquipes().get(index_Equipe).getNome());
					System.out.println("Cidade: " + equipes.getEquipes().get(index_Equipe).getCidade());
					equipes.removeEquipes(index_Equipe);
					posicoes.remove(index_Equipe);
					index_Equipe = posicoes.indexOf(Collections.min(posicoes));
					System.out.println("Nome: " + equipes.getEquipes().get(index_Equipe).getNome());
					System.out.println("Cidade: " + equipes.getEquipes().get(index_Equipe).getCidade());
					equipes.removeEquipes(index_Equipe);
					posicoes.remove(index_Equipe);
					index_Equipe = posicoes.indexOf(Collections.min(posicoes));
					System.out.println("Nome: " + equipes.getEquipes().get(index_Equipe).getNome());
					System.out.println("Cidade: " + equipes.getEquipes().get(index_Equipe).getCidade());
					
				
				}
				
				System.out.println("----------------------------------------");
				System.out.println("Quantidade de equipes: " + qntdEquipes);

				sc.close();
	
	
	
	
	
}}
