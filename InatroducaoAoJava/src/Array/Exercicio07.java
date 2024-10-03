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
public class Exercicio07 {

    Scanner entrada = new Scanner(System.in);
    String[] alunos = new String[10];
    double[] notasProgramacao = new double[10];
    double[] notasRedes = new double[10];
    double[] notasManutencao = new double[10];
    double[] notasDados = new double[10];

    double[] medias = new double[10];

    int quantidadeAlunosCadastrados = 0;
    int quantidadeNotascadastradas = 0;

    public static void main(String[] args) {
        Exercicio07 minhaClasse = new Exercicio07();
        int opcao = 0;
        do {
            opcao = minhaClasse.mostrarMenu();
            switch (opcao) {
                case 0:
                    minhaClasse.mostrarRelatorioDeAlunos();
                    break;
                case 1:
                    minhaClasse.cadastrarAluno();
                    break;
                case 2:
                    minhaClasse.cadastrarNotas();
                    break;
                case 3:
                    minhaClasse.calcularMedia();
                    break; 
                case 4:
                    minhaClasse.mostrarRelatorioDeAlunos();
                    break;
                case 5:
                    minhaClasse.exibirAlunoComMaiorMedia();
                    break;
                case 6:
                    minhaClasse.exibirAlunoComMaiorNotaPorDisciplina();
                    break;
                case 7:
                    minhaClasse.exibirResultadoFinal();
                case 8:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 8);
    }

    public int mostrarMenu() {
        System.out.println("=== Menu de Opções ===\n"
                + "0. Mostrar Relatório\n"
                + "1. Cadastrar Alunos\n"
                + "2. Cadastrar Notas\n"
                + "3. Calcular Médias\n"
                + "4. Exibir Médias\n"
                + "5. Exibir Aluno com Maior Média\n"
                + "6. Exibir Aluno com Maior Nota em determinada Disciplina\n"
                + "7. Exibir lista de alunos com o resultado final (aprovado ou reprovado)\n"
                + "8. Sair do Programa\n"
                + "Escolha uma opção (1-8):");
        int opcaoEscolhida = entrada.nextInt();
        return opcaoEscolhida;
    }

    public void cadastrarAluno() {
        System.out.println("Informe o nome do aluno: ");
        alunos[quantidadeAlunosCadastrados] = entrada.next();
        quantidadeAlunosCadastrados++;
    }

    public void cadastrarNotas() {
        System.out.println("Informe a nota " +alunos[quantidadeNotascadastradas]+ " da diciplina de Programação: ");
        notasProgramacao[quantidadeNotascadastradas] = entrada.nextDouble();
        
        System.out.println("Informe a nota " +alunos[quantidadeNotascadastradas]+ " da diciplina de Redes: ");
        notasRedes[quantidadeNotascadastradas] = entrada.nextDouble();
        
        System.out.println("Informe a nota " +alunos[quantidadeNotascadastradas]+ " da diciplina de Manutenção: ");
        notasManutencao[quantidadeNotascadastradas] = entrada.nextDouble();
        
        System.out.println("Informe a nota " +alunos[quantidadeNotascadastradas]+ " da diciplina de Dados: ");
        notasDados[quantidadeNotascadastradas] = entrada.nextDouble();
        
        quantidadeNotascadastradas++;
    }

    public void mostrarRelatorioDeAlunos() {
        for (int i = 0; i < quantidadeAlunosCadastrados; i++) {
            System.out.println(alunos[i] + ": "
                    + notasProgramacao[i] + ", "
                    + notasRedes[i] + ", "
                    + notasManutencao[i] + ", "
                    + notasDados[i] + " - Média = "
                    + medias[i]);
        }
    }

    public void calcularMedia() {
        for (int i = 0; i < quantidadeNotascadastradas; i++) {
            medias[i] = (notasProgramacao[i] + notasRedes[i] + notasManutencao[i] + notasDados[i]) / 4;
        }
    }
    
    public void exibirAlunoComMaiorMedia() {
        double maiorMedia = 0;
        int indice = 0;
        for (int i = 0; i < quantidadeAlunosCadastrados; i++) {
            if (maiorMedia < medias[i]) {
                maiorMedia = medias[i];
                indice = i;
            }
        }
        System.out.println(alunos[indice] + " ficou com a maior média geral. Média: " + medias[indice]);
    }

    public void exibirAlunoComMaiorNotaPorDisciplina() {
        double maiorNota = 0;
        int indice = 0;

        System.out.println("Informe a disciplina que queria consultar: ");
        String disciplina = entrada.next();

        switch (disciplina) {
            case "programacao":
                for (int i = 0; i < quantidadeAlunosCadastrados; i++) {
                    if (maiorNota < notasProgramacao[i]) {
                        maiorNota = notasProgramacao[i];
                    }
                }
                break;

            case "redes":
                for (int i = 0; i < quantidadeAlunosCadastrados; i++) {
                    if (maiorNota < notasRedes[i]) {
                        maiorNota = notasRedes[i];
                        indice = i;
                    }
                }
                break;
                
            case "manutencao":
                for (int i = 0; i < quantidadeAlunosCadastrados; i++) {
                    if (maiorNota < notasManutencao[i]) {
                        maiorNota = notasManutencao[i];
                        indice = i;
                    }
                }
                break;
            case "dados":
                for (int i = 0; i < quantidadeAlunosCadastrados; i++) {
                    if (maiorNota < notasDados[i]) {
                        maiorNota = notasDados[i];
                        indice = i;
                    }
                }
                break;
            default:
                System.out.println("Esta disciplina não está no curso");
                break;
        }
        System.out.println(alunos[indice]
                + " ficou com a maior nota na disciplina de " +disciplina+ ". Nota: " +maiorNota);
    }
    
    public void exibirResultadoFinal() {
        for (int i = 0; i < quantidadeAlunosCadastrados; i++) {
            if (medias[i]>=60) {
                System.out.println(alunos[i]+": Aprovado!");
            }else{
                System.out.println(alunos[i]+": Reprovado!");
            }
        }
    }
}
