/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inatroducaoaojava;

import java.util.Scanner;

/**
 *
 * @author Escola João XXIII
 */
public class InatroducaoAoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Olá mundo!!!");
      
      Scanner entrada = new Scanner(System.in);
      System.out.println("Vamos somar dois números.");
      System.out.println("Informe um valor para o número 1:");
      int numero1 = entrada.nextInt();
            System.out.println("Informe um valor para o número 2:");
      int numero2 = entrada.nextInt();
      int resultado = numero1 + numero2;
      System.out.println("A soma deu "+resultado);
      
      
    }
    
}
