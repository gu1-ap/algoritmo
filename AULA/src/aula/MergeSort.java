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
public class MergeSort {
        
    public static void mergeSort(int p, int n, int v[]) {
        
        if (p < n - 1) {
            int q = (p + n) / 2;
            mergeSort(p, q, v);
            mergeSort(q, n, v);
            
        }
    
    }
     

}
