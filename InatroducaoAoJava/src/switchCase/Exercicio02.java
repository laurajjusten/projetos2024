/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchCase;

import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        int valor = entrada.nextInt();
        int um = valor / 1000;
        int cen = valor % 1000 / 100;
        int dez = valor % 100 / 10;
        int un = valor % 10;
        String ext = "";
        
        switch (um) {
            case 1:
                ext = ext + "Um mil ";
                break;
            case 2:
                ext = ext + "Dois mil ";
                break;
            case 3:
                ext = ext + "Três mil ";
                break;
            case 4:
                ext = ext + "Quatro mil ";
                break;
             case 5:
                ext = ext + "Cinco mil ";
                break;
            case 6:
                ext = ext + "Seis mil ";
                break;
            case 7:
                ext = ext + "Sete mil ";
                break;
            case 8:
                ext = ext + "Oito mil ";
                break;
            case 9:
                ext = ext + "Nove mil ";
                break;
        }
        
        switch (cen) {
            case 1:
                ext = ext + " Cem ";
                break;
            case 2:
                ext = ext + " Duzentos ";
                break;
            case 3:
                ext = ext + " Trezentos ";
                break;
            case 4:
                ext = ext + " Quatrocentos ";
                break;
            case 5:
                ext = ext + " Quinhentos ";
                break;
            case 6:
                ext = ext + " Seissentos ";
                break;
            case 7:
                ext = ext + " Setecentos ";
                break;
            case 8:
                ext = ext + " Oitocentos ";
                break;
            case 9:
                ext = ext + " Novecentos ";
                break;
        }
        
        switch (dez) {
            case 1:
                ext = ext + " Dez ";
                break;
            case 2:
                ext = ext + " Vinte ";
                break;
            case 3:
                ext = ext + " Trinta ";
                break;
            case 4:
                ext = ext + " Quarenta ";
                break;
            case 5:
                ext = ext + " Cinquenta ";
                break;
            case 6:
                ext = ext + " Sessenta ";
                break;
            case 7:
                ext = ext + " Setenta ";
                break;
            case 8:
                ext = ext + " Oitenta ";
                break;
            case 9:
                ext = ext + " Noventa ";
                break;
        }
        
        switch (un) {
           case 1:
                ext = ext + " Um";
                break;
            case 2:
                ext = ext + " Dois";
                break;
            case 3:
                ext = ext + " Três";
                break;
            case 4:
                ext = ext + " Quatro";
                break;
            case 5:
                ext = ext + " Cinco";
                break;
            case 6:
                ext = ext + " Seis";
                break;
            case 7:
                ext = ext + " Sete";
                break;
            case 8:
                ext = ext + " Oito";
                break;
            case 9:
                ext = ext + " Nove";
                break;
        }
        ext = ext.replace("  "," e ");
        System.out.println(ext);
        
        }
    }
