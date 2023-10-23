package Lista2;

import java.util.Scanner;

/**
 Faça um programa que mostre todos os números inteiros de 1 a 50. Use o laço WHILE
 */
public class ex1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int i = 1;
        
        while(i <= 50){
            System.out.println(i);
            i++;
        }
    }
}
