/*Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.*/

package Triangulo;

import java.util.Scanner;

import Triangulo.entities.Rectangle;

public class Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Rectangle rectangle = new Rectangle();

        double width;
        double height;

        System.out.println("Enter rectangle widght and height: ");
        width = sc.nextDouble();
        height = sc.nextDouble();

        double area = Rectangle.Area(width, height);
        double perimeter = Rectangle.Perimeter(height, width);
        double diagonal = Rectangle.Diagonal(height, width);

        System.out.println("AREA = "+ area);
        System.out.println("PERIMETER = "+ perimeter);
        System.out.println("DIAGONAL = "+ diagonal);

        sc.close();
        
        
    }
    
}
