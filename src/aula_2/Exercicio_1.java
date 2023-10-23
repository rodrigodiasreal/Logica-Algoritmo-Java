/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_2;

import java.util.Scanner;

/**
 *Escreva um programa que leia 3 notas, e os seus respectivos
 * pesos, bem como o número de faltas.
 * O programa deve calcular a média (ponderada) e verificar se a
 * média é maior do que 6.0 e o número de faltas menor ou igual 
 * a 18. O programa deve imprimir se o aluno está aprovado ou
 * reprovado (e por qual motivo).
 */
public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
                float p1 = 0.4f, p2 = 0.5f, p3 = 0.1f;
        
        System.out.println("Prova 1: ");
        float prova1 = entrada.nextFloat();
        
        System.out.println("Prova 2: ");
        float prova2 = entrada.nextFloat();
        
        System.out.println("ADO: ");
        float ado = entrada.nextFloat();
        
        System.out.println("Digite a quantidade de faltas");
        int falta = entrada.nextInt();
        
        float media = (prova1 * p1) + (prova2 * p2) + (ado * p3);
        
        if(media >= 6 && falta < 18){
            System.out.println("Parabéns, você está aprovado. Sua média foi " + media + ". E você faltou " + falta + " vezes.");
        }else if(media < 6 && falta > 18){
            System.out.println("Reprovado por média e falta. Sua média foi " + media + " e sua quantidade de faltas foi " + falta + ".");
        }else if(media < 6 && falta < 18){
            System.out.println("Você foi reprovado por média, sua média final foi " + media + ".");
        }else{
            System.out.println("Você foi reprovado por falta, você faltou mais de 18 vezes, você faltou " + falta + ".");
        }
        
        
    }
    
}
