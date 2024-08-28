/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesviosCondicionais;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Exemplo03 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        System.out.println("Informe \nF para feminino \nM para masculino");
        String sexo = entrada.next();
        if (sexo.equals("F")) {
            System.out.println("Feminino!");
        } else if (sexo.equals("M")) {
            System.out.println("Masculino!");
        } else {
            System.out.println("Sexo Inválido!");
        }
    }
}
