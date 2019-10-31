/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.util.Scanner;

public class AULA3 {

    static Scanner input = new Scanner(System.in);

    static int TamanhoVetor() {

        System.out.println("Quantidade de produto : ");
        int d = input.nextInt();
        return d;
    }

    static int[] ReceberVetor(int recebe) {
        System.out.println("Receber Vetor : ");
        int[] r = new int[recebe];
        return r;
        

    }

    static int[] ImportarVetor(int[] Importe) {
        System.out.println("Vetores : ");
        for (int c = 0; c < Importe.length; c++) {
            System.out.printf("Vetor[%d]: ", c);
            Importe[c] = input.nextInt();
        }
        return Importe;
    }

    public static void main(String[] args) {

        
        
        int c;
        c = TamanhoVetor();
        int[] h = ReceberVetor(c);
        h = ImportarVetor(h);
        for (int i = 0; i < h.length; i++) {
            System.out.println(h[i]);

        }
    }
}
