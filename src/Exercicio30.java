import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorOriginal = new int[5];
        int[] vetorResultado = new int[5];

        for (int i = 0; i < vetorOriginal.length; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            vetorOriginal[i] = scan.nextInt();
        }

        System.out.print("Digite a constante multiplicativa: ");
        int constante = scan.nextInt();

        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorResultado[i] = vetorOriginal[i] * constante;
        }

        System.out.println("\nVetor original:");
        for (int valor : vetorOriginal) {
            System.out.print(valor + " ");
        }

        System.out.println("\n\nVetor resultado (multiplicado):");
        for (int valor : vetorResultado) {
            System.out.print(valor + " ");
        }
    }
}
