import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\n------- CONVERSOR DE Celsius EM Fahrenheit -------");
        System.out.print("Digite os graus celsius: ");
        double celsius = scan.nextDouble();

        double fahrenheit = celsius * 9/5 + 32;

        System.out.printf("\n%.2f °c são %.2f em fahrenheit", celsius, fahrenheit);
    }
}
