package AtividadesGpt.PraticaDevDojo.PraticaInterfaces.test;

import AtividadesGpt.PraticaDevDojo.PraticaInterfaces.dominio.GerenciadorEnergia;
import AtividadesGpt.PraticaDevDojo.PraticaInterfaces.dominio.NaveMilitar;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        NaveMilitar n = new NaveMilitar("Destruidora de continentes", 5000, 98);
        System.out.println("====NAVE====");
        System.out.println(n);
        System.out.println("-------------------");
        n.realizarMissao();
        GerenciadorEnergia.exibirAvisoConsumo();
        System.out.println("-------------------");

        n.alertaAcoplagem();
        n.acoplarNaEstacao();
        n.recarregarEnergia();
    }
}
