package Lista2;

import java.util.Scanner;

/**
 Faça um programa que leia um número N do usuário, some todos os números inteiros de 1 a N, 
 * e mostre o resultado obtido. Use o laço WHILE. 
 */
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int n = scanner.nextInt(), soma = 0, i = 1;
        
        while (i <= n) {
            
            soma += i;
            i++;
        }
        System.out.println("A soma dos números inteiros de 1 a " + n + " é " + soma);
    }
}

        
        
        
