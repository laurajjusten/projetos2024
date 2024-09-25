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
public class Exercicio06 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         String [] nomes = new String[6];
         String nomeProcurado = "";
         
         for (int i = 0; i < 6; i++) {
             System.out.println("Informe um nome: " +(i+1));
             nomes[i] = entrada.next();
        }
         
         System.out.println("Informe um nome a ser procurado na lista: ");
         nomeProcurado = entrada.next();
         
         for (int i = 0; i < 6; i++) {
             if (nomes[i].equals(nomeProcurado)) {
                 System.out.println("Nome encontrado!");
             }
        }
    }
}
