package AtividadesGpt.PraticaDevDojo.PraticaAssociacao.test;

import AtividadesGpt.PraticaDevDojo.PraticaAssociacao.dominio.Bateria;
import AtividadesGpt.PraticaDevDojo.PraticaAssociacao.dominio.RoboExplorador;
import AtividadesGpt.PraticaDevDojo.PraticaAssociacao.dominio.RoboLunar;

public class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria();
        RoboExplorador roboExplorador = new RoboExplorador(1, "Pikasso");
        roboExplorador.mover(4032.49);

        System.out.println("===== Robô Explorador =====");
        System.out.println(roboExplorador);
        System.out.println("-------------------");
        System.out.println("Recarregando bateria...");
        roboExplorador.recarregarBateria();

        System.out.println();

        RoboLunar roboLunar = new RoboLunar(2, "Ayla",  bateria , "Radar espacial");
        roboLunar.mover(766.31);

        System.out.println("===== Robô Lunar =====");
        System.out.println(roboLunar);
        System.out.println("-------------------");
        System.out.println("Recarregando bateria...");
        roboLunar.recarregarBateria();
    }
}
