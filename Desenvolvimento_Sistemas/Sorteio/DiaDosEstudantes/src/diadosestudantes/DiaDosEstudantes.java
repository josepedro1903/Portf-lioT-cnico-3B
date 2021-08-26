/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diadosestudantes;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Pedro
 */
public class DiaDosEstudantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Random aleatorio = new Random();        
        int confirma = 0;
        while (confirma == 0){
        
        confirma = JOptionPane.showConfirmDialog(null, "Gostaria de sortear um número entre 0 a 100?", "Sortear números", JOptionPane.YES_NO_OPTION);
        // 0 - sim || 1 - não
        
        if (confirma == 0){
            numero = aleatorio.nextInt(101);
            if (numero%2 == 0){
                //JOptionPane.showMessageDialog(null, "O número " + numero + " foi sorteado e é par :D");
                Resultado r = new Resultado();
                r.alterar_valor("O número " + numero + " foi sorteado e é par :D");
                r.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "O número " + numero + " foi sorteado e é ímpar :D");
            }
        }
        
    }
  }
}
