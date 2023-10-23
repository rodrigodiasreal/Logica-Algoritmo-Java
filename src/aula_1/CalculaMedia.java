package aula_1;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class CalculaMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float p1 = 0.4f, p2 = 0.5f, p3 = 0.1f;
        
        System.out.println("Prova 1: ");
        float prova1 = entrada.nextFloat();
        
        System.out.println("Prova 2: ");
        float prova2 = entrada.nextFloat();
        
        System.out.println("ADO: ");
        float ado = entrada.nextFloat();
        
        float media = (prova1 * p1) + (prova2 * p2) + (ado * p3);
        
        System.out.println("Média: " + media);
    }
    
}
