package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> candidatos = new HashMap<>();
		
		System.out.println("Digite o caminho do arquivo: ");
		String caminho = sc.nextLine();
		
		
		try {
			FileReader fl = new FileReader(caminho);
			BufferedReader br = new BufferedReader(fl);
			
			String line;
		    while ((line = br.readLine()) != null) {
		    	String[] list = line.split(",");
		    	if(candidatos.containsKey(list[0])) {
		    		int value = candidatos.get(list[0]);
			    	value += Integer.parseInt(list[1]);
			    	candidatos.put(list[0], value);
		    	}
		    	else {candidatos.put(list[0], Integer.parseInt(list[1]));}
		    	
		    	}
		    
		}
		
		catch(IOException e){
			e.printStackTrace();
		}
		
		for (String key : candidatos.keySet()) {
		    System.out.println(key + " : " + candidatos.get(key));
		}
		
		
	}

}
