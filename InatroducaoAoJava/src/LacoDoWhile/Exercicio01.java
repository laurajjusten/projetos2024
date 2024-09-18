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
public class Exercicio01 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         String opcao = "";
         double valorTotal = 0;
         double totalCalorias = 0;
         double totalPratos = 0;
         do {
              System.out.println("MENU:"
                + "\n1. Pizza - R$25,00 - 800 calorias"
                + "\n2. Hamburguer - R$20,00 - 600 calorias"
                + "\n3. Salada - R$15,00 - 200 calorias"
                + "\n4. Lasanha - R$30,00 - 900 calorias"
                + "\n5. Suco - R$8,00 - 100 calorias");
              System.out.println("Escolha um prato: ");
              int prato = entrada.nextInt();
              totalPratos++;
              switch (prato) {
                  case 1:
                      valorTotal += 25;
                      totalCalorias += 800;
                      break;
                  case 2:
                      valorTotal += 20;
                      totalCalorias += 600;
                      break;
                  case 3:
                      valorTotal += 15;
                      totalCalorias += 200;
                      break;
                  case 4:
                      valorTotal += 30;
                      totalCalorias += 900;
                      break;
                  case 5:
                      valorTotal += 8;
                      totalCalorias += 100;
                      break;
              }
              System.out.println("Quer escolher mais um prato?"
                      + "\nS - sim;"
                      + "\nN - não;");
              opcao = entrada.next();
         } while (opcao.equalsIgnoreCase("S"));
         System.out.println("Valor total: "+ valorTotal);
         System.out.println("Total de calorias: "+ totalCalorias);
    }
    }

