package repeticao;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        String sexo;

        System.out.println("--------------------------------------------");
        System.out.println("M- Masculino");
        System.out.println("F- Feminino");
        System.out.println("--------------------------------------------");

        do {
            System.out.print("\nDigite o seu sexo(M/F): ");
            sexo = scan.next();

            if(!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")) {
                System.out.println("\nSexo inválido! Digite novamente.");
            }

        } while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f"));

        if(sexo.equalsIgnoreCase("m")) {
            sexo = "Masculino";
        } else {
            sexo = "Feminino";
        }

        System.out.println("\nSexo registrado: " + sexo.toUpperCase());

        System.out.println("\nValor aceito! Cadastro concluído.");
    }
}
