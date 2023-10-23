/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_2;

import java.util.Scanner;

/**
 Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números. 
 * (Por exemplo: se o usuário digitar 2 e -9, a saída deverá ser 3 e -8, porque 3 é consecutivo de 2.
 * –8 é consecutivo de –9) 
 */
public class Lista1_ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escolha um número");
        int n1 = entrada.nextInt();
        
        System.out.println("Escolha um número");
        int n2 = entrada.nextInt();
        
        System.out.println("O número a frente de " + n1 + " é " + (n1 + 1));
        System.out.println("O número a frente de " + n2 + " é " + (n2 + 1));
    }
    
}
