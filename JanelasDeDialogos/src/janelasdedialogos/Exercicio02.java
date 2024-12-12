/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelasdedialogos;

import javax.swing.JOptionPane;

/**
 *
 * @author Laura
 */
public class Exercicio02 {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número inteiro:"));
        String saida = "";
        for (int i = 1; i <= 10; i++) {
            saida = saida + (i +" x "+ numero + " = "+ i*numero + "\n");
        }
        JOptionPane.showMessageDialog(null, saida);
    }
}
