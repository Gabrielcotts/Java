package AtividadesGpt.PraticaDevDojo.ZRevision.SemPOO;

import java.util.Scanner;

public class VetorDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vertor = new int[5];

        System.out.println("Digite um valor para cada uma das posições: \n");
        for (int i = 0; i < vertor.length; i++) {
            System.out.println("Posição n° " + (i + 1) + ": ");

            int preencher = scanner.nextInt();
            vertor[i] = preencher;

        }

        System.out.println(" ---- Valores digitados ---- " );
        for (int j : vertor) {
            System.out.print(j + ". ");
        }

//        outra opção que imaginei:

//        for (int j = 0; j < vertor.length; j++) {
//            System.out.println("Posição n° " + (j + 1) + " = "  + vertor[j]);
//        }




    }
}
