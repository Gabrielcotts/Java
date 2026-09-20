package AtividadesGpt.Projetos.ProjetoSistemaVeiculos.dominio;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected TipoCombustivel tipoCombustivel;
    public static final int ANO_MINIMO = 2000;

    public Veiculo(String marca, String modelo, int ano, TipoCombustivel tipoCombustivel) {
        if (ano < ANO_MINIMO) {
            throw new IllegalArgumentException("ERRO! Trabalhamos apenas com veículos a partir do ano " + ANO_MINIMO);
        }

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipoCombustivel = tipoCombustivel;
    }

    public void imprimeDados() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano );
        System.out.println("Tipo de combustível: " + this.tipoCombustivel.getNomeRelatorio());
    }

    public final void imprimeLimiteVelocidade(double limiteVelocidade) {
        System.out.println("Limite de velocidade: " + limiteVelocidade + " km/h");
    }
}