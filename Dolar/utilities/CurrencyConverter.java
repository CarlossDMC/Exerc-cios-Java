package Dolar.utilities;

public class CurrencyConverter{

    public static double currency;
    public static double value;

    public static double converter(double value, double currency){
        value = currency * value;
        value = 1.06 * value;
        return value;

    }
    
}