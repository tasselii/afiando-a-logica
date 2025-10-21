import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = scan.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scan.nextDouble();

        double area = altura * base;

        String mensagem = area > 100 ? " é um Terreno grande" : ".";

        System.out.printf("\nO terreno de %.2f metros%s", area, mensagem);
    }
}
