package aula;

public class AULA7_RECURSÃO {

    static int potencia(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 2 * potencia( n - 1);
        }
    }

    public static void main(String[] args) {
        int a = potencia(8);
        System.out.println(a);
    }
}
