/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.tiposdefracao;

/**
 *
 * @author guilherme.apinheiro1
 */
public class TesteFracao {
    public static void main(String[] args) {
        
    
    Fracao2 f1 = new Fracao2 (3,4) ;
    Fracao2 f2 = new Fracao2   (1, 2);
    Fracao2 res = f1.soma(f2);
    System.out.println(f1  + " + " + f2 + " = " + res);
    
    }
}

