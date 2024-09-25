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
public class Exercicio04 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         double [] numeros = new double [8];
         double media = 0;
         double soma = 0;
         
         for (int i = 0; i < 8; i++) {
             System.out.println("Informe um número real: " +(i+1));
             numeros[i] = entrada.nextDouble();
             soma += numeros[i];
         }
         
         media = soma / 8;
         System.out.println(media);
         
         for (int i = 0; i < 8; i++) {
             if (numeros[i] > media)
                 System.out.println(numeros[i]);
         }
    }
}
