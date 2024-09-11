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
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int codPessoaMaisAlta = 0;
       double alturaPessoaMaisAlta = 0;
       double pesoPessoaMaisAlta = 0;
       
       int codPessoaMaisBaixa = 0;
       double alturaPessoaMaisBaixa = 15;
       double pesoPessoaMaisBaixa = 0;
       
       int codPessoaMaisGorda = 0;
       double alturaPessoaMaisGorda = 0;
       double pesoPessoaMaisGorda = 0;
       
       int codPessoaMaisMagra = 0;
       double alturaPessoaMaisMagra = 0;
       double pesoPessoaMaisMagra = 1000;
       
       double pesoTotal = 0;
       double alturaTotal = 0;
       int cont = 0;
       
       int cod = -1;
       while (cod != 0) {
           System.out.println("Informe o código do cliente:");
           int codigo = entrada.nextInt();
           System.out.println("Informe o peso do cliente:");
           double peso = entrada.nextDouble();
           System.out.println("Informe a altura do cliente:");
           double altura = entrada.nextDouble();
           
           //Mais alta
           if(altura > alturaPessoaMaisAlta) {
               codPessoaMaisAlta = codigo;
               alturaPessoaMaisAlta = altura;
               pesoPessoaMaisAlta = peso;
           }
           //Mais baixa
           if(altura < alturaPessoaMaisBaixa) {
               codPessoaMaisBaixa = codigo;
               alturaPessoaMaisBaixa = altura;
               pesoPessoaMaisBaixa = peso;
           }
           
           //Mais gorda
           if(peso > pesoPessoaMaisGorda) {
               codPessoaMaisGorda = codigo;
               pesoPessoaMaisGorda = peso;
               alturaPessoaMaisGorda = altura;
           }
           
           //Mais magra
           if(peso < pesoPessoaMaisMagra) {
               codPessoaMaisMagra = codigo;
               pesoPessoaMaisMagra = peso;
               alturaPessoaMaisMagra = altura;
           }
           
           pesoTotal += peso;
           alturaTotal += altura;
           cont++;
           
           System.out.println("Escolha: "
                   + "\n0 Para sair;"
                   + "\n1 Para uma novo cadastro;");
           cod = entrada.nextInt();
       }
       
        System.out.println("Pessoa mais alta:"
                + "\nCodigo: " + codPessoaMaisAlta+ ""
                + "\nAltura: " + alturaPessoaMaisAlta+ ""
                + "\nPeso: " + pesoPessoaMaisAlta+ "");
        
        System.out.println("Pessoa mais baixa:"
                + "\nCodigo: " + codPessoaMaisBaixa+ ""
                + "\nAltura: " + alturaPessoaMaisBaixa+ ""
                + "\nPeso: " + pesoPessoaMaisBaixa+ "");
        
        System.out.println("Pessoa mais gorda:"
                + "\nCodigo: " + codPessoaMaisGorda+ ""
                + "\nAltura: " + alturaPessoaMaisGorda+ ""
                + "\nPeso: " + pesoPessoaMaisGorda+ "");
        
        System.out.println("Pessoa mais magra:"
                + "\nCodigo: " + codPessoaMaisMagra+ ""
                + "\nAltura: " + alturaPessoaMaisMagra+ ""
                + "\nPeso: " + pesoPessoaMaisMagra+ "");
        
        System.out.println("Média de peso: "+ pesoTotal/cont);
        System.out.println("Média de altura: "+ alturaTotal/cont);
    }
}
