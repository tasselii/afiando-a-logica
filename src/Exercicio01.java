import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor da aresta do quadrado: ");
        double lado = scan.nextDouble();

        double area = lado * lado;

        System.out.printf("\nArea do Quadrado é de %.2f ", area);

        scan.close();
    }
}