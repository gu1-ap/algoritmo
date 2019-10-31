package aula;

public class AULA7 {

    //FATORIAL
    public static void main(String[] args) {
        int f = fatorial(5);
        System.out.println(f);

    }

    public static int fatorial(int n) {
        if (n == 1) {
            return 2;

        } else {
            return n * fatorial(n - 1);

        }

    }

}
