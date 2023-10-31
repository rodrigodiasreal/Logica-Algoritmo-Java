package aula_7;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class ex2 {
    public static int tamanho () {
        System.out.println("Tamanho do vetor *_*");
        Scanner input = new Scanner (System.in);
        System.out.println("Tamanho: ");
        
        int tamanho = input.nextInt();
        return tamanho;   
    }
    
    public static int[] criarVetor(int tamanho){
        System.out.println("*_* Cria o vetor *-*");
        Scanner input = new Scanner(System.in);
        int [] vetor = new int[tamanho];
        for (int i=0; i < tamanho; i++) {
            System.out.printf("vetor[%d]: \n", i);
            vetor [i] = input.nextInt();
        }
        return vetor;
    }
    
    public static void imprimir(int [] vetor) {
        System.out.println("*-* imprimir *_*");
        for(int i=0; i<vetor.length; i++){
            System.out.printf("vetor [%d]: %d \n", i, vetor[i]);
        }
    }
        
        public static void main(String[] args){
            int t = tamanho();
            int[] v = criarVetor(t);
            imprimir(v);
        }
    }
