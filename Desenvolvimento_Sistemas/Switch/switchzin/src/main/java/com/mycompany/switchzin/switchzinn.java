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
public class switchzinn {
    
     //atributos
 private int quantidade_portas;
 private int portas[];
 private int contador;

 //metodo construtor
 public switchzinn(){
     quantidade_portas = 5;
     portas = new int[quantidade_portas];
     contador = 0;
 } 
 
 public switchzinn(int qtd_portas){
     quantidade_portas = qtd_portas;
     portas = new int[quantidade_portas];
     contador = 0;
 }
 
 //metodo
 public void enviarMensagem(int porta_origem, int porta_destino, String mensagem){
     
    //montagem da tabela do switch
    
   for(int i = 0; i < quantidade_portas; i++){
     if(portas[i] == porta_origem){
       contador++;
     }
     if(portas[i] == 0 && contador == 0){
      portas[i] = porta_origem;
      break;
     }
   }
   contador = 0;

   //enviar mensagem
   
   for(int i = 0; i < quantidade_portas; i++){
   
if(portas[i] == porta_destino){
       System.out.println("de: " + porta_origem + " para: " + porta_destino + ": " + mensagem);
       break;
     }else{
       System.out.println("de: " + porta_origem + " para todos: " + mensagem);
       break;
     }
   }
   for(int i = 0; i < quantidade_portas; i++){
   System.out.println(portas[i]);
  } 
 }
}