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
public class Exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor qualquer:");
        int valor = entrada.nextInt();
        if(valor<0){
            System.out.println("Valor negativo!");
        }else{
            System.out.println("Valor positivo!");
        }
    }
}
