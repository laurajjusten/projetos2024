/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Exercicio08 {

    Scanner entrada = new Scanner(System.in);
    String[] produtos = new String[10];
    double[] preco = new double[10];
    int[] estoque = new int[10];
    int quantidadeEstoque = 0;
    double[] faturamento = new double[10];

    public static void main(String[] args) {
        Exercicio08 minhaClasse = new Exercicio08();
        int opcao = 0;
        minhaClasse.preencherListas();
        do {
            opcao = minhaClasse.mostrarMenu();
            switch (opcao) {
                case 0:
                    minhaClasse.motrarRelatorioDeProdutos();
                case 1:
                    minhaClasse.cadastrarProduto();
                    break;
                case 2:
                    minhaClasse.realizarVendas();
                    break;
                case 3:
                    minhaClasse.exibirFaturamento();
                    break;
                case 4:
                    minhaClasse.exibirProdutoMaisVendido();
                    break;
                case 5:
                    minhaClasse.exibirProdutoComMaiorFaturamento();
                    break;
                case 6:
                    minhaClasse.exibirListaDeEstoqueBaixo();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 7);
    }

    public int mostrarMenu() {
        System.out.println("=== Menu de Opções ===\n"
                + "0. Mostrar relatório\n"
                + "1. Cadastrar Produto\n"
                + "2. Realizar Venda\n"
                + "3. Exibir Faturamento Total\n"
                + "4. Exibir Produto mais Vendido\n"
                + "5. Exibir Produto com Maior Faturamento\n"
                + "6. Relatório de Estoque Baixo\n"
                + "7. Sair do Programa\n"
                + "Escolha uma opção (1-7):");
        int opcaoEscolhida = entrada.nextInt();
        return opcaoEscolhida;
    }

    public void cadastrarProduto() {
        System.out.println("Informe o produto: ");
        produtos[quantidadeEstoque] = entrada.next();
        System.out.println("Informe o preco: ");
        preco[quantidadeEstoque] = entrada.nextDouble();
        System.out.println("Informe o estoque: ");
        estoque[quantidadeEstoque] = entrada.nextInt();
        quantidadeEstoque++;
    }

    public void motrarRelatorioDeProdutos() {
        System.out.println(
                formatarSaida("Nome", 20)
                + formatarSaida("Preço", 10)
                + formatarSaida("Estoque", 10));
        for (int i = 0; i < quantidadeEstoque; i++) {
            System.out.println(formatarSaida(produtos[i], 20)
                    + formatarSaida("R$ " + preco[i], 10)
                    + formatarSaida("" + estoque[i], 10));
        }
    }

    public String formatarSaida(String texto, int tamanho) {
        while (texto.length() < tamanho) {
            texto = " " + texto;
        }
        return texto;
    }

    public void realizarVendas() {
        System.out.println("Solicite o nome do produto: ");
        String produto = entrada.next();
        System.out.println("Solicite a quantidade: ");
        int quantidade = entrada.nextInt();

        for (int i = 0; i < quantidadeEstoque; i++) {
            if (produto.equalsIgnoreCase(produtos[i])) {
                if (quantidade <= estoque[i]) {
                    estoque[i] = estoque[i] - quantidade;
                    faturamento[i] += quantidade * preco[i];
                    System.out.println("Produto vendido!");
                    return;
                } else {
                    System.out.println("Quantidade insuficiente!");
                    return;
                }
            }
        }
        System.out.println("Produto não encontrado!");
    }

    public void exibirFaturamento() {
        System.out.println("Faturamento: ");
        for (int i = 0; i < quantidadeEstoque; i++) {
            System.out.println(produtos[i] + ": " + faturamento[i]);
        }
    }

    public void exibirProdutoMaisVendido() {
        double maisVendido = 0;
        int indice = 0;
        for (int i = 0; i < quantidadeEstoque; i++) {
            if (maisVendido < faturamento[i] / preco[i]) {
                maisVendido = faturamento[i] / preco[i];
                indice = i;
            }
        }
        System.out.println(produtos[indice] + " foi o produto mais vendido com "
                + "" + maisVendido + " unidades.");
    }

    public void exibirProdutoComMaiorFaturamento() {
        double maiorFaturamento = 0;
        int indice = 0;
        for (int i = 0; i < quantidadeEstoque; i++) {
            if (maiorFaturamento < faturamento[i]) {
                maiorFaturamento = faturamento[i];
                indice = i;
            }
        }
        System.out.println(produtos[indice] + " foi o produto com maior faturamento.");
    }

    public void exibirListaDeEstoqueBaixo() {
        for (int i = 0; i < quantidadeEstoque; i++) {
            if (estoque[i] < 10) {
                System.out.println(produtos[i] + ": " + estoque[i]);
            }
        }
    }
    
        public void preencherListas(){
      produtos[0] = "Arroz";
      produtos[1] = "Feijão";
      produtos[2] = "Erva";
      preco[0] = 12.05;
      preco[1] = 16.55;
      preco[2] = 11.12;
      estoque[0] = 10;
      estoque[1] = 20;
      estoque[2] = 30;
      quantidadeEstoque = 3;
        }
}
