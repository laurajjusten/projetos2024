
package janelasdedialogos;

import javax.swing.JOptionPane;

public class JanelasDeDialogos {
    public static void main(String[] args) {
        String primeiroNome = JOptionPane.showInputDialog(null, "Informe o seu primeiro nome");
        String nomeDoMeio = JOptionPane.showInputDialog(null, "Informe o seu nome do meio");
        String sobreNome = JOptionPane.showInputDialog(null, "Informe o seu sobrenome");
        String nomeCompleto = primeiroNome+" "+nomeDoMeio+" "+sobreNome;
        JOptionPane.showMessageDialog(null, nomeCompleto, "Nome Completo",JOptionPane.INFORMATION_MESSAGE);
    }
}
