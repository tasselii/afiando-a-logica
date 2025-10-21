import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sexo;

        System.out.print("Digite seu peso: ");
        double peso = scan.nextDouble();

        System.out.print("\nDigite sua altura: ");
        double altura = scan.nextDouble();

        while(true) {
            System.out.print("\nDigite o número que define seu sexo: \n1- Masculino\n2- Feminino\n");
            sexo = scan.nextInt();

            if (sexo == 1 || sexo == 2) {
                break;
            } else System.out.println("Sexo inválido! Tente Novamente.");
        }

        double r =  peso / Math.pow(altura, 2);

        switch (sexo) {
            case 1:
                if (r < 20) {
                    System.out.println("Abaixo do peso");
                } else if (r >= 20 && r < 25) {
                    System.out.println("Peso ideal");
                } else if (r >= 25)
                    System.out.println("Acima do peso");
                break;
            case 2:
                if (r < 19) {
                    System.out.println("Abaixo do peso");
                } else if (r >= 19 && r < 24) {
                    System.out.println("Peso ideal");
                } else if (r >= 24)
                    System.out.println("Acima do peso");
                break;
        }

        scan.close();
    }
}


