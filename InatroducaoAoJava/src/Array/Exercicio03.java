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
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String [] nomes = new String[5];
        String maiorNome = "";
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um nome: " +(i+1));
            nomes[i] = entrada.next();
        }
        
         for (int i = 0; i < 5; i++) {
             if (nomes[i].length() > maiorNome.length()) {
                 maiorNome = nomes[i];
             }
         }
         System.out.println(maiorNome);
    }
}
