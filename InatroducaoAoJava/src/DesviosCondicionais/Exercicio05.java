/*
 *5) Faça um algoritmo que leia uma variável e some 5, caso seja par ou some 8, caso seja ímpar, imprimir o
resultado desta operação.
 */
package DesviosCondicionais;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor qualquer:");
        int valor = entrada.nextInt();
        
        if(valor%2==0) {
            System.out.println(valor+5);
        }else{
            System.out.println(valor+8);
        }
    }
}
