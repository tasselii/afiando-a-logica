package aritmetica;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double raio = scan.nextDouble();

        double pi = 3.1415;

        double volume = (4.0 / 3.0) * pi * (raio * raio * raio);
        double area = 4 * pi * (raio * raio);

        System.out.printf("\nVolume da esfera: %.2f\n", volume);
        System.out.printf("Área da superfície: %.2f\n", area);
    }
}
