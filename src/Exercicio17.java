import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = scan.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = scan.nextDouble();

        double r =  peso / Math.pow(altura, 2);

        System.out.println("--------------------------------");

        String imc = (r < 20) ? "Abaixo do peso"
                : (r >= 20 && r < 25) ? "Peso ideal"
                : (r >= 25) ? "Sobrepeso"
                : "Obesidade";

        scan.close();
    }
}


