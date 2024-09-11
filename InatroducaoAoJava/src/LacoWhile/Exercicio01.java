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
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a massa inicial em gramas:");
        double massa = entrada.nextDouble();
        int tempo = 0;
        double massaInicial = massa;
        
        while (massa > 0.5) {
            massa = massa / 2;
            tempo += 50;
        }
        System.out.println("Massa Inicial: " + massaInicial);
        System.out.println("Massa Final: " + massa);
        System.out.println("Horas: " + tempo / 3600);
        System.out.println("Minutos: " + tempo % 3600 / 60);
        System.out.println("Segundos: " + tempo % 60);
    }
}
