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
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o número de eleitores");
        int eleitores = entrada.nextInt();
        System.out.println("Informe o número de votos brancos");
        int brancos = entrada.nextInt();
        System.out.println("Informe o número de votos nulos");
        int nulos = entrada.nextInt();
        System.out.println("Informe o número de votos válidos");
        int validos = entrada.nextInt();int total;
        
        System.out.println("Brancos - " + (brancos * 100 / eleitores) +" %");
        System.out.println("Nulos - " + (nulos * 100 / eleitores) +" %");
        System.out.println("Validos - " + (validos * 100 / eleitores) +" %");
        
    }
    
}
