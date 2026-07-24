package AtividadesGpt.PraticaDevDojo.ZRevision.dominio;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto() {
    }

    public boolean validarNome() {
        return this.nome != null && !this.nome.isEmpty();
    }

    public boolean validarPreco() {
        return this.preco > 0;
    }

    public void imprimirDados() {
        System.out.println("---- PRODUTO ----");

        if (!validarNome()) {
            System.out.println("Nome inválido!");
            return;
        }

        if (!validarPreco()) {
            System.out.println("Preço inválido!");
            return;
        }

        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preço do produto: R$ " + this.preco);
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