import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\n------- CONVERSOR DE MILHAS EM KM -------");
        System.out.print("Digite o valor em milhas: ");
        double milhasMaritmas = scan.nextDouble();

        double km = milhasMaritmas * 1852;

        System.out.printf("\n%.2f milhas maritimas em km é igual a %.2f km", milhasMaritmas, km);
    }
}
