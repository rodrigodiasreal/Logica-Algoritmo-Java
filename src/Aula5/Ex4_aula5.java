
package Aula5;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Ex4_aula5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, soma = 0, x;
        while(i<10){
            System.out.println("Número: ");
            x = input.nextInt();
            if(x<0){
                break;
            }
            soma +=x; //Acumulando o valor de "x" em soma.
            i+=1;
        }
        System.out.println("Soma " + soma);
    }
    
}
