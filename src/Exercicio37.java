import java.util.Arrays;
import java.util.Scanner;

public class Exercicio37 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Digite o %d° primeiro nome : ", (i+1));
            nomes[i] = (scan.nextLine());
        }

        Arrays.sort(nomes);

        System.out.println(" ");

        for (var x : nomes) {
            System.out.println(x);
        }

        scan.close();
    }
}
