
package Aula5;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Ex1_aula5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Início: ");
        int i = input.nextInt();
        
        System.out.println("Fim: ");
        int f = input.nextInt();
        
        while (i < f){
            if(i%2 == 0)
            System.out.println("i: " + i);
            i++;
        }
        
        //========================================
        //Se o início for maior do que fim,
        //o programa deve imprimir apenas os
        //números ímpares
        
        while (i > f){
            if (i%2 == 1)
                System.out.println("Ímpares: " + i);
            i--;
        }
    }
}
