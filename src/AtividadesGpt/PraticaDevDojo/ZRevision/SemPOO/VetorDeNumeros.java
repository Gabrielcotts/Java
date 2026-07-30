package AtividadesGpt.PraticaDevDojo.ZRevision.SemPOO;

import java.util.Scanner;

public class VetorDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite um valor para cada uma das posições:\n");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição n° " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("---- Valores digitados ----");
        for (int j : vetor) {
            System.out.print(j + ". ");
        }
        System.out.println();

        int soma = 0;
        for (int k : vetor) {
            soma += k;
        }

        System.out.println("\nResultado da soma: " + soma);

        scanner.close();
    }
}
