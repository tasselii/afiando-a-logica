package repeticao;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        while(true) {

            System.out.print("\nDigite o primeiro número: ");
            double num = scan.nextDouble();

            if (num >= 0) {
                System.out.println("\nOperação finalizada! ");
                break;
            } else System.out.println("\nNúmero inválido, Digite novamente!");
        }
    }
}
