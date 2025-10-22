package repeticao;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        double num, num2;

        System.out.print("\nDigite o primeiro número: ");
        num = scan.nextDouble();

        while(true) {

            System.out.printf("\nDigite um número maior que %.0f: ", num);
            num2 = scan.nextDouble();

            if (num < num2) {
                System.out.println("\nOperação finalizada! ");
                System.out.printf("Primeiro número: %.0f | Segundo número: %.0f\n", num, num2);
                break;
            } else System.out.println("\nNúmero inválido!");
        }
    }
}
