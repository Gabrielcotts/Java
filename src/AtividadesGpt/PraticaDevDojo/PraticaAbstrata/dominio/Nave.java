package AtividadesGpt.PraticaDevDojo.PraticaAbstrata.dominio;

public abstract class Nave {
    protected String nome;
    protected double capacidadeCarga;

    public Nave(String nome, double capacidadeCarga) {
        this.nome = nome;
        this.capacidadeCarga = capacidadeCarga;
    }

    public abstract void realizarMissao();

    @Override
    public String toString(){
        return "Nome: " + this.nome + " | Capacidade de carga: " + this.capacidadeCarga + " kg";
    }

}
