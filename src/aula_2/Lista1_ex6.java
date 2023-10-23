/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_2;

import java.util.Scanner;

/**
 Escreva um algoritmo que leia três números decimais: A, B e C. 
 * Em seguida, calcule e mostre:  
 * a) a área do triângulo retângulo que tem A por base e C por altura.  
 * b) a área do círculo de raio C. (π = 3.14159)  
 * c) a área do trapézio que tem A e B por bases e C por altura.  
 * d) a área do quadrado que tem lado B.  
 * e) a área do retângulo que tem lados A e B. 
 * f) o perímetro do retângulo que tem lados A e B. 
 */
public class Lista1_ex6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira um número decimal");
        int a = entrada.nextInt();
        
        System.out.println("Insira outro decimal");
        int b = entrada.nextInt();
        
        System.out.println("Insira o último decimal");
        int c = entrada.nextInt();
        
        int area = (a*c)/2;
        int circulo = (int) (Math.PI * (c*c));
        int trapezio = ((a + b)*c)/2;
        int quadrado = b*b;
        int retangulo = a*b;
        int retanguloPerimetro = a + b + a + b;
        
        System.out.println("A área do triângulo retângulo de acordo com as informações passadas é: " + area);
        System.out.println("A área do círculo de acordo com as informações passadas é: " + circulo);
        System.out.println("A área do trapézio de acordo com as informações passadas é: " + trapezio);
        System.out.println("A área do quadrado de acordo com as informações passadas é: " + quadrado);
        System.out.println("A área do retângulo de acordo com as informações passadas é: " + retangulo);
        System.out.println("O perímetro do retângulo de acordo com as informações passadas é: " + retanguloPerimetro);
        
        
    } 
}
