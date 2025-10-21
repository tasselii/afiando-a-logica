import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        System.out.println("Velocidade inicial em m/s");
        System.out.println("| m/s | km/h |");
        System.out.println("|-----|------|");
        System.out.println("| 5   | 18   |");
        System.out.println("| 10  | 36   |");
        System.out.println("| 20  | 72   |");
        System.out.print("Digite a velocidade inicial(m/s): ");
        double veloInicial = scan.nextDouble();

        System.out.println("\nAceleração (a) em m/s²");
        System.out.println("| a (m/s²) | Descrição         |");
        System.out.println("|-----------|-----------------|");
        System.out.println("| 2         | Aceleração leve  |");
        System.out.println("| 5         | Aceleração média |");
        System.out.println("| 9,8       | Gravidade        |");
        System.out.print("Digite a aceleração (m/s²): ");
        double aceleracao = scan.nextDouble();

        System.out.println("\nTempo de percurso (t) em segundos");
        System.out.println("| Tempo (s) | Minutos |");
        System.out.println("|-----------|---------|");
        System.out.println("| 30        | 0,5     |");
        System.out.println("| 60        | 1       |");
        System.out.println("| 120       | 2       |");
        System.out.print("Digite o tempo de percurso (s): ");
        double tempo = scan.nextDouble();

        double veloFinalMs = veloInicial + aceleracao * tempo;

        double veloFinalKm = veloFinalMs * 3.6;

        String velocidade = (veloFinalKm < 40) ? "Veículo muito lento"
                : (veloFinalKm <= 60) ? "Velocidade Permitida"
                : (veloFinalKm <= 80) ? "Velocidade de cruzeiro"
                : (veloFinalKm <= 120) ? "Veículo rápido"
                : "Veículo muito rápido";

        System.out.println();
        System.out.printf("Velocidade final: %.0f km/h - %s\n", veloFinalKm, velocidade);
    }
}
