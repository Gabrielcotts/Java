package AtividadesGpt.PraticaDevDojo.ZRevision.SemPOO;

import java.util.Scanner;

public class MaiorMenorMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vetor = new double[7];

        System.out.println("Digite o valor do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " + ( i + 1) + " : ");

            vetor[i] = sc.nextDouble();
        }

        System.out.println("---- Vetores ----");
        for (double v : vetor) {
            System.out.println(v);
        }


        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        double media = soma / vetor.length;

        double maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        double menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.println();

        System.out.println("Média: " + media );
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        sc.close();
    }
}