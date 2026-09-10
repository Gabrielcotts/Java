package AtividadesGpt.PraticaDevDojo.PraticaHeranca.dominio;

public class Produto {
    protected String nome;
    protected double preco;

    static {
        System.out.println("Dentro do bloco de inicialização estático de produto");
    }

    {
        System.out.println("Dentro do bloco de inicialização de produto");
    }

    public Produto(String nome, double preco) {
        System.out.println("Cadastro de produto");
        this.nome = nome;
        this.preco = preco;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }


}
