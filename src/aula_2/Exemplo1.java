package aula_2;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Exemplo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("+- Cálculo da média");
        System.out.println("Nota 1: ");
        float n1 = input.nextFloat();
        System.out.println("Nota 2: ");
        float n2 = input.nextFloat();
        float media = (n1 + n2)/2; 
        
        if(media >= 6){
            System.out.println("Aprovado!");
            System.out.println("Média: " + media);
        } else {
            System.out.println("Reprovado");
            System.out.println("Média: " + media);
        }
    }
}
