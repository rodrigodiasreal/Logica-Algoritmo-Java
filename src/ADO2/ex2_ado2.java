package ADO2;

import java.util.Scanner;

/**
 Leia um valor inteiro X. 
 * Em seguida mostre os ímpares de 1 até X, um valor por linha, 
 * inclusive o X, se for o caso. 
 * Use o laço for.
 */
public class ex2_ado2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe número: ");
        int x = input.nextInt();
        
        System.out.println("Números ímpares de 1 até " + x + " : ");
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
  
    }
}
