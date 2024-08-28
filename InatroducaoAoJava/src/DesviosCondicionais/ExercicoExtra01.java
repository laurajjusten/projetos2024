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
public class ExercicoExtra01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
         //Declaração de valores iniciais
        String usuario = "laura";
        String senha = "123efg";
        double saldo = 20000.0;
        String numeroConta = "12345-6";
        
        //Fazer login
        System.out.println("Acessando conta...");
        System.out.println("Usuário: ");
        String loginUsuario = entrada.next();
        System.out.println("Senha: ");
        String loginSenha = entrada.next();
        
        String extrato = "     Extrato    "
                + "\n***********************"
                + "\nNOME: " + usuario + ""
                + "\nN° Conta: " + numeroConta + "\n"
                + "\nSaldo anterior -> " + saldo;
        
        //Verificar acesso
        if (loginUsuario.equals(usuario) && loginSenha.equals(senha)) {
            System.out.println("Acesso concedido");
            System.out.println("O que deseja fazer? "
                    + "\nS - Saque"
                    + "\nD - Deposito");
            String operacao = entrada.next();
            switch (operacao) {
                case "S":
                    System.out.println("informe o valor a sacar: ");
                    double valorSaque = entrada.nextDouble();
                    saldo = saldo - valorSaque;
                    extrato = extrato + "\nSaque -> " + valorSaque;
                    break;
                case "D":
                    System.out.println("informe o valor a depositar: ");
                    double valorDeposito = entrada.nextDouble();
                    saldo = saldo + valorDeposito;
                    extrato = extrato + "\nDeposito -> " + valorDeposito;
                    break;
                default:
                    System.out.println("Usuario ou senha inválida!");
                    break;
            }
            extrato = extrato + "\nSaldo atual ->" + saldo
                    + "***********************";
            System.out.println(extrato);
        }
        }
}