package aritmetica;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as suas quatro notas: ");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();
        double n4 = scan.nextDouble();

        double media = (n1 + n2 + n3+ n4) / 4;

        System.out.printf("A média das notas é %.2f", media);
    }
}
