import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        int n;

        while (true) {
            System.out.print("Digite o valor de N (1 a 19): ");
            n = scan.nextInt();

            if (n > 0 && n < 20) {
                break;
            } else {
                System.out.println("Valor inválido. Deve ser positivo e menor que 20.");
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int valor = scan.nextInt();
            numeros.add(valor);
        }

        int menor = Collections.min(numeros);
        int maior = Collections.max(numeros);
        int soma = numeros.stream().mapToInt(Integer::intValue).sum();
        double media = (double) soma / numeros.size();

        long positivos = numeros.stream().filter(x -> x > 0).count();
        long negativos = numeros.stream().filter(x -> x < 0).count();
        double percPositivos = (positivos * 100.0) / numeros.size();
        double percNegativos = (negativos * 100.0) / numeros.size();

        System.out.println("\nMaior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Soma de todos os números: " + soma);
        System.out.printf("Média dos números: %.2f%n", media);
        System.out.printf("Porcentagem de números positivos: %.2f%%\n", percPositivos);
        System.out.printf("Porcentagem de números negativos: %.2f%%\n", percNegativos);
    }
}
