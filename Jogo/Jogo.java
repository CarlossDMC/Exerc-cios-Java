package Jogo;

import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inicio;
        int final_;

        System.out.println("Dígite o horarío de início: ");
        inicio = sc.nextInt();

        System.out.println("Dígite o horarío de final: ");
        final_ = sc.nextInt();

        int r;

        if(inicio > final_){
            r = inicio - final_ -24;
        }
        else{
            r = inicio - final_ + 24;
        }
        
        int rc = Math.abs(r);

        if(rc > 24){
            System.out.println("Duração maxima 24 hrs...");
        }
        System.out.println("O jogo durou: " + rc + "Hrs...");


        sc.close();
        
    }
    
}
