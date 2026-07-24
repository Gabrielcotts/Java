package AtividadesGpt.PraticaDevDojo.ZRevision.test;

import AtividadesGpt.PraticaDevDojo.ZRevision.dominio.Produto;

import java.util.Scanner;

public class ProdutoTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto[] produtos = new Produto[8];

        System.out.println("Digite o nome e o preço do produto: ");

        for (int i = 0; i < produtos.length; i++) {
            System.out.print((i + 1) + "° produto\nNome: ");
            String nomeProduto = scanner.nextLine();

            System.out.print("Preço: R$ ");
            double precoProduto = scanner.nextDouble();
            scanner.nextLine();

            produtos[i] = new Produto(nomeProduto, precoProduto);
        }

        System.out.println("\n--- LISTA DE PRODUTOS ---");

        double maiorPreco = produtos[0].getPreco();
        double menorPreco = produtos[0].getPreco();
        double soma = 0;

        for (Produto produto : produtos) {
            produto.imprimirDados();
            System.out.println();

            if (produto.getPreco() > maiorPreco) {
                maiorPreco = produto.getPreco();
            }

            if (produto.getPreco() < menorPreco) {
                menorPreco = produto.getPreco();
            }

            soma += produto.getPreco();
        }

        double media = soma / produtos.length;

        System.out.println("Maior preço: R$ " + maiorPreco);
        System.out.println("Menor preço: R$ " + menorPreco);
        System.out.println("Preço médio: R$ " + media);

        scanner.close();
    }
}