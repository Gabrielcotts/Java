package AtividadesGpt.PraticaDevDojo.ZRevision.test;

import AtividadesGpt.PraticaDevDojo.ZRevision.dominio.Player;

import java.util.Scanner;

public class PlayerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player[] jogadores = new Player[11];

        for (int i = 0; i < jogadores.length; i++) {
            System.out.println("Nome do jogador " + (i + 1) + ": ");
            String p = scanner.nextLine();
            jogadores[i] = new Player(p);
        }
        System.out.println("--- JOGADORES ---");
        for (Player jogador : jogadores) {
            jogador.imprimeDados();
        }

        scanner.close();
    }
}
