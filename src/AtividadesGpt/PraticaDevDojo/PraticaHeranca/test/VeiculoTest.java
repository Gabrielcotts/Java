package AtividadesGpt.PraticaDevDojo.PraticaHeranca.test;

import AtividadesGpt.PraticaDevDojo.PraticaHeranca.dominio.Carro;
import AtividadesGpt.PraticaDevDojo.PraticaHeranca.dominio.Veiculo;

public class VeiculoTest {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Fiat", "Uno");
        Carro carro = new Carro("Fiat", "Uno", 2);

        veiculo.imprimeDados();
        System.out.println("---------");
        carro.imprimeDados();
    }
}
