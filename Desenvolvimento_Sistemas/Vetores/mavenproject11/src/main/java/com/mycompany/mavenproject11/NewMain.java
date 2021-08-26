/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject11;
import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author Jose Pedro
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int vetor[] = new int[100];
    Random dado = new Random();
    int contador1 = 0;
    int contador2 = 0;
    int contador3 = 0;
    int contador4 = 0;
    int contador5 = 0;
    int contador6 = 0;
    
    for(int j = 0; j <= 99; j++){
        vetor[j] = dado.nextInt(6) + 1;
        System.out.println(vetor[j]);
        if(vetor[j] == 1){
            contador1++;    
        }else if(vetor[j] == 2){
            contador2++;
        }else if(vetor[j] == 3){
            contador3++;
        }else if(vetor[j] == 4){
            contador4++;
        }else if(vetor[j] == 5){
            contador5++;
        }else if(vetor[j] == 6){
            contador6++;
        }else{
            System.out.println("O valor " + vetor[j] + " está fora do limite escolhido");
        }
    }
    System.out.println("Foram sorteados " + contador1 + " valores de 1 \n" + contador2 + " valores de 2 \n" + contador3 + " valores de 3 \n" + contador4 + " valores de 4 \n" + contador5 + " valores de 5 \n" + contador6 + " valores de 6 \n");
    }
}
