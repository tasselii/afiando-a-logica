import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = scan.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scan.nextDouble();

        double menor = Math.min(n1, n2);

        System.out.printf("\nO menor número é %.0f", menor);
    }
}
