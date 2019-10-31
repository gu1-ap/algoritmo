/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.util.Arrays;

public class VETOR {

    static String diferenca(int a[], int b[]) {
        String res = "";
        boolean achou;
        for (int i = 0; i < a.length; i++) {
            achou = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    achou = true;
                }
            }
            if (!achou) {
                res += a[i] + " ";
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {7, 2, 5, 8, 4};
        int[] b = {4, 2, 9, 5};
        System.out.println(diferenca(a, b));
        System.out.println(diferenca(b, a));
    }
}