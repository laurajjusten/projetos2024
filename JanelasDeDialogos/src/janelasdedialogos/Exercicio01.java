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
public class Exercicio01 {

    public static void main(String[] args) {
       
        try {
            String numeroString = JOptionPane.showInputDialog(null, "Informe um número:");
            int numero = Integer.parseInt(numeroString);
            String divisores = "";
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    divisores += i + "; ";
                }
            }
            JOptionPane.showMessageDialog(null, "Os divisores de " + numero + "são:" + "\n" + divisores);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Você é um moleide!");
        }
        }
    }

