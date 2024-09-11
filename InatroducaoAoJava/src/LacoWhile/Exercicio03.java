/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LacoWhile;

/**
 *
 * @author Laura
 */
public class Exercicio03 {
    public static void main(String[] args) {
        double a = 0;
        double b = 1;
        double c = 0;
        System.out.print((int)a + " ");
        System.out.print((int)b + " ");
        
        while (c < 500) {
            c = a + b;
            a = b;
            b = c;
            System.out.print((int)c + " ");
        }
    }
}
