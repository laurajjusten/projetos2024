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
public class ExercicioExtra02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor para a:");
        double a = entrada.nextDouble();
        System.out.println("Informe um valor para b:");
        double b = entrada.nextDouble();
        System.out.println("Informe um valor para c:");
        double c = entrada.nextDouble();
        
        double delta = Math.pow(b, 2) - (4*a*c);
        
        if(a==0 && b==0) {
            System.out.println("Equação degenerada");
        }else if(a==0 && b!=0){
            System.out.println("x = "+ (-c/b));
        }else if(a!=0 && c==0) {
            System.out.println("x1 = 0");
            System.out.println("x2 = "+ (-b/a));
        }else if (a!=0 && c!=0 && delta>=0) {
            System.out.println("x1 = "+ ((-b + Math.sqrt(delta))) / (2 * a));
            System.out.println("x2 = "+ ((-b - Math.sqrt(delta))) / (2 * a));
        }else if(a!=0 && c!=0 && delta<0) {
            System.out.println("As raízes são complexas");
        }
    }
}
