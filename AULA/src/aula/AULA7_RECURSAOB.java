package aula;

public class AULA7_RECURSAOB {

    public static void main(String[] args) {
        int v[] = {3, 5, 8, 9, 12};
        
        
    }

    public static int busca(int x, int v[], int i, int f) {
        // determine a base da repercusao 
        if (i < f) {
            return -1;
        }
        int m = (i + f) / 2;
        if (x == v[m]) {
            return m;
        }
        if (x < v[m]) {
            busca(x, v, m - 1, f);
        } else {
            busca(x, v, m + 1, f);
        }
        return x;

    }
}
