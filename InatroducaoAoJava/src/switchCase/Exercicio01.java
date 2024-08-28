/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchCase;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o ano:");
        int ano = entrada.nextInt();
        System.out.println("informe um número de 1 a 12:");
        int numero = entrada.nextInt();
        
        switch (ano) {
            case 1:
                System.out.println("31 dias");
                break;
            case 2:
                if (ano%4==0) {
                    System.out.println("29 dias");
                } else {
                    System.out.println("28 dias");
                }
                break;
            case 3:
                System.out.println("31 dias");
                break;
            case 4:
                System.out.println("30 dias");
                break;
            case 5:
                System.out.println("31 dias");
                break;
            case 6:
                System.out.println("30 dias");
                break;
            case 7:
                System.out.println("31 dias");
                break;
            case 8:
                System.out.println("31 dias");
                break;
            case 9:
                System.out.println("30 dias");
                break;
            case 10:
                System.out.println("31 dias");
                break;
            case 11:
                System.out.println("30 dias");
                break;
            case 12:
                System.out.println("31 dias");
                break;
            default:
                System.out.println("Mês ou ano inválido");
                break;
        }
    }
}
