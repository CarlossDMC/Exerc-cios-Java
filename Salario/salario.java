/*Fazer um programa para ler os dados de um funcionário(nome, salario bruto, e imposto). Em seguida, mostrar os dados do funcionario (nome e salario liquido). Em seguida, aumentar o salário do funcionario baseado em porcentagem dada (somente o salario bruto em afetado pela porcentagem e mostrar novamente os dados do funcionario.
 * 
 */

import java.util.Scanner;

import entities.Operation;

public class salario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Operation op = new Operation();
        
        String name;
        double grossalary;
        double tax;
        double increase;

        System.out.println("Write your name: ");
        name = sc.nextLine();

        System.out.println("Enter your  gross salary: ");
        grossalary = sc.nextDouble();

        System.out.println("Enter your tax:");
        tax = sc.nextDouble();

        System.out.println("Employee: " + name + ", $" + grossalary);

        System.out.println("Wich percentage to increase salary? ");
        increase = sc.nextDouble();

        grossalary = op.increaseSalary(grossalary, increase);

        System.out.printf("Updated data: " + name + ", $ " + "%.2f" ,grossalary);

        sc.close();



        
    }
    
}
