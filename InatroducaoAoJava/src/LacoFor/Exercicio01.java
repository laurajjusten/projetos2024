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
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número qualquer:");
        int numero = entrada.nextInt();
        
        for (int i = 1; i <= 100000; i++) {
            System.out.println(i+ " x "+ numero + " = "+ i*numero);
        }
    }
}
