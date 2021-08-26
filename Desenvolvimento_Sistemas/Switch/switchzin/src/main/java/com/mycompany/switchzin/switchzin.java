/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.switchzin;

/**
 *
 * @author Jose Pedro
 */
public class switchzin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         switchzinn s = new switchzinn(3);
         s.enviarMensagem(1,2,"mensagem");  
         s.enviarMensagem(1,3,"mensagem");  
         s.enviarMensagem(2, 1, "oi");
    }
}
