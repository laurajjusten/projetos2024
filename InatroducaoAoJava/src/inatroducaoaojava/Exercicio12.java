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
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
        System.out.println("Informe a quantia de cédulas de 2");
        int cedulas2 = entrada.nextInt();
        
        System.out.println("Informe a quantia de cédulas de 5");
        int cedulas5 = entrada.nextInt();
        
        System.out.println("Informe a quantia de cédulas de 10");
        int cedulas10 = entrada.nextInt();
        
        System.out.println("Informe a quantia de cédulas de 20");
        int cedulas20 = entrada.nextInt();
        
        System.out.println("Informe a quantia de cédulas de 50");
        int cedulas50 = entrada.nextInt();
        
        System.out.println("informe a quantia de cédulas de 100");
        int cedulas100 = entrada.nextInt();
        
        System.out.println("Informe a quantia de cédulas de 200");
        int cedulas200 = entrada.nextInt();
        
        int resultado = (2*2 + 5*5 + 10*10 + 20*20 + 50*50 + 100*100 + 200*200);
        System.out.println("Resultado = " + resultado);
        
    }
}
