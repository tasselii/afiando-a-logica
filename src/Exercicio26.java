import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n;
        int soma = 0;
        int termo = 2;
        int incremento = 3;

        do {
            System.out.print("\nDigite o valor de N (1 a 99): ");
            n = scan.nextInt();

            if (n <= 0 || n >= 100) {
                System.out.println("\nValor inválido. Deve ser um número positivo menor que 100.");
            }
        } while (n <= 0 || n >= 100);

        for (int i = 1; i <= n; i++) {
            soma += termo;
            termo += incremento;
            incremento += 2;
        }

        System.out.println("Soma dos " + n + " primeiros termos = " + soma);
    }
}
