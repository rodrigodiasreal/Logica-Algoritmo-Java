package aula_3;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Switch_1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite sua primeira nota: ");
        int nota1 = entrada.nextInt();
        
        System.out.println("Digite sua segunda nota: ");
        int nota2 = entrada.nextInt();
        
        int media = (nota1 + nota2)/2;
        char grade;
        
        if (media >=9 && media <=10){
            grade = 'A';
        }else if(media >= 7 && media <= 8){
            grade = 'B';
            }else if (media >= 6 && media <=7){
            grade = 'C';
            
            }else if (media >=5 && media <=6){
            grade = 'D';

            }else{
                grade = 'E';
                    }
        
        switch (grade) {
            case 'A':
                System.out.println("Excelente!");
                break;
            case 'B':
            case 'C':
                System.out.println("Bem feito!");
                break;
            case 'D':
                System.out.println("Você passou!");
                break;
            case 'E': 
                System.out.println("Melhor tentar novamente!");
                break;
            default:
                System.out.println("Conceito inválido");  
        }
    }
  }