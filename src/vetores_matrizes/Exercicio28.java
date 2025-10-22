package vetores_matrizes;

import java.util.*;

public class Exercicio28 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros.add(scan.nextInt());
        }

        Collections.reverse(numeros);

        for (var x : numeros) {
            System.out.printf("%d ", x);
        }

    }
}
