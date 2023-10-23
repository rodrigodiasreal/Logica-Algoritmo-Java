package aula_2;

import java.util.Scanner;

/**
 Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação) dos dois números.  
 */
public class Lista1_ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
                   
        System.out.println("Multiplicando valores");
        System.out.println("Primeiro valor: " );
        int numero1 = entrada.nextInt();
        
        System.out.println("Segundo valor: ");
        int numero2 = entrada.nextInt();
        
        int multiplicacao = numero1 * numero2;
        
        System.out.println("O valor de " + numero1 + " x " + numero2 + " = " + multiplicacao);
                    }
}
