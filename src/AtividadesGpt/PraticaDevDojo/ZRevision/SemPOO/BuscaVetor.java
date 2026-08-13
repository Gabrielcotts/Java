package AtividadesGpt.PraticaDevDojo.ZRevision.SemPOO;

import java.util.Scanner;

public class BuscaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int buscanumeros[] = new int[5];

        System.out.println("Digite alguns números aleatórios. ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + "° número - ");

            numeros[i] = scanner.nextInt();
        }

        System.out.println();

        System.out.println("Números registrados no sistema ");
        for (int i : numeros) {
            System.out.print(i + ". ");
        }
        System.out.println("\n");

        System.out.println("Digite 5 números para verificar se eles existem no sistema. ");
        for (int i = 0; i < buscanumeros.length; i++) {
            System.out.print((i + 1) + "° - ");

            buscanumeros[i] = scanner.nextInt();
        }
        System.out.println();

        System.out.println("Números escolhidos para verificação: ");
        for (int i : buscanumeros) {
            System.out.print(i + ". ");
        }
        System.out.println("\n");

        System.out.println("----- RESULTADO DA BUSCA ----- ");

        for (int i = 0; i < buscanumeros.length; i++) {
            int numeroAtual = buscanumeros[i];
            boolean encontrado = false;
            int posicao = -1;

            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] == numeroAtual) {
                    encontrado = true;
                    posicao = j;
                    break;
                }
            }

            if (encontrado) {
                System.out.println("O número " + numeroAtual + " foi encontrado no sistema na posição " + (posicao + 1));
            } else {
                System.out.println("O número " + numeroAtual + " não foi encontrado no sistema");
            }
        }
        scanner.close();
    }
}