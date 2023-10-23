/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO2;

import java.util.Scanner;

/**
Faça um programa que mostre os números pares entre 1 e 100, inclusive. 
* Use o laço while
 */
public class ex1_ado2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = 1;
        
        while(n <= 100){
            if (n%2==0)
                System.out.println(n);
                n++;
            }
        }
    }
