/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

public class AULA {

    static int[][] imprimir(int linha1[][]) {
        System.out.println("--- IMPRIMIR MATRIZ ---");
        for (int i = 0; i < linha1.length; i++) {
            for (int j = 0; j < linha1[0].length; j++) {
                System.out.print(linha1[i][j] + " ");
            }
            System.out.println(" ");

        }

        return linha1;
    }

    static int[][] somar(int a[][], int b[][]) {
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[0].length; j++) {

                c[i][j] = a[i][j] + b[i][j];

            }

        }

        return c;
    }

    public static void main(String[] args) {

        int a[][] = {{1, 2}, {3, 4}};
        int b[][] = {{5, 6}, {7, 8}};

        int m[][] = somar(a, b);
        imprimir(m);

    }

}
