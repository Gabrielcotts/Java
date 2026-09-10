package AtividadesGpt.PraticaDevDojo.PraticaHeranca.test;

import AtividadesGpt.PraticaDevDojo.PraticaHeranca.dominio.ProdutoEletronico;

public class ProdutoTest {
    public static void main(String[] args) {
    /*
    Minha previsão:

    1 - Bloco de inicialização estático da classe pai/superclasse "Produto"
    2 - Bloco de inicialização estático da classe filha/subclasse "ProdutoEletronico"
    3 - Bloco de inicialização de instância da classe pai/superclasse "Produto"
    4 - Contrutor da classe pai/superclasse "Produto"
    5 - Bloco de inicialização de instância da classe filha/subclasse "ProdutoEletronico"
    6 - Contrutor da classe filha/subclasse "ProdutoEletronico"
    */
        ProdutoEletronico produtoEletronico = new ProdutoEletronico(
                "Notebook",
                3500.00,
                12
        );
        System.out.println("---------------");
        produtoEletronico.imprimirDados();
    }
}
