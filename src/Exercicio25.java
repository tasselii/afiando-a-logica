

public class Exercicio25 {

    public static void main(String[] args) {
        int n = 30;
        long a = 1;
        long b = 1;

        System.out.println("Os 30 primeiros valores da série de Fibonacci:");
        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= n; i++) {
            long c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

