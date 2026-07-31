package AtividadesGpt.PraticaDevDojo.ZRevision.SemPOO;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("vetor - " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("---- Números digitados pelo usuário ----");
        for (int i : vetor) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.println("\n ---- Números pares encontrados ---- ");
        for (int numero : vetor) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();

        System.out.println("\n ---- Números ímpares encontrados ---- ");
        for (int numero : vetor) {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
            }
        }
        scanner.close();
    }
}