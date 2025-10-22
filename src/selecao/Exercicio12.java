package selecao;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = scan.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scan.nextDouble();

        if (n1 == n2) {
            System.out.printf("\nOs números %.0f, %.0f são identicos", n1, n2);
        } else {
            double maior = Math.max(n1, n2);
            System.out.printf("\nO maior número é %.0f", maior);
        }
    }
}
