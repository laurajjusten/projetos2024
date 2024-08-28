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
public class Exemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor 1:");
        int n1 = entrada.nextInt();
        System.out.println("Informe o valor 2:");
        int n2 = entrada.nextInt();
        if(n1>n2){
            System.out.println("o valor maior é n1 - "+ n1);
        }else{
            System.out.println("o valor maior é n2 - "+ n2);
        }
    }
}
