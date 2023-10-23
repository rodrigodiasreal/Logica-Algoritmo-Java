package Lista2;

import java.util.Scanner;

/**
 Escreva um programa que leia um conjunto de 10 números inteiros positivos. 
 * Seu programa deve determinar e imprimir o maior deles. Use o laço FOR. 
 */
public class ex3 {
    public static void main(String[] args) {
        
          Scanner input = new Scanner(System.in);
          int maior = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            int numero = input.nextInt();
            if (numero > maior) {
                maior = numero;
            }
             System.out.println("O maior número é " + maior);
        }
       
    }

 }
   