package AtividadesGpt.PraticaDevDojo.PraticaHeranca.dominio;

public class ProdutoEletronico extends Produto {
    private int garantiaMeses;

    static {
        System.out.println("Dentro do bloco de inicialização estático de produto eletrônico");
    }
    {
        System.out.println("Dentro do bloco de incialização de produto eletrônico");
    }

    public ProdutoEletronico(String nome, double preco){
        super(nome, preco);
    }

    public ProdutoEletronico(String nome, double preco, int garantiaMeses) {
        super(nome, preco);
        this.garantiaMeses = garantiaMeses;
        System.out.println("Construtor de produtos eletrônicos");
    }

    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Garantia de meses: " + this.garantiaMeses);
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }
}
