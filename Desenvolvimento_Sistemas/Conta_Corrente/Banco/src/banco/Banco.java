/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import javax.swing.JOptionPane;

/**
 *
 * @author SESI_SENAI
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           String nomePessoa =(JOptionPane.showInputDialog("Qual o seu nome?"));
           if (nomePessoa.equals("")){
               JOptionPane.showMessageDialog(null, "Não foi possível criar a conta"); 
           }else{          
           
           String nomeBanco =(JOptionPane.showInputDialog("Qual o nome do banco"));
           if (nomeBanco.equals("")){
               JOptionPane.showMessageDialog(null, "Não foi possível criar a conta"); 
           }else{
                                 
        int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Qual o número da conta? "));       
               if(numeroConta <= 0){
            JOptionPane.showMessageDialog(null, "Não foi possível criar a conta"); 
        }else{
                   ContaCorrente c = new ContaCorrente(numeroConta, nomeBanco, nomePessoa);
                         
                   
        int qdeposito = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do depósito? "));       
        if (qdeposito < 0){
            JOptionPane.showMessageDialog(null, "Não foi possível depositar o dinheiro"); 
        }else{
            
        c.deposito(qdeposito);
        
               
        int qsacar = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do saque? "));
        if (qsacar < 0){
            JOptionPane.showMessageDialog(null, "Não foi possível sacar o dinheiro"); 
        }else{
                    
        c.sacar(qsacar);
            
        
        JOptionPane.showMessageDialog(null, "O saldo de " + c.nomePessoa + " no banco " + c.nomeBanco + " é de " 
                + c.obterSaldo());
               }
        
     }
    }
   }
  }
 }
}
