package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employees;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the file source: ");
		String source = sc.nextLine();
		List<Employees> employees = new ArrayList<Employees>();
		

		try {
			BufferedReader reader = new BufferedReader(new FileReader(source));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] list = line.split(",");
				String name = list[0];
				String email = list[1];
				Double salary = Double.parseDouble(list[2]);
				employees.add(new Employees(name,email,salary));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Double csalary = sc.nextDouble();
		
		System.out.println("Email of people whose salary is more than " + csalary);
		
		List<String> filtersalary = employees.stream().filter(employee -> employee.getSalary() > csalary).map(employee -> employee.getEmail()).sorted().collect(Collectors.toList());
	
		for(String salary : filtersalary) {
			System.out.println(salary);
		}
		
		List<Employees> sumsalary = employees.stream().filter(employee -> String.valueOf(employee.getName().charAt(0)).equals("M")).collect(Collectors.toList());
		
		Double sum = 0.0;
		
		for(Employees salary : sumsalary) {
			sum += salary.getSalary();
		}
		
		System.out.println(sum);
		
		
}}
