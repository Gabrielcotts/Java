package AtividadesGpt.RevisaoGeral_ConsolidacaoConteudo.Test;

import AtividadesGpt.RevisaoGeral_ConsolidacaoConteudo.Dominio.CadastroNotas01;

import java.util.Scanner;

public class CadastroNotasTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroNotas01 cadastroNotas01 = new CadastroNotas01();

        System.out.println("Digite seu nome: ");
        cadastroNotas01.setNomeAluno(scanner.nextLine());
        System.out.println();

        double[] notas = new double[5];

        System.out.println("Digite as notas finais das suas 5 matérias: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print((i + 1) + "° nota - ");

            notas[i] = scanner.nextDouble();
        }
        System.out.println();

        cadastroNotas01.setNota(notas);
        cadastroNotas01.imprimeDados();


    }
}
