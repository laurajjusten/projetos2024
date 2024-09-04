/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LacoFor;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double total = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("informe um valor:"+i);
            double valor = entrada.nextDouble();
            total = total + valor;
        }
        System.out.println("Total - "+total);
        System.out.println("Total - "+total/5);
    }
}
