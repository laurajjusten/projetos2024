/*
 * 4) Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo, imprimindo o
resultado.
 */
package DesviosCondicionais;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número qualquer:");
        int numero = entrada.nextInt();
        
        if(numero>0) {
            System.out.println("É positivo");
        } else {
            System.out.println("É negativo");
        }
        }
     
    }

