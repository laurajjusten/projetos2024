/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inatroducaoaojava;

import java.util.Scanner;

/**
 *
 * @author Escola João XXIII
 */
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Cálculo da média final");
        System.out.println("Informe a nota 1:");
        double nota1 = entrada.nextDouble();
        System.out.println("Informe a nota 2:");
        double nota2 = entrada.nextDouble();
        System.out.println("Informe a nota 3");
        double nota3 = entrada.nextDouble();
        
        double media = (nota1*2 + nota2*3 + nota3*5) / 10;
        System.out.println("Média = " + media);
        
    }
}
