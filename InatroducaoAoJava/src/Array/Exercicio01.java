/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] numeros = new int [5];
        int soma = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o valor: "+ (i+1) +":");
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            soma += numeros[1];
        }
        System.out.println("Soma total: "+ soma);
    }
}
