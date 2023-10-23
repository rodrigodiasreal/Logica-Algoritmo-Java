/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO2;

import java.util.Scanner;

/**
 Leia um valor inteiro N do usuário, onde N é maior ou igual a 2 e menor ou igual a 1000. 
 * A seguir, usando o laço DO-WHILE, mostre a tabuada de N no seguinte formato: 
 * 1 x N = N      2 x N = 2N        ...       10 x N = 10N
 */
public class ex5_ado2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n;
        
        do {
            System.out.println("Informe um valor inteiro entre 2 e 1000: ");
            n = input.nextInt();
        } while (n < 2 || n > 1000);
        
        System.out.println("Tabuada de " + n + ":");
        
        int i = 1;
        do {
            int resultado = i * n;
            System.out.println(i + " x " + n + " = " + resultado);
            i++;
        } while (i <= 10);
    }
}
    

