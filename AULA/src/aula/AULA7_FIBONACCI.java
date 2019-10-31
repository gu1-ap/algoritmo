/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

/**
 *
 * @author guilherme.apinheiro1
 */
public class AULA7_FIBONACCI {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            int f = fib(i);
            System.out.print(f + " ");
        }
        
    }
    public static int fib (int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    
    return fib (n - 1)  + fib (n - 2);
    
    }
}

