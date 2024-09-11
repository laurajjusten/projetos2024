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
public class Exemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um nome:");
        String nome = entrada.next();
        
        //Validando a idade
        while (nome.length() <= 3) {
            System.out.println(" informe um nome com mais de 3 caracteres:");
            nome = entrada.next();
        }
        
        //Validando a idade
        System.out.println("Informe uma idade:");
        int idade = entrada.nextInt();
        
        while (idade < 0 || idade > 150) {
            System.out.println("Informe uma idade entre 0 e 150:");
            idade = entrada.nextInt();
        }
        
        //Validando o salário
        System.out.println("Informe um salário:");
        double salario = entrada.nextDouble();
        
        while (salario < 0) {
            System.out.println("Informe um salario maior que 0:");
            salario = entrada.nextDouble();
        }
        
        //Validando o sexo
        System.out.println("Informe o sexo:");
        String sexo = entrada.next();
        
        while (!sexo.equals("F") && !sexo.equals("M")) {
            System.out.println("Informe o sexo (F ou M):");
            sexo = entrada.next();
        }
        
        //Validando o Estado Civil
        System.out.println("Informe o estado civil:");
        String ec = entrada.next();
        
        while (!"scvd".contains(ec) && ec.length()>1) {
            System.out.println("Informe seu Estado Civil (s, c, v, d):");
            ec = entrada.next();
        }
    }
}
