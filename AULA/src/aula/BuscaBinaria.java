package aula;

public class BuscaBinaria {

    public static void main(String[] args) {
        
        
        
       
    }

    public static int Vetor(int x, int v[]) {
        int m = 0;

        while (v[m] < x && m < v.length) {
            m++;
        }
        if (v[m] == x) {
            return m;
        } else {
            return -1;
        }

    }

}
