/*
 * 2) Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar.
 */
package DesviosCondicionais;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número qualquer:");
        int numero = entrada.nextInt();
        
        if(numero%2==0){
            System.out.println("É par");
        }else{
            System.out.println("É impar");
        }
    }
}
