import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a Velocidade Inicial em m/s : ");
        double veloInicial = scan.nextDouble();

        System.out.print("Digite a Aceleração em m/s²: ");
        double Aceleracao = scan.nextDouble();

        System.out.print("Digite o Tempo do Percursor em minutos: ");
        double tempoMinutos = scan.nextDouble();

        double tempoSegundos = tempoMinutos * 60;

        double veloFinal = (veloInicial + Aceleracao * tempoSegundos) * 3.6;

        System.out.printf("Velocidade final: %.2f km/h%n", veloFinal);

    }
}


