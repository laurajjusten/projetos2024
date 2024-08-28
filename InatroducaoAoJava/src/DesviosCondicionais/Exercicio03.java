/*
 * 3) Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se somar os dois, caso
contrário multiplique A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado para uma
variável C e mostrar seu conteúdo na tela.
 */
package DesviosCondicionais;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe valor inteiro para A:");
        int a = entrada.nextInt();
        System.out.println("Informe valor inteiro para B");
        int b = entrada.nextInt();
        int c;
        
        if(a==b){
            c=a+b;
        }else{
            c=a*b;
        }
        System.out.println("O valor de c é "+ c);
    }
}
