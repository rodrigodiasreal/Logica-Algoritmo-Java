/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_2;

import java.util.Scanner;

/**
Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao expoente). 
* Dica: use a função matemática Math.pow(). 
* Exemplo: 5 elevado ao cubo ficaria Math.pow(5, 3). 
* Você pode trocar esses números por variáveis. 
 */
public class Lista1_ex2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira aqui o número da base.");
        int base = entrada.nextInt();
        
        System.out.println("Insira aqui o número do expoente.");
        int expoente = entrada.nextInt();
        
        int potencia = (int) Math.pow(base, expoente);
        
        System.out.println(base + " com o expoente " + expoente + " é " + potencia);
    }
   }
