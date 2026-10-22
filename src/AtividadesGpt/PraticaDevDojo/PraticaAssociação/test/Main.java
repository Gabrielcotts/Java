package AtividadesGpt.PraticaDevDojo.PraticaAssociação.test;

import AtividadesGpt.PraticaDevDojo.PraticaAssociação.dominio.Bateria;
import AtividadesGpt.PraticaDevDojo.PraticaAssociação.dominio.RoboExplorador;

public class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria();
        RoboExplorador roboExplorador = new RoboExplorador(2, "Pikasso");

        System.out.println(roboExplorador);
    }
}

