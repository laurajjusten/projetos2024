
package DesviosCondicionais;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        String nome = entrada.next();
        System.out.println("Informe a idade:");
        int idade = entrada.nextInt();
        if(idade<15){
            System.out.println(nome +"você é uma criança");
        }
        if((idade>=15) && (idade<60)){
            System.out.println(nome +"você é um adulto");
        }
        if(idade>60){
            System.out.println(nome +"você é um idoso");
    }
    }
}
