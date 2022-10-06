package Triangulo.entities;

public class Rectangle{

    public static double height;
    public static double width;

    public static double Area( double height, double width){
        return width * height;

    }

    public static double Perimeter(double height, double width){
        return 2 * (height + width);
    }

    public static double Diagonal(double height, double width){
        return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
    }

}