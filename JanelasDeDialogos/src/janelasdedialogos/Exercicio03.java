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
public class Exercicio03 {

    String[] cores = {"Amarelo", "Verde", "Vermelho", "Azul"};
    String[] comidas = {"Churrasco", "Pizza", "Macarronada", "Lasanha"};
    String[] esportes = {"Voleibol", "Futebol", "Corrida", "Poker"};
    String[] cursos = {"Computação", "Veterinária", "Medicina", "Matemática"};

    int[] votosCores = new int[4];
    int[] votosComidas = new int[4];
    int[] votosEsportes = new int[4];
    int[] votosCursos = new int[4];
    int quantidadeVotos = 0;

    public static void main(String[] args) {
        Exercicio03 ex = new Exercicio03();
        do {
            ex.quantidadeVotos++;
            int corEscolhida = JOptionPane.showOptionDialog(null, "Qual é sua cor favorita?", "Escolha", 0, 3, null, ex.cores, null);
            ex.votosCores[corEscolhida]++;
            int comidaEscolhida = JOptionPane.showOptionDialog(null, "Qual é sua comida favorita?", "Escolha", 0, 3, null, ex.comidas, null);
            ex.votosComidas[comidaEscolhida]++;
            int esporteEscolhido = JOptionPane.showOptionDialog(null, "Qual é seu esporte favorito?", "Escolha", 0, 3, null, ex.esportes, null);
            ex.votosEsportes[esporteEscolhido]++;
            int cursoEscolhido = JOptionPane.showOptionDialog(null, "Qual é seu curso favorito?", "Escolha", 0, 3, null, ex.cursos, null);
            ex.votosCursos[cursoEscolhido]++;
            
        } while (JOptionPane.showConfirmDialog(null, "Há mais alguém para responder?") == 0);
           ex.mostrarSaida(ex.cores, ex.votosCores, "Resultado das cores\n");
           ex.mostrarSaida(ex.comidas, ex.votosComidas, "Resultado das comidas\n");
           ex.mostrarSaida(ex.esportes, ex.votosEsportes, "Resultado dos esportes\n");
           ex.mostrarSaida(ex.cursos, ex.votosCursos, "Resultado dos cursos\n");
    }
    
    public void mostrarSaida(String [] opcoes, int [] votos, String tipos) {
        String saida = tipos;
        for (int i = 0; i < 4; i++) {
            saida += opcoes[i]+ ": "+ (votos[i]*100/quantidadeVotos) + "%\n";
        }
        JOptionPane.showMessageDialog(null, saida);
    }
}
