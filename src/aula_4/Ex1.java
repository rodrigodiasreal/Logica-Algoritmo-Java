package aula_4;

import java.util.Scanner;

/**
 Escreva um programa em Java que leia 10 números,
 * e imprimir a soma dos números pares e a
 * soma dos números ímpares.
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, somaP = 0, somaI =0;
        
        for(int i=1; i<10; i++){
            System.out.println("Número: ");
            n = input.nextInt();
            
            if(n%2 == 0){
                somaP+=n;
            }else{
                somaI += n;
            }
        }
        System.out.println("Soma Pares: " + somaP);
        System.out.println("Soma ímpares: " + somaI);
    }
}