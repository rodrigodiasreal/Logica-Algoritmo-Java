/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_4;

import java.util.Scanner;

/**
 Algoritmo para somar 10 números digitados pelo usuário.
 */
public class Exemplo_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n, soma = 0;
        for(int i=1; i<=10; i++){
            System.out.println("Número: ");
            n = input.nextInt();
            
            soma = soma + n;
        }
        
        System.out.println("Soma: " + soma);
    }
 }
