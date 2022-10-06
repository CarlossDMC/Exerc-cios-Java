package application;

import java.util.Scanner;

public class Altura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] name;
		int[] age;
		Double[] height;
		
		System.out.print("How many people will be inserted: ");
		int n =  sc.nextInt();
		
		name = new String[n];
		age = new int[n];
		height = new Double[n];
		
		
		for(int i = 0; i<name.length;i++) {
			
			System.out.print("Insert the name: ");
			name[i] =  sc.next();
			
			System.out.print("Insert the age: ");
			age[i] =  sc.nextInt();
			
			System.out.print("Insert the height: ");
			height[i] =  sc.nextDouble();
			
		}
		
		Double weight_average = 0.0;
		Double age_percentage = 0.0;
		String[] age_name;
		age_name = new String[n];
		
		for(int i=0; i<age.length; i++) {
			weight_average += age[i];
			if(age[i] < 16) {
				age_percentage += 1;
				age_name[i] = name[i];
			}
		}
		
		weight_average = weight_average / age.length;
		age_percentage = (age_percentage / age.length) * 100;
		
		System.out.printf("Weight average: %.2f", weight_average);
		System.out.println("");
		System.out.printf("Percentage of people under the age of 16: %.2f", age_percentage);
		System.out.println("");
		for(int i=0; i<age_name.length; i++) {
			if(age_name[i] != null) {
				System.out.print(age_name[i]);
			}
			
		}
		
		
	
		
		
		
		
		
		
		
		
		sc.close();
		

	}

}
