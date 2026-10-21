package AtividadesGpt.PraticaDevDojo.PraticaAbstrata.test;

import AtividadesGpt.PraticaDevDojo.PraticaAbstrata.dominio.NaveCarga;
import AtividadesGpt.PraticaDevDojo.PraticaAbstrata.dominio.NaveExploracao;

public class Main {
    public static void main(String[] args) {
        NaveCarga naveCarga = new NaveCarga("Abs", 1506.30, "Etanol");
        NaveExploracao naveExploracao = new NaveExploracao("jvs-plus", 2147.21, 51);

        System.out.println("=====NAVES=====");
        System.out.println(naveCarga);
        System.out.println(naveExploracao);

        System.out.println("------------------------------------------------------------------------");

        System.out.println("=====MISSÕES=====");
        naveCarga.realizarMissao();
        naveExploracao.realizarMissao();
    }
}
