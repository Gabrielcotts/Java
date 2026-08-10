package AtividadesGpt.PraticaDevDojo.ZRevision.SemPOO;

import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];

        System.out.println("Digite notas de 0 a 10 a seguir: ");


        for (int i = 0; i < notas.length; i++) {
            System.out.print((i + 1) + "° nota - ");

            notas[i] = scanner.nextDouble();
            if (notas[i] < 0 || notas[i] > 10) {
                System.out.println("Nota inválida");
                return;
            }
        }
        System.out.println();

        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];

        }
        double media = soma / 5;
        System.out.println();

        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aprovado! ");
        } else if (media >= 5) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }

        int menorIgualCinco = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] <= 5) {
                menorIgualCinco++;
            }
        }
        int maiorIgualSete = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 7){
                maiorIgualSete++;
            }
        }

        System.out.println();
        System.out.println("Quantidade de notas maiores ou iguais a 7: " + maiorIgualSete);
        System.out.println("Quantidade de notas menores ou iguais a 5: " + menorIgualCinco);

    }
}
