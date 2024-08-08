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
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
        System.out.println("Cálculo da medida h");
        System.out.println("Informe o comprimento da parede 1:");
        double parade1 = entrada.nextDouble();
        System.out.println("Informe o comprimento da parede 2:");
        double parede2 = entrada.nextDouble();
        
        double resultado = Math.sqrt(Math.pow(10, 2) + Math.pow(20, 2));
        System.out.println("Resultado = " + resultado);
        
        
    }
}
