package aritmetica;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor dos 5 produtos: ");
        double produto01 = scan.nextDouble();
        double produto02 = scan.nextDouble();
        double produto03 = scan.nextDouble();
        double produto04 = scan.nextDouble();
        double produto05 = scan.nextDouble();

        System.out.print("Digite o valor do seu pagamento: ");
        double pagamento = scan.nextDouble();

        double valorTotal = (produto01 + produto02 + produto03 + produto04 + produto05);

        double troco = pagamento - valorTotal;

        String decisao = pagamento > valorTotal ? "Troco: R$" + troco : "Você ficou devendo R$" + troco;

        System.out.println(decisao);

        scan.close();
    }
}


