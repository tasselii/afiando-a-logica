package vetores_matrizes;

import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetor = new int[20];

        int quant, escolhido;

        while (true) {
            System.out.print("\nDigite a quantidade de valores que serão armazenados (até 20): ");
            quant = scan.nextInt();

            if (quant <= 20 && quant > 0) {
                break;
            } else {
                System.out.println("\nQuantidade inválida! Digite um número positivo até 20!");
            }
        }

        for (int i = 0; i < quant; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = scan.nextInt();
        }

        while (true) {

            System.out.print("\nDigite o valor que quer encontrar: ");
            escolhido = scan.nextInt();

            boolean encontrado = false;

            for (int i = 0; i < quant; i++) {
                if (vetor[i] == escolhido) {
                    System.out.println("\nValor encontrado na posição: " + i);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("\nValor não encontrado!");
            }

            int escolha;

            while (true) {
                System.out.print("\nDeseja fazer uma nova consulta? (1 = Sim / 2 = Não): ");
                escolha = scan.nextInt();
                if (escolha == 1 || escolha == 2) {
                    break;
                } else {
                    System.out.println("\nOpção inválida! Digite 1 ou 2.");
                }
            }

            if (escolha == 2) {
                System.out.println("\nPrograma encerrado!");
                break;
            }
        }
    }
}
