/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula5;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Dias
 */
public class Ex3_aula5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int op;
        double result = 0;
        
        do {
        
        System.out.println("*-* Calculadora Simples *-*");
        System.out.println("===========================");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("Operação");
        op = input.nextInt();
        
        }while(op < 1 || op >4 );
        
        System.out.println("Número 1");
        double n1 = input.nextDouble();
        
        System.out.println("Número 2");
        double n2 = input.nextDouble();
       
   
        
        switch(op){
            case 1:
                result = n1+n2;
                break;
                
            case 2:
                result = n1-n2;
                break;
            
            case 3: 
                result = n1*n2;
                break;
                
            case 4:
                result = n1/n2;
        }
        
        System.out.println("Resultado: " + result);
    }
    
}
        