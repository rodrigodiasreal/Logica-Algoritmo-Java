/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_2;

import java.util.Scanner;

/**
 Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. 
 * O quadrado de um número A é representado por A2 = A * A. 
 */
public class Lista1_ex3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira um número");
        int n1 = entrada.nextInt();
        
        System.out.println("Insira outro número");
        int n2 = entrada.nextInt();
        
        int q1 = n1 * n1;
        int q2 = n2 * n2;
        
        System.out.println("O valor ao quadrado de " + n1 + " é " + q1);
        System.out.println("O valor ao quadrado de " + n2 + " é " + q2);
    }
}
