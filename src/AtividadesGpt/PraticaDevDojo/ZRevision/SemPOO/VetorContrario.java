package AtividadesGpt.PraticaDevDojo.ZRevision.SemPOO;

import java.util.Scanner;

public class VetorContrario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        System.out.println("Digite 5 números: ");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Números na ordem invertida -");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(" " + vetor[i]);
        }
        scanner.close();
    }
}
