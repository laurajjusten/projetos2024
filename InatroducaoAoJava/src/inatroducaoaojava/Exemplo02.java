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
public class Exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos calcular o peso ideal");
        System.out.println("Informe sua altura:");
        double altura = entrada.nextDouble();
        double pesoIdeal = (62.1 * 1.65) - 44;
        System.out.println("Seu peso ideal é "+pesoIdeal);
    }
}
