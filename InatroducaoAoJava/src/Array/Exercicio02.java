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
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] numeros = new int [10];
        int negativos = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o valor: "+ (i+1) +":");
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if(numeros[i] < 0)
            negativos++;
        }
        System.out.println("Números negativos: "+ negativos);
    }
}
