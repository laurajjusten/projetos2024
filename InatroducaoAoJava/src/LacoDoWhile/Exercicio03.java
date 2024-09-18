/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LacoDoWhile;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int valorSorteado = aleatorio.nextInt(10)+1;
        int valorChutado = 0;
        int cont = 0;
        System.out.println("Jogo da senha:");
        System.out.println("Foi sorteado um valor de 1 a 10: adivinhe:");
        
        do {
            System.out.println("Chute um valor de 1 a 10:");
            valorChutado = entrada.nextInt();
            cont++;
            if(valorSorteado > valorChutado) {
                System.out.println("Errado. Chute um valor maior:");
            } else if(valorSorteado < valorChutado) {
                System.out.println("Errado. Chute um valor menor:");
        }
                
        } while (valorSorteado != valorChutado);
        if(cont < 3) {
            System.out.println("Parabéns!");
        } else if(cont > 5) {
            System.out.println("Você foi mal!");
        } else {
            System.out.println("Você pode melhor!");
        }
         System.out.println("Você acertou em " + cont + " vezes!");
    }
}
