package strings;

import java.util.Scanner;

public class Exercicio40 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scan.nextLine().trim();

        String[] palavras = frase.split("\\s+");

        int quantidade = palavras.length;

        String fraseInvertida = new StringBuilder(frase).reverse().toString();

        System.out.println("\nFrase lida: " + frase);
        System.out.println("Frase invertida: " + fraseInvertida);
        System.out.println("Quantidade de palavras: " + quantidade);

        scan.close();
    }
}
