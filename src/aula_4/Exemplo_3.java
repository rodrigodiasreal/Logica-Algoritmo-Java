/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_4;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class Exemplo_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        float n1, n2, media;
        System.out.println("Aluno: ");
        nome = input.next();
        System.out.println("N1: ");
        n1 = input.nextFloat();
        System.out.println("N2: ");
        n2 = input.nextFloat();
        media = (n1+n2)/2;
        System.out.printf("%s,\n a média das notas %.1f e %.1f é: \t \n %.2f \n", nome, n1, n2, media);
    }
}
