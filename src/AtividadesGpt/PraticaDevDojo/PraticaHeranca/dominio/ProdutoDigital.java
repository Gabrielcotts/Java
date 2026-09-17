package AtividadesGpt.PraticaDevDojo.PraticaHeranca.dominio;

public class ProdutoDigital extends Produto2 {
    private double tamanhoMB;

    public ProdutoDigital(double tamanhoMB,  String nome, double preco) {
        super(nome, preco);
        this.tamanhoMB = tamanhoMB;
    }

    @Override
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Tamanho mb " + this.tamanhoMB);
    }
}
