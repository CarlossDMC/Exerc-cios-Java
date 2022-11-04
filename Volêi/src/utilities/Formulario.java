package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Formulario {
	
	public Formulario() {
		
	}

	Scanner sc = new Scanner(System.in);
	
	List<String> formStr = new ArrayList<>();
	
	public String getFormStr(int index) {
		return formStr.get(index);
	}

	public int getFormInt(int index) {
		return formInt.get(index);
	}
	
	public int getLenght() {
		return formStr.size() + formInt.size();
	}
	

	List<Integer> formInt = new ArrayList<>();
	
	public List<String> perguntarStr() {
		System.out.println("--------CADASTRO--DE--EQUIPES--------");
		System.out.print("Digite o nome da equipe: ");
		formStr.add(sc.next());
		System.out.print("Digite a cidade da equipe: ");
		formStr.add(sc.next());
		System.out.print("Digite o nome do tecnico da equipe: ");
		formStr.add(sc.next());
		System.out.print("Digite o email da equipe: ");
		formStr.add(sc.next());

		
		return formStr;
		
	}
	
	public List<Integer> perguntarInt() {
		System.out.print("Digite a quantidade de pontos da equipe: ");
		formInt.add(sc.nextInt());
		System.out.print("Digite a quantidade de vitorias da equipe: ");
		formInt.add(sc.nextInt());
		System.out.print("Digite o numero de sets vencidos da equipe: ");
		formInt.add(sc.nextInt());
		System.out.print("Digite a posicao final da equipe: ");
		formInt.add(sc.nextInt());
		System.out.println("----------------------------------");
		
		return formInt;
		
		
	}
	
	public void clean() {
		formInt.removeAll(formInt);
		formStr.removeAll(formStr);
	}
	
	

}
