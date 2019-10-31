
package aula;
import java.awt.BorderLayout;
import java.util.Scanner;
public class AULA4 {
   
    
    public static void main(String[] args) {
         float juros[] = {0,20f ,0,21f , 0,19f, 0,18f , 0,03f , 0,010f, 0,20f , 0,30f , 0,32f , 0,40f};
         Scanner leitor = new Scanner(System.in);
         System.out.println("Quantidades de produtos :");
         int n = leitor.nextInt();
         
         float produtos[] = new float[n];
         ler(produtos);
    }
    public static void ler(float [] v) {
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Valor do vetor[%d] " + (i+1) + ": ");
            v[i] = leitor.nextFloat();
            
        }
    }
    public static void imprimir(float [] v) {
            for (int i = 0; i < 10; i++) {
                System.out.printf("Teste %f\n", v[i] );
                System.out.println("");
            }
    }
    public static void Aplicarjuros(float[]produtos , float [] taxas) {
        for (int i = 0; i < produtos.length; i++) {
             for (int j = 0; j < taxas.length; j++) {
                 produtos[i] = produtos[i] * (1+ taxas[j]);
        }
        }
       
        
    }
}
