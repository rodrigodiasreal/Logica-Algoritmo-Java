package aula_7;

import java.util.Scanner;

/**
 *
 * @author latif
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
    private static void imprimir(int [] vetor) {
        System.out.println("*-* imprimir *_*");
        for(int i=0; i<vetor.length; i++){
            System.out.printf("vetor[%d]: %d \n",i, vetor[i]);
    }
}
    public static void imprimePares(int []v ){
        System.out.println("*-* Elementos pares*-*");
        for(int i=0; i<v.length; i++){
         if(v[i]%2 == 0){   
             System.out.printf("vetor[%d]: %d \n",i, v[i]);
         }
        }
    }
     public static void imprimeImpares(int[]v){
         System.out.println("*-*Imprime Impares *-*");
         for(int i=0;i<v.length;i++){
             if(v[i]%2==1)
                System.out.printf("vetor[%d]: %d \n",i, v[i]);
        }
     }
     public static int[] vetorPares(int [] v){
         System.out.println("*-*Vetor Pares *-*");
         int cont =0;
         for(int i=0; i<v.length;i++){
             if(v[i]%2==0){
                 cont++;
             }
         }
         //instanciado o vetor de pares
         int[] vetorPares = new int[cont];
         int j = 0;
         for (int i=0;i<v.length;i++){
             if(v[i]%2 == 0){
                 vetorPares[j] = v[i];
                 j++;
                 
             }
         }
         return vetorPares;
         
     }
     
             
    
    public static void main(String[] args) {
        int t = tamanho();
        int [] v = criarVetor(t);
        imprimir(v);
        imprimePares(v);
        imprimeImpares(v);
        imprimePares (vetorPares(v));
       
    }
}
