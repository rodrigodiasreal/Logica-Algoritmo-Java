/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_2;

import java.util.Scanner;

/**
 Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado L.
 */
public class Lista1_ex5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Coloque o valor da base do seu quadrado");
        int l = entrada.nextInt();
        
        int a = l*l;
        
        System.out.println("O valor da área do seu quadrado é " + a + ".");
    }
}
