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
public class Exemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String [] estados = new String [2];
        String [] capitais = new String [2];
        int [] populacoes = new int [2];
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Informe o estado "+(i+1)+":");
            estados[i] = entrada.next();
            System.out.println("Informe a capital "+(i+1)+":");
            capitais[i] = entrada.next();
            System.out.println("Informe a população do estado "+(i+1)+":");
            populacoes[i] = entrada.nextInt();
        }
        
        for (int i = 0; i < 2; i++) {
            System.out.println(
                    estados[i]+" - "+
                    capitais[i]+ " - "+
                    populacoes[i]
            );
        }
     }
}
