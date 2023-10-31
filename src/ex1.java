import java.util.Scanner;
/**
 *
 * @author Rodrigo
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tamanho = 10;
        int[] vetor = new int[tamanho];
     
        for(int i=0; i<10; i++){
            System.out.printf("vetor [%d]: \n", i);
            vetor[i] = input.nextInt();
        }
        int soma =0;
        int menor= vetor[0];
        int maior=vetor[0];
        
        for(int i=0; i<10; i++){
            //acumula valor em soma.
            soma += vetor[i];
            //verifica o menor elemento.
            if(vetor[i] < menor){
                menor = vetor[i];
                
            }
            //verifica o maior elemento
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }
     
        System.out.println("Vetor:" + vetor);
        
            for(int i=0; i<10; i++){
                System.out.printf("vetor[%d]: %d", i,vetor[i]);
                if(vetor[i] == menor){
                    System.out.println("<--menor");
                    
                }else if(vetor[i] == maior){
                    System.out.println("<--maior");
            }
                System.out.println("");
            }
            System.out.println("Soma" + soma);
        }
    }
