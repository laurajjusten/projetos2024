/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorevisao;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class ExecicioRevisao {
    
    public static void main(String[] args) {
         boolean[] presencas = new boolean[10];
    Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Chamada do aluno "+(i+1));
            presencas[i] = entrada.nextBoolean();
           
        }
         for (int i = 0; i < 10; i++) {
             if(presencas[i]) {
                 System.out.println("Aluno "+(i+1)+" estava presente.");
             }
         }
        
    }

}
