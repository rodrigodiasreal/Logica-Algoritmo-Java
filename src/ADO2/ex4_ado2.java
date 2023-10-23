/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO2;

import java.util.Scanner;

/**
 Use o laço while para ler 06 valores do usuário. Ao final do laço, imprimir: 
 * 1. Soma de todos os valores digitados que foram positivos; 
 * 2. Quantidade de valores digitados que foram positivos. 
 * 3. Média (decimal) de todos os valores digitados que foram positivos.
 */
public class ex4_ado2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int contador = 0;
        double somaPositivos = 0;
        int qtdPositivos = 0;
        
        while (contador < 6) {
            System.out.println("Informe um valor:");
            double valor = input.nextDouble();
            
            if (valor > 0) {
                somaPositivos += valor;
                qtdPositivos++;
            }
            
            contador++;
        }
        
        if (qtdPositivos > 0) {
            double mediaPositivos = somaPositivos / qtdPositivos;
            
            System.out.println("1. Soma dos valores positivos: " + somaPositivos);
            System.out.println("2. Quantidade de valores positivos: " + qtdPositivos);
            System.out.println("3. Média dos valores positivos: " + mediaPositivos);
        }
        
    }
}