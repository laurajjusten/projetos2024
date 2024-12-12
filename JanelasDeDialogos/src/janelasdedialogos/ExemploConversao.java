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
public class ExemploConversao {

    public static void main(String[] args) {
        String idadeString = JOptionPane.showInputDialog(null,
                "Informe sua idade:");
        int idade = Integer.parseInt(idadeString);
        
        String pesoString = JOptionPane.showInputDialog(null,
                "Informe seu peso:");
        double peso = Double.parseDouble(pesoString);
    }
}
