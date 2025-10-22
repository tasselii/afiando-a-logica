package vetores_matrizes;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 5; // número de pessoas
        String[] nomes = new String[n];
        char[] sexos = new char[n];
        int[] idades = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");

            System.out.print("Nome: ");
            nomes[i] = scan.nextLine().trim();

            char s;
            while (true) {
                System.out.print("Sexo (F/M): ");
                String sexoInput = scan.nextLine().trim();
                if (sexoInput.isEmpty()) {
                    System.out.println("Entrada vazia. Digite F ou M.");
                    continue;
                }
                s = Character.toUpperCase(sexoInput.charAt(0));
                if (s == 'F' || s == 'M') {
                    sexos[i] = s;
                    break;
                } else {
                    System.out.println("Sexo inválido. Digite apenas 'F' ou 'M'.");
                }
            }

            int idade;
            while (true) {
                System.out.print("Idade: ");
                if (!scan.hasNextInt()) {
                    System.out.println("Entrada inválida. Digite um número inteiro.");
                    scan.nextLine();
                    continue;
                }
                idade = scan.nextInt();
                scan.nextLine();
                if (idade > 0) {
                    idades[i] = idade;
                    break;
                } else {
                    System.out.println("Idade inválida. Deve ser maior que 0.");
                }
            }
        }


        System.out.println();

        System.out.println("=== Pessoas maiores de 18 anos ===");
        int contMaior = 0;

        for (int i = 0; i < n; i++) {
            if (idades[i] > 18) {
                System.out.println("Nome: " + nomes[i] + " | Sexo: " + sexos[i] + " | Idade: " + idades[i]);
                contMaior++;
            }
        }

        if (contMaior == 0) {
            System.out.println("Nenhuma pessoa maior de 18 anos encontrada.");
        } else {
            double porcentagem = (contMaior * 100.0) / n;
            System.out.println("\nQuantidade de pessoas maiores de 18: " + contMaior);
            System.out.printf("Porcentagem em relação ao total: %.2f%%\n", porcentagem);
        }

        scan.close();
    }
}
