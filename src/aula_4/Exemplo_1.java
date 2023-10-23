package aula_4;

import java.util.Scanner;

/**
 *
 */
public class Exemplo_1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Início");
        int inicio = input.nextInt();
        
        System.out.println("Fim");
        int fim = input.nextInt();
        
        
        for(int i = inicio; i< fim; i++){
            if (i%2 == 0){
            System.out.println("i: " + i);
        }
    }
  }
}
