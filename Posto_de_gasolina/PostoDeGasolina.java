import java.util.Scanner;

/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
exemplo. */

public class PostoDeGasolina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
    
        while(true){

            System.out.println("--Posto de gasolina--");
            System.out.println("Dígite 1 para Alcool: ");
            System.out.println("Dígite 2 para Gasolina: ");
            System.out.println("Dígite 3 para Diesel: ");
            System.out.println("Dígite 4 para Encerrar: ");
            System.out.println("------------------------");

            int entrada;
            
            entrada = sc.nextInt();

            if(entrada == 1){
                System.out.println("--------------------------------------");
                System.out.println("Você abasteceu com Alcool, Obrigado!!");
                System.out.println("--------------------------------------");
                alcool ++;
            }

            if(entrada == 2){
                System.out.println("--------------------------------------");
                System.out.println("Você abasteceu com Gasolina, Obrigado!!");
                System.out.println("--------------------------------------");
                gasolina ++;
            }

            if(entrada == 3){
                System.out.println("--------------------------------------");
                System.out.println("Você abasteceu com Diesel, Obrigado!!");
                System.out.println("--------------------------------------");
                diesel ++;
            }

            if(entrada == 4){
                System.out.println("--------------------------------------");
                System.out.println("Gasolina = " + gasolina);
                System.out.println("Alcool = " + alcool);
                System.out.println("Diesel = " + diesel);
                System.out.println("--------------------------------------");
                System.out.println("Obrigado, volte sempre!!");
                System.out.println("--------------------------------------");

                break;
            }
        }
    }
    
}
