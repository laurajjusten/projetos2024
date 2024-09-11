/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LacoWhile;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Exemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor entre 0 e 10:");
        double nota = entrada.nextDouble();
        
        while (nota < 0 || nota > 10) {
            System.out.println("Nota informada é inválida!");
            System.out.println("Informe um valor entre 0 e 10:");
            nota = entrada.nextDouble();
        }  
        System.out.println("Nota informada:"+ nota);
    }
}
    
