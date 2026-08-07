package AtividadesGpt.PraticaDevDojo.ZRevision.SemPOO;

import java.util.Scanner;

public class EstoqueSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome[] = new String[8];
        int[] quantidadeProduto = new int[8];


        System.out.println("Digite o nome e quantidade do produto: ");
        for (int i = 0; i < nome.length; i++) {
            System.out.println((i + 1) + "° Produto");
            System.out.print("Nome: ");
            nome[i] = scanner.nextLine();

            System.out.print("Quantidade: ");
            quantidadeProduto[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println();

        System.out.println("--- PRODUTOS ---");
        for (int i = 0; i < nome.length; i++) {
            System.out.println("\n" + (i + 1) + "° Produto");
            System.out.println("nome - " + nome[i]);
            System.out.println("quantidade " + quantidadeProduto[i]);

        }
        System.out.println();

        int soma = 0;
        for (int i = 0; i < quantidadeProduto.length; i++) {
            soma += quantidadeProduto[i];

        }
        System.out.println("Quantidade total de produtos: " + soma);

        System.out.println();

        int quantidadeZero = 0;
        for (int quantidade : quantidadeProduto) {
            if (quantidade == 0) {
                quantidadeZero++;
            }
        }
        System.out.println("Valores iguais a zero: " + quantidadeZero);
        System.out.println();


        System.out.println("==== Valores menores que 5 digitados ====");
        int menorQueCinco = 0;
        for (int i = 0; i < quantidadeProduto.length; i++) {
            if (quantidadeProduto[i] < 5) {
                System.out.println("n° - " + quantidadeProduto[i]);
                menorQueCinco++;
            }
        }
        System.out.println();
        System.out.println(menorQueCinco + " números são menores que cinco");
        System.out.println("===========================================");

        scanner.close();
    }
}
