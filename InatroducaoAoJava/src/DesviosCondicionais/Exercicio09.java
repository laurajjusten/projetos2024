/*
 * 9) Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço normal de
etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de
pagamento escolhida e efetuar o cálculo adequado.
Código Condição de pagamento
a) À vista em dinheiro ou cheque,  recebe 10% de desconto
b) À vista no cartão de crédito,   recebe 15% de desconto
c) Em duas vezes,                  preço normal de etiqueta sem juros
d) Em 10 vezes,                    preço normal de etiqueta mais juros de 10%
 */
package DesviosCondicionais;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Exercicio09 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o valor do produto:");
        int produto = entrada.nextInt();
        System.out.println("Informe a forma de pagamento."
                + "\nDigite 1 - Cheque"
                + "\nDigite 2 - Cartão"
                + "\nDigite 3 - Para parcelar em duas vezes"
                + "\nDigite 4 - Para parcelar em 10 vezes");
        System.out.println("Forma de pagamento:");
        String pagamento = entrada.next();
        
        if(pagamento.equals("1")) {
            System.out.println("Preço final = "+ produto*0.9);
        } else if(pagamento.equals("2")) {
            System.out.println("Preço final = "+ produto*0.85);
        } else if(pagamento.equals("3")) {
            System.out.println("Preço final = "+ produto);
        } else if(pagamento.equals("4")) {
            System.out.println("Preço final = "+ produto*1.1);
        }
    }
}
