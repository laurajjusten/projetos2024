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
public class Exercicio08 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
 
        System.out.println("Informe o expoente:");
        double expoente = entrada.nextDouble();
        System.out.println("Informe a base:");
        double base = entrada.nextDouble();
        
        double resultado = Math.pow(5, 4);
        System.out.println("Resultado = " + resultado);
       
        
    }
}
