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
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
        System.out.println("Informe a temperatura de Fahrenheit");
        int fahrenheit = entrada.nextInt();
        
        int celsius = (fahrenheit - 32)*(5 / 9);
        System.out.println("Resultado = " + celsius);
        
    }
}
