package vetores_matrizes;

import java.util.*;

public class Exercicio29 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            vetor[i] = scan.nextInt();
        }

        System.out.print("Digite a constante multiplicativa: ");
        int constante = scan.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = vetor[i] * constante;
        }

        System.out.println("\nVetor modificado:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
    }
}
