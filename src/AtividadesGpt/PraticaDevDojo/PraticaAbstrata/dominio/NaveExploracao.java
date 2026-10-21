package AtividadesGpt.PraticaDevDojo.PraticaAbstrata.dominio;

public class NaveExploracao extends Nave{
    private int quantidadeSondas;

    public NaveExploracao(String nome, double capacidadeCarga, int quantidadeSondas) {
        super(nome, capacidadeCarga);
        this.quantidadeSondas = quantidadeSondas;
    }

    @Override
    public void realizarMissao() {
        System.out.println("A nave de exploração foi lançada e liberou " + this.quantidadeSondas + " sondas para mapear o setor.");
    }

    @Override
    public String toString() {
        return super.toString(); /*+ " | Quantidade de sondas: " + this.quantidadeSondas;*/
    }
}
