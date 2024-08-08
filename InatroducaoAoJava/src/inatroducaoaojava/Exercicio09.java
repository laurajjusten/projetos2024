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
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
        System.out.println("Informe um valor qualquer:");
        double valor = entrada.nextDouble();
        
        double resultado = Math.sqrt(valor);
        System.out.println("Resultado = " + resultado);
    }
}
