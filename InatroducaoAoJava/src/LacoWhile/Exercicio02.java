/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LacoWhile;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Exercicio02 {
    public static void main(String[] args) {
        double pais1 = 80000;
        double pais2 = 200000;
        int contador = 0;
        
        while (pais1 < pais2) {
            pais1 = pais1 * 1.03;
            pais2 = pais2 * 1.015;
            contador++;
        }   
        System.out.println("População do país A:"+ pais1);
        System.out.println("População do país B:"+ pais2);
        System.out.println(contador);
    }
}
