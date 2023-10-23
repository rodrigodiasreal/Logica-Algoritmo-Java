package Lista2;

import java.util.Scanner;

/**
 Faça um programa para ler e escrever dados de uma turma de 5 alunos. 
 * O programa deve pedir dados como nome, idade e sexo. 
 * O programa deve imprimir os dados do aluno mais velho. 
 * Use o laço DO-WHILE. 
 */
public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i = 0;
        int idadeMaisVelho = 0;
        String nomeMaisVelho = "";
        String sexoMaisVelho = "";
        
        do {
            System.out.println("Informe o nome do aluno: ");
            String nome = input.nextLine();
            
            System.out.println("Informe a idade do aluno: ");
            int idade = input.nextInt();
            input.nextLine(); 
            
            System.out.println("Informe o sexo do aluno: ");
            String sexo = input.nextLine();
            
            if (idade > idadeMaisVelho) {
                idadeMaisVelho = idade;
                nomeMaisVelho = nome;
                sexoMaisVelho = sexo;
            }
            
            i++;
        } while (i < 5);
        
        System.out.println("\nDados do aluno mais velho:");
        System.out.println("Nome: " + nomeMaisVelho);
        System.out.println("Idade: " + idadeMaisVelho);
        System.out.println("Sexo: " + sexoMaisVelho);
    }
}