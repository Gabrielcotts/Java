package AtividadesGpt.PraticaDevDojo.PraticaHeranca.dominio;

public class Produto2 {
    protected String nome;
    protected double preco;
    public static final double DESCONTO_MAXIMO;

    static {
        DESCONTO_MAXIMO = 30;
        System.out.println("Desconto máximo: " + DESCONTO_MAXIMO);
    }

    public Produto2(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$" + this.preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
