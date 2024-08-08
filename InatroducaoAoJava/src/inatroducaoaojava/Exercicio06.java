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
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Informe o valor de fábrica:");
        double valorFabrica = entrada.nextDouble();
        
        double valorDistribuidor = valorFabrica * 0.28;
        double valorImposto = valorFabrica * 0.45;
        double total = valorFabrica + valorDistribuidor + valorImposto;
        System.out.println("O valor final do carro é: "+total);
        
    }
    
}
