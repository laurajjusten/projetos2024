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
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o valor do sálario");
        double salario = entrada.nextDouble();
        System.out.println("Informe o aumento");
        double aumento = entrada.nextDouble();
        
        System.out.println(aumento / 100 * salario + salario);
        
    }
}
