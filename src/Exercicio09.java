import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();

        double nota2 = (15 - nota1) / 2;

        System.out.printf("Você precisa tirar %.2f na segunda nota para ser aprovado.\n", nota2);

        scan.close();
    }
}


