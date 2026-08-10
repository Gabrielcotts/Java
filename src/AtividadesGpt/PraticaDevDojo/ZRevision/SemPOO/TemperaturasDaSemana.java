package AtividadesGpt.PraticaDevDojo.ZRevision.SemPOO;

import java.util.Scanner;

public class TemperaturasDaSemana {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[7];

        System.out.println("Digite as temperaturas de cada dia da semana");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print((i + 1) + "° dia - ");

            temperaturas[i] = scanner.nextDouble();
        }
        System.out.println();

        double maior = temperaturas[0];
        double menor = temperaturas[0];
        double soma = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }
            soma += temperaturas[i];
        }
        double media = soma / temperaturas.length;

        System.out.println(" ==== DADOS ====");
        System.out.println("Maior temperatura registrada: " + maior);
        System.out.println("Menor temperatura registrada: " + menor);
        System.out.println("Temperatura média registrada: " + media);

        System.out.println();
        System.out.println("==== POSIÇÕES ====");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println((i + 1) + "° dia - " + temperaturas[i]);
        }

    }
}
