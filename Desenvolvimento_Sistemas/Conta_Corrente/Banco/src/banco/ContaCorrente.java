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
public class ContaCorrente {
    // Atributos
    int numConta;
    String nomeBanco;
    String nomePessoa;
    float saldo;
    float valor2;
    String nome;
    
    // Metodos - Funções - Ações
    public ContaCorrente(int numConta, String nomeBanco, String nomePessoa) {  
        this.numConta = numConta;
        this.nomeBanco = nomeBanco;
        this.nomePessoa = nomePessoa;
    }
    
    
    public void deposito (float valor){       
        if (valor < 0){
            JOptionPane.showMessageDialog(null, "Não foi possivel depositar");
        }else{
            saldo = saldo + valor;
        }
    }
    
    public void sacar (float valor2){
        if (valor2 < 0){
            JOptionPane.showMessageDialog(null, "Não é possivel sacar esse valor!");
        }else{
           if (valor2 <= saldo){
            saldo = saldo - valor2;
        }else{
            JOptionPane.showMessageDialog(null, "Não é possivel sacar esse valor!");
        } 
        }
        
    }
    
    public float obterSaldo(){
        return saldo;
    }      
}
