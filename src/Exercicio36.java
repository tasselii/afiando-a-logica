import java.util.Arrays;
import java.util.Scanner;

public class Exercicio36 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            vetor[i] = (scan.nextInt());
        }

        Arrays.sort(vetor);

        for (int i = vetor.length - 1;i >= 0 ; i--) {
            System.out.print(vetor[i] + " ");
        }

        scan.close();
    }
}
