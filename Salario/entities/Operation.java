package entities;

public class Operation {
     
    public double salary;

    public static double increaseSalary(double salary, double percentage){

        percentage = (percentage / 100) + 1;

        return salary = percentage*salary;
        
    }
    
}
