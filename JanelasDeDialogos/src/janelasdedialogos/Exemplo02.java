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
public class Exemplo02 {

    public static void main(String[] args) {
        int opcao = JOptionPane.showConfirmDialog(null, "Você gosta de programação?", 
                "...:::Pergunta:::...",
                JOptionPane.YES_NO_OPTION);
        
        if(opcao == 0) {
            JOptionPane.showMessageDialog(null, "Gosta de programação!");
        }else{
            JOptionPane.showMessageDialog(null, "Que pena!");
        }
    }
}
