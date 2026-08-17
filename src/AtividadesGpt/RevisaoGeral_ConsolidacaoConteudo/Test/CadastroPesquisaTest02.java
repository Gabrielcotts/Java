package AtividadesGpt.RevisaoGeral_ConsolidacaoConteudo.Test;

import AtividadesGpt.RevisaoGeral_ConsolidacaoConteudo.Dominio.CadastroPesquisa02;

import java.util.Scanner;

public class CadastroPesquisaTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroPesquisa02 cadastroPesquisa02 = new CadastroPesquisa02();
        double[] numeros = new double[10];
        double[] pesquisa = new double[10];

        System.out.println("Digite dez números: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + "° - ");

            numeros[i] = scanner.nextDouble();
        }
        System.out.println();

        for (double numero : numeros) {
            System.out.print("(" + numero + ") ");
        }
        System.out.println();

        System.out.println("Digite os números que deseja pesquisar: ");
        for (int i = 0; i < pesquisa.length; i++) {
            System.out.print((i + 1) + "° - ");

            pesquisa[i] = scanner.nextDouble();
        }
        System.out.println();

        System.out.println("Números digitados: ");
        for (double p : pesquisa) {
            System.out.print("(" + p + ")");
        }

        System.out.println("---- RESULTADO DA PESQUISA ----");
        for (int i = 0; i < pesquisa.length; i++) {
            double numeroAtual = pesquisa[i];
            boolean encontrado = false;
            double posicao = -1;

            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] == numeroAtual) {
                    posicao = j;
                    encontrado = true;
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
