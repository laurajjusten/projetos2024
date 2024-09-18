/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LacoDoWhile;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcao = "";
        double totalIngressos = 0;
        double totalLanches = 0;
        int quantidadeIngressos = 0;
        int quantidadeLanches = 0;

        do {
            menuFilmes();
            System.out.println("Escolha um filme:");
            int filme = entrada.nextInt();
            quantidadeIngressos++;
            switch (filme) {
                case 1:
                    totalIngressos += 20;
                    break;
                case 2:
                    totalIngressos += 18;
                    break;
                case 3:
                    totalIngressos += 22;
                    break;
                case 4:
                    totalIngressos += 15;
                    break;
                case 5:
                    totalIngressos += 25;
                    break;
            }
            System.out.println("Quer escolher mais um filme?"
                    + "\nS - Sim;"
                    + "\nN - Não;");
            opcao = entrada.next();
        } while (opcao.equalsIgnoreCase("S"));

        do {
            menuLanches();
            System.out.println("Escolha um lanche:");
            int lanche = entrada.nextInt();
            quantidadeLanches++;
            switch (lanche) {
                case 1:
                    totalLanches += 10;
                    break;
                case 2:
                    totalLanches += 8;
                    break;
                case 3:
                    totalLanches += 12;
                    break;
                case 4:
                    totalLanches += 15;
                    break;
                case 5:
                    totalLanches += 5;
                    break;
            }
            System.out.println("Quer escolher mais um lanche?"
                    + "\nS - Sim;"
                    + "\nN - Não;");
            opcao = entrada.next();
        } while (opcao.equalsIgnoreCase("S"));
                System.out.println("Valor total da compra: " + totalLanches + totalIngressos);
             
    }

    public static void menuFilmes() {
        System.out.println("MENU DE FILMES:"
                + "\n1. Aventura Espacial - R$ 20,00"
                + "\n2. Comédia Romântica - R$ 18,00"
                + "\n3. Terror na Floresta - R$ 22,00"
                + "\n4. Documentário Animal - R$ 15,00"
                + "\n5. Filme de Ação - R$ 25,00");
    }

    public static void menuLanches() {
        System.out.println("MENU DE LANCHES:"
                + "\n1. Pipoca Média - R$ 10,00"
                + "\n2. Refrigerante - R$ 8,00"
                + "\n3. Nachos - R$ 12,00"
                + "\n4. Balde de Pipoca Grande - R$ 15,00"
                + "\n5. Chocolate - R$ 5,00");
    }
}
