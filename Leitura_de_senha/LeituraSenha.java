/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002. */

import java.util.Scanner;

public class LeituraSenha{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int senha = 2002;
        int entrada = 0;

        while(senha != entrada){
            System.out.println("Diigite sua senha: ");
            entrada = sc.nextInt();
            if(entrada == senha){
                System.out.println("Senha correta");
                break;
            }
            else{
                System.out.println("Senha incorreta");
            }
        }
        
    }
}