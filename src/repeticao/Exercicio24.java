package repeticao;

import java.util.ArrayList;

public class Exercicio24 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        int soma = 0;

        for(int a = 1; a <= 100; a++) {
            numeros.add(a);
        }

        for (var n : numeros) {
            soma += n;
        }

        System.out.println("\nSoma total: " + soma);

    }
}


