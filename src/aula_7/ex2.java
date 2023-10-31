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
    
    public static void imprimePares (int[] v){
        
        for(int i=0; i<v.length;i++){
            if(v[i]%2 ==00){
                System.out.printf("vetor [%d]: %d\n", i, v[i]);
            }
        }
        
    }
        
        public static void main(String[] args){
            int t = tamanho();
            int[] v = criarVetor(t);
            imprimir(v);
            imprimePares(v);
        }
    }

/**
 * * TO DO
 * 1) Função para imprimir os números pares.
 * 2) Função para imprimir os números ímpares.
 * 3) Função separar em um vetor os números pares.
 * 4) Função separar em um vetor os números ímpares.
 * 5) Função para verificar ocorrência de um determinado número.
 * 6) Função para obter um número.
 * 7) Função para verificar o número de ocorrências no vetor.
 */
