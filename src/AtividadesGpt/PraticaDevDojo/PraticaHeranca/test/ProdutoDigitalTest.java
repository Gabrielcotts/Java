package AtividadesGpt.PraticaDevDojo.PraticaHeranca.test;

import AtividadesGpt.PraticaDevDojo.PraticaHeranca.dominio.Produto2;
import AtividadesGpt.PraticaDevDojo.PraticaHeranca.dominio.ProdutoDigital;

public class ProdutoDigitalTest {
    public static void main(String[] args) {
//        Produto2 produto2 = new Produto2();
//        produto2.DESCONTO_MAXIMO = 40;

        ProdutoDigital produtoDigital = new ProdutoDigital(536.21, "Bolsa térmica", 56.41);
        System.out.println("--------------------");
        produtoDigital.imprimeDados();

    }
}
