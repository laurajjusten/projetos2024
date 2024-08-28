/*
 *10) Escreva um algoritmo que leia o número de identificação, as 3 notas obtidas por um aluno nas 3 verificações 
e a média dos exercícios que fazem parte da avaliação, e calcule a média de aproveitamento, usando a fórmula:

MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7

A atribuição dos conceitos obedece a tabela abaixo. O algoritmo deve escrever o número do aluno, suas notas, a 
média dos exercícios, a média de aproveitamento, o conceito correspondente e a mensagem 'Aprovado' se o 
conceito for A, B ou C, e 'Reprovado' se o conceito for D ou E.
Média de aproveitamento Conceito
A. >= 90
B. >= 75 e < 90
C. >= 60 e < 75
D. >= 40 e < 60
E. < 40
 */
package DesviosCondicionais;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         System.out.println("Informe o número do aluno:");
         int numero = entrada.nextInt();
        System.out.println("Informe a nota 1:");
        double nota1 = entrada.nextDouble();
        System.out.println("Informe a nota 2:");
        double nota2 = entrada.nextDouble();
        System.out.println("Informe a nota 3:");
        double nota3 = entrada.nextDouble();
        System.out.println("Informe a média exercícios:");
        double media = entrada.nextDouble();
        double ma = (nota1 + nota2 * 2 + nota3 * 3 + media)/7;
        
        if(ma>=90) {
            System.out.println("Aluno " + numero + " foi Aprovado com conceito A");
        } else if(ma>=75) {
            System.out.println("Aluno " + numero + " foi Aprovado com conceito B");
        } else if(ma>=60) {
            System.out.println("Aluno " + numero + " foi Aprovado com conceito C");
        } else if(ma>=40) {
            System.out.println("Aluno " + numero + " foi Reprovado com conceito D");
        } else if(ma<40) {
            System.out.println("Aluno " + numero + " foi Reprovado com conceito E");
        }
    } 
}
