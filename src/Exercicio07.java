import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a cotação do dolar: ");
        double cotacaoDolar = scan.nextDouble();

        System.out.print("Digite a quantidade em dolar: ");
        double dolar = scan.nextDouble();

        double reais = dolar * cotacaoDolar;

        System.out.printf("\nUS$ %.2f equivalem a R$ %.2f%n", dolar, reais);

        scan.close();
    }
}


