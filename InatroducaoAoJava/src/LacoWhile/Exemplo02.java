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
public class Exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o usuário:");
        String usuario = entrada.next();
        System.out.println("Informe a senha:");
        String senha = entrada.next();
        int contador = entrada.nextInt();
        
        while (usuario.equals(senha) && contador < 3) {
        System.out.println("Usuária não pode ser igual a senha!");
        System.out.println("Informe o usuário:");
        usuario = entrada.next();
        System.out.println("Informe a senha:");
        senha = entrada.next();
        contador++;
        }
        if(contador==3 && usuario.equals(senha)) {
            System.out.println("Acesso negado!");
        }else{
            System.out.println("Acesso permitido!");
        }
    }
}
