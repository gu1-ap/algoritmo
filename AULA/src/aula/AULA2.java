/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

public class AULA2 {

    static int[][] imprimir(int linha1[][]) {
        System.out.println("--- IMPRIMIR MATRIZ ---");
        
        for (int i = 0; i < linha1.length; i++) {
            for (int j = 0; j < linha1[0].length; j++) {
                System.out.print(linha1[i][j] + " ");
            }

        }

        return linha1;
    }

    static int[][] mult(int a[][], int b[][]) {

        int[][] m = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                for (int k = 0; k < a.length; k++) {
                    m[i][j] = a[i][k] * b[k][j];
                }
            }

        }
        return m;
    }

    public static void main(String[] args) {

        int a[][] = {{1, 2}, {3, 4}};
        int b[][] = {{-1, 3}, {4, 2}};
        int c[][] = new int [2][2];

        c = mult(a, b);
        imprimir(c);

    }

}
