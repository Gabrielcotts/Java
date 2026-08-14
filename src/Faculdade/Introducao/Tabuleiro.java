package Faculdade.Introducao;

public class Tabuleiro {
    public static void main(String[] args) {
        int[][] tabuleiro = new int[8][8];
        int[][] dinamico;

        dinamico = new int[10][];

        for (int i = 0; i < dinamico.length; i++) {
            System.out.print((i + 1) + "º. ");
            dinamico[i] = new int[i + 1];
        }
        System.out.printf("%d", dinamico.length);

        System.out.println();

        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.print((i + 1) + "º. ");

        }

    }
}
