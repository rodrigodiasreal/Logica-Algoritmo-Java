package aula_3;

import java.util.Scanner;

/**
 Escreva um programa em Java que receba dois números e execute as operações
 * listadas a seguir de acordo com a escolha do usuário:
 * 1 - Média entre os números digitados
 * 2 - Diferença entre os números
 * 3 - Produtos entre os números digitados
 * 4 - Divisão do primeiro pelo segundo
 * Se a opção digitada for inválida, mostrar a mensagem erro e terminar a execulção do programa
 */
public class Switch_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número");
        int n1 = entrada.nextInt();
        
        System.out.println("Digite outro número");
        int n2 = entrada.nextInt();
        
        System.out.println("Escolha a operação");
        int o = entrada.nextInt();
        
        switch(o){
        case 1:
            System.out.println("A média entre " + n1 + " e " + n2 + " é " + (n1+n2)/2);
            break;
        case 2:
            System.out.println("A diferença entre " + n1 + " e " + n2 + " é " + (n1-n2));
            break;
        case 3:
            System.out.println("A multiplicação entre " + n1 + " e " + n2 + " é " + (n1*n2));
            break;
        case 4:
            System.out.println("A divisão entre " + n1 + " e " + n2 + " é " + (n1/n2));
            break;
        }
        
    }
    
}
