import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        int maiusculas = 0;
        int minusculas = 0;
        StringBuilder trocada = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (Character.isUpperCase(c)) {
                maiusculas++;
                trocada.append(Character.toLowerCase(c));
            }
            else if (Character.isLowerCase(c)) {
                minusculas++;
                trocada.append(Character.toUpperCase(c));
            }
            else {
                trocada.append(c);
            }
        }

        System.out.println("\nFrase Lida: " + frase);
        System.out.println("Quantidade de Maiúsculas: " + maiusculas);
        System.out.println("Quantidade de Minúsculas: " + minusculas);
        System.out.println("Frase Lida (Trocada): " + trocada.toString());

        sc.close();
    }
}
