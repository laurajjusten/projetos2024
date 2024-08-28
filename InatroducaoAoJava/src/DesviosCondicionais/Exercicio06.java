/*
 * 6) Escreva um algoritmo que leia três valores inteiros e diferentes e mostre-os em ordem decrescente.
 */
package DesviosCondicionais;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor para a:");
        int a = entrada.nextInt();
        
        System.out.println("Informe uma valor para b:");
        int b = entrada.nextInt();
        
        System.out.println("Informe um valor para c:");
        int c = entrada.nextInt();
        
        if((a>b) && (b>c)) {
            System.out.println(a+"; "+b+"; "+c);
        } else if((a>c) && (c>b)) {
            System.out.println(a+"; "+c+"; "+b);
        } else if((b>a) && (a>c)) {
            System.out.println(b+"; "+a+"; "+c);
        } else if((b>c) && (c>a)) {
            System.out.println(b+"; "+c+"; "+a);
        } else if((c>a) && (a>b)) {
            System.out.println(c+"; "+a+"; "+b);
        } else if((c>b) && (b>a)) {
            System.out.println(c+"; "+b+"; "+a);
        }
    }
}
