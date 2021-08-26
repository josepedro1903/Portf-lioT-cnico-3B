/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main;
import javax.swing.JOptionPane;
/**
 *
 * @author Jose Pedro
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            boolean continua = true;
            String aux;
            int menu;
            
            JOptionPane.showMessageDialog(null, "-----BEM VINDO AO MENU-----");
            aux = JOptionPane.showInputDialog("Você quer criar um soldado? \n1 - SIM \n0 - NÃO");
            menu = Integer.parseInt(aux);
            
            if(menu == 1){
                soldado jony = new soldado();
            do{
                aux = JOptionPane.showInputDialog("DIGITE 1 PARA ANDAR\nDIGITE 2 PARA ATACAR\nDIGITE 3 PARA SAIR");
                menu = Integer.parseInt(aux);
                
                switch(menu){
                    case 1: //andar
                         aux = JOptionPane.showInputDialog("Você quer escolher uma distância? \n1 - SIM \n0 - NÃO");
                         menu = Integer.parseInt(aux);
                         switch(menu){
                             case 0:
                                 jony.movimentar();
                                 int posicao = jony.obterPosicao();
                                 System.out.println("Posição: " + posicao);
                             break;
                                 
                             case 1:
                                 aux = JOptionPane.showInputDialog("Qual a distância?");
                                 menu = Integer.parseInt(aux);
                                 jony.movimentar(menu);
                                 posicao = jony.obterPosicao();
                                 System.out.println("Posição: " + posicao);
                             break;
                         }
                    break;
                       
                    case 2: //atacar
                    break;
                        
                    case 3: //sair
                        continua = false;
                    break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "Número inválido, tente novamente!");
                    break;
                }
            }while(continua == true);
        }        
    }
}

