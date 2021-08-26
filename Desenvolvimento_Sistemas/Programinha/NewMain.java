/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject10;

/**
 *
 * @author Jose Pedro
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      int soma, idadeA, idadeB;
     
      
      idadeA = 32;
      idadeB = 43;
      
      soma = idadeA + idadeB;
      System.out.println(soma + " é soma das idades");
      
      if (idadeA > idadeB){
          System.out.println("idadeA é maior que idadeB");
      } else if (idadeA < idadeB){
          System.out.println("idadeB é maior que idadeA");
      } else {
          System.out.println("idadeA e idadeB são iguais");
      }
      
       int golf, jeep;
       
       golf = 66;
       jeep = 85;  //velocidade dos carros
       
       if (golf > jeep){
           System.out.println("O jeep é um carro muito lento");
       } else if (golf < jeep){
           System.out.println("Jeep tá virado num foguete");
       } else {
           System.out.println("Os dois carros tem a mesma potência");
       }
       
       int preçototal, coxinha, nutella;
       
       coxinha = 3;
       nutella = 20;
       
       if (coxinha > nutella){
           System.out.println("Inflação tá de brincadeira, coxinha é vida!");
       } else if (coxinha < nutella){
           System.out.println("Novidade né, nutella é boa, mas é cara");
       } else {
           System.out.println("Esse dia chegou, amém!");
       }
               
       soma = 2;
        for (int x = 1; x < 10; x++){
            soma = soma + x;
            System.out.println(soma);
        }
       
    }
    
}
