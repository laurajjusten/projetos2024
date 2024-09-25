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
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetorA [] = new int [5];
        int vetorB[] = new int [5];
        int vetorC[] = new int [5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o valor " +(i+1)+ " para o vetor A:");
           vetorA[i] = entrada.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o valor " +(i+1)+ " para o vetor B:");
           vetorB[i] = entrada.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o valor " +(i+1)+ " para o vetor C:");
           vetorC[i] = vetorA[i] * vetorB[i];
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println(vetorA[i] + " * " + vetorB[i] + " = " + vetorC[i]);
        }
        } 
    }
