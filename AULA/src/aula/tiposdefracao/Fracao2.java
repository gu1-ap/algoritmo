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
public class Fracao2 {
    // atributos 
    private int numerador , denominador;
    int d ;
    // construtor
    public Fracao2 (int numerador , int denominador ) {
        this.numerador = numerador;
        this.denominador = denominador;
    
    }
    // adicionar MULTIPLICAO , DIVISAO E IGUALDADE
    public Fracao2 soma (Fracao2 f) {
        int num = this.numerador * f.denominador + this.denominador * f.numerador;
        int den = this.denominador* f.denominador;
        Fracao2 res = new Fracao2(num, den);
        return res;
        //ou 
        //return new Fracao(num,den);
    }
    
    //metodos
    @Override
    public String toString () {
    return numerador + "/" + denominador;
    
    }
    public void apresentar()  {
        System.out.println(numerador + "/" + denominador);
}
            
                    
}
