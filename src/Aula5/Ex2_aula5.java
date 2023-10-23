/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula5;

/**
 *
 * @author rodri
 */
public class Ex2_aula5 {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        
        do{
            System.out.printf("%d é menor do que %d \n", i, j);
            j--;
        } while(i <= j);
    }
}
