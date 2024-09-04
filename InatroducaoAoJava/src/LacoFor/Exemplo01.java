/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LacoFor;

/**
 *
 * @author Laura
 */
public class Exemplo01 {
    public static void main(String[] args) {
        
        System.out.println("");
        System.out.println("******Exemplo A******");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i+ " ");
        }
        
        System.out.println("");
        System.out.println("******Exemplo B******");
        for (int i = 100; i >= 1; i--) {
            System.out.print(i+ " ");
        }
        
        System.out.println("");
        System.out.println("******Exemplo C******");
        for (int i = 7; i <= 77; i += 7) {
            System.out.print(i+ " ");
        }
        
        System.out.println("");
        System.out.println("******Exemplo D******");
        for (int i = 20; i >= 2; i -= 2) {
            System.out.print(i+ " ");
        }
        
        System.out.println("");
        System.out.println("******Exemplo E******");
        for (int i = 2; i <= 20; i += 3) {
            System.out.print(i+ " ");
        }
        
        System.out.println("");
        System.out.println("******Exemplo F******");
        for (int i = 99; i >= 0; i -= 11) {
            System.out.print(i+ " ");
        }
    }
}
