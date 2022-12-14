package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface employees {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> employees_name = new ArrayList<>();
		List<Integer> employees_id = new ArrayList<>();
		List<Double> employees_salary = new ArrayList<>();
		Double increase;
		int id_increase;
		
		System.out.println("How many employees will be registered: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter the name of the employee: ");
			employees_name.add(sc.next());
			System.out.println("Enter the id of the employee: ");
			employees_id.add(sc.nextInt());
			System.out.println("Enter the salary of the employee: ");
			employees_salary.add(sc.nextDouble());
			
		}
		
		System.out.println("Enter the value of the increase and the id of the employee: ");
		increase = sc.nextDouble();
		id_increase = sc.nextInt();
		
		int index = employees_id.indexOf(id_increase);
		
		if(index == -1) {
			System.out.println("This id does not exist.");
		}
		else {
			Double in = employees_salary.get(index) + increase;
			employees_salary.add(index, in);
			System.out.println("SUCCESS");
		}
		
		for(int i=0; i<employees_name.size(); i++) {
			System.out.println("--------------------------------------");
			System.out.println("List of employees:");
			System.out.println("Employee #" + (i + 1));
			System.out.println("Name: " + employees_name.get(i));
			System.out.println("Id: " + employees_id.get(i));
			System.out.println("Salary: " + employees_salary.get(i));
		}
		
	}

}
