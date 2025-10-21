import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x, a, b;

        while (true){

            System.out.print("\nDigite o primeiro valor: ");
            x = scan.nextInt();

            if (x > 0){
                break;
            } else
                System.out.println("\nNúmero inválido! O valor deve ser positivo!");
        }

        while (true){

            System.out.print("\nDigite o segundo valor: ");
            a = scan.nextInt();

            if (a > 0){
                break;
            } else
                System.out.println("\nNúmero inválido! O valor deve ser positivo!");
        }

        while (true) {

            System.out.print("\nDigite o terceiro valor: ");
            b = scan.nextInt();

            if (b > a) {
                break;
            } else
                System.out.printf("\nNúmero inválido!!! O valor que deve ser maior que %d.\n", a);
        }

        System.out.printf("\nA tabuada de %d de %d até %d é:\n", x, b, a);

        for(int cont = b; cont >= a; cont--) {
            System.out.printf("\n%d x %d: %d", x, cont, x*cont);
        }

        scan.close();
    }
}


