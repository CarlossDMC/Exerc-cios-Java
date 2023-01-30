package main;

import java.util.HashSet;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    HashSet<Integer> cursos = new HashSet<>();
	    
	  
	    System.out.println("Quantos estudantes para o curso A: ");
	    int qA  = sc.nextInt();
	    
	    for(int i=0; i<qA; i++) {
	    	System.out.println("Digite o id do aluno: " + i);
	    	cursos.add(sc.nextInt());
	    	
	    }
	    
	    System.out.println("Quantos estudantes para o curso B: ");
	    int qB  = sc.nextInt();
	    
	    for(int i=0; i<qB; i++) {
	    	System.out.println("Digite o id do aluno: " + i);
	    	cursos.add(sc.nextInt());
	    	
	    }
	    
	    System.out.println("Quantos estudantes para o curso C: ");
	    int qC  = sc.nextInt();
	    
	    for(int i=0; i<qC; i++) {
	    	System.out.println("Digite o id do aluno: " + i);
	    	cursos.add(sc.nextInt());
	    	
	    }
	    
	    System.out.println("Total de alunos: " + cursos.size());
	    
	    

	    
	    
	    
	    
		
		
	}

}
