import java.util.Scanner;

public class exercicio38 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = 5;
        String[] nomes = new String[n];
        char[] sexos = new char[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPessoa " + (i + 1) + ":");

            System.out.print("Nome: ");
            nomes[i] = scan.nextLine();

            while (true) {
                System.out.print("Sexo (M/F): ");
                String s = scan.nextLine().trim().toUpperCase();
                if (s.equals("M") || s.equals("F")) {
                    sexos[i] = s.charAt(0);
                    break;
                } else {
                    System.out.println("Digite apenas 'M' ou 'F'.");
                }
            }

            while (true) {
                System.out.print("Idade: ");
                if (scan.hasNextInt()) {
                    int idade = scan.nextInt();
                    scan.nextLine();
                    if (idade > 0) {
                        idades[i] = idade;
                        break;
                    }
                } else {
                    scan.nextLine();
                }
                System.out.println("Idade inválida. Digite um número positivo.");
            }
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (idades[i] > idades[j]) {

                    int tempIdade = idades[i];
                    idades[i] = idades[j];
                    idades[j] = tempIdade;

                    String tempNome = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = tempNome;

                    char tempSexo = sexos[i];
                    sexos[i] = sexos[j];
                    sexos[j] = tempSexo;
                }
            }
        }

        System.out.println("\n=== Pessoas em ordem crescente de idade ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Nome: " + nomes[i] + " | Sexo: " + sexos[i] + " | Idade: " + idades[i]);
        }

        scan.close();
    }
}
