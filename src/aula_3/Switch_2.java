package aula_3;

import java.util.Scanner;

/**
 Escreva um programa em Java que leia um determinado produto e mostre a sua classificação.
 * Utilize a seguinte tabela como referência:
 * 1 - Alimento não-perecível
 * 2,3,4 - Alimento perecível
 * 5 ou 6 - Vestuário
 * 7 - Higiene Pessoal
 * 8 até 15 - Limpeza e utensílios domésticos
 * Qualquer outro código - Código inválido
 */
public class Switch_2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o código");
        int item = entrada.nextInt();
        
        char produto;
        
        if(item == 1){
            produto = 'A';
        } else if (item >=2 && item <=4){
            produto = 'B';
        }else if(item >=5 && item <=6) {
            produto = 'C';
        } else if(item == 7) {
            produto = 'D';
        } else if(item >=8 && item <=15){
            produto = 'E';
        } else {
            produto = 'F';
        }
        
        switch(produto) {
            case 'A':
                System.out.println("Alimento não-perecível");
                break;
                case 'B':
                System.out.println("Alimento perecível");
                break;
                case 'C':
                System.out.println("Vestuário");
                break;
                case 'D':
                System.out.println("Higiene Pessoal");
                break;
                case 'E':
                System.out.println("Limpeza e utensílios domésticos");
                break;
                case 'F':
                System.out.println("Código inválido");
                break;
        }
        
    }
    
}