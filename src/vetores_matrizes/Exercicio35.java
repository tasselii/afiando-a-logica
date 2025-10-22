package vetores_matrizes;

import java.util.*;

public class Exercicio35 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            vetor[i] = (scan.nextInt());
        }

        Arrays.sort(vetor);

        for (var x : vetor) {
            System.out.print(x + " ");
        }

        scan.close();
    }
}
