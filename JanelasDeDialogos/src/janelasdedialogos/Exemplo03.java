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
public class Exemplo03 {

    String[] options = {"Inverno", "Verão", "Outono", "Primavera"};

    public static void main(String[] args) {
        Exemplo03 exemplo = new Exemplo03();
        int qfc = JOptionPane.showOptionDialog(null, "Qual estação do ano você mais gosta?", "Escolha uma Estação", 0, 3, null, exemplo.options, exemplo.options[0]);

    }
}
