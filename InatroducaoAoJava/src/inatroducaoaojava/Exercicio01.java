/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inatroducaoaojava;

import java.util.Scanner;


public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe um valor inteiro:");
        int valor = entrada.nextInt();
        System.out.println("O antecessor de "+ valor +" é : "+(valor-1));
        
    }
        
        
    }
