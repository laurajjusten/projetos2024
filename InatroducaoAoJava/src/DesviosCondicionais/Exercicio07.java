/*
 *7) Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso
ideal, utilizando as seguintes fórmulas:
a) para homens: (72.7 * h) – 58;
b) para mulheres: (62.1 * h) – 44.7.
 */
package DesviosCondicionais;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe sua altura:");
        double altura = entrada.nextDouble();
        System.out.println("Informe seu sexo:");
        String sexo = entrada.next();
        double pesoIdeal;
        
        if(sexo.equalsIgnoreCase("M")) {
            pesoIdeal = 72.7 * altura - 58;
            System.out.println("Peso ideal" + pesoIdeal);
        } else if(sexo.equalsIgnoreCase("F")) {
            pesoIdeal = 62.1 * altura - 44.7;
            System.out.println("Peso ideal" + pesoIdeal);
        }
        }
    }

