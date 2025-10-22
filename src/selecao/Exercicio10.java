package selecao;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a primeiro número: ");
        double num1 = scan.nextDouble();

        System.out.print("Digite a segundo número: ");
        double num2 = scan.nextDouble();

        double maiorNum = Math.max(num1, num2);

        System.out.printf("\nO maior número é %.0f", maiorNum);

        scan.close();
    }
}


