/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main;

/**
 *
 * @author Jose Pedro
 */
public class soldado {
    
  //atributos
  private int posicao;
  private String arma;

  // metodo construtor
  public soldado(){
    posicao = 0;
    arma = "punho";
  }

  //metodos
  public void movimentar(){     
    posicao = posicao + 1;
  }

  public void movimentar(int distancia){     
    posicao = posicao + distancia; 
  }

  public int obterPosicao(){
    return posicao;
  }

  public void atacar(){
    System.out.println("Ataque com " + arma); 
  }

  public void atacar(String armaEscolhida){
    System.out.println("Ataque com um(a) " + armaEscolhida);
  }
}
    

