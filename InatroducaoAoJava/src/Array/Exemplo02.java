/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Random;

/**
 *
 * @author Laura
 */
public class Exemplo02 {
    public static void main(String[] args) {
        int [] idades = new int [10000];
        Random aleatorio = new Random();
        for (int i = 0; i < 10000; i++) {
            idades[i] = aleatorio.nextInt(101);
        }
        //Mostre quantas pessoas tem mais de 60 anos;
        int pessoasMaisDe60 = 0;
        for (int i = 0; i < 10000; i++) {
            if(idades[i] > 60) {
                pessoasMaisDe60++;
            }
        }
        System.out.println("Total de pessoas com mais de 60: "+pessoasMaisDe60);
        
        //Mostre a idade da pessoa mais velha;
        int idadePessoaMaisVelha = 0;
        for (int i = 0; i < 10000; i++) {
            if (idades[i] > idadePessoaMaisVelha) {
                idadePessoaMaisVelha = idades[i];
            }
        }
        System.out.println("Idade da pessoa mais velha: "+ idadePessoaMaisVelha);
        
        //Mostre quantas pessoas são menores de idade;
        int quantidadeMenoresDeIdade = 0;
        for (int i = 0; i < 10000; i++) {
            if (idades[i]<18) {
                quantidadeMenoresDeIdade++;
            }
        }
        System.out.println("Quantidade de menores: "+ quantidadeMenoresDeIdade);
        
        //Exiba a média de idade de todas as pessoas;
        double totalIdades = 0;
        for (int i = 0; i < 10000; i++) {
            totalIdades = totalIdades + idades[i];
        }
        System.out.println("Média das idades: "+ totalIdades/10000);
    }
}
