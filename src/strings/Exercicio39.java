package strings;

import java.util.Scanner;

public class Exercicio39 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scan.nextLine().trim();

        String[] palavras = frase.split("\\s+");

        int quantidade = palavras.length;

        System.out.println("Quantidade de palavras: " + quantidade);

        scan.close();
    }
}
