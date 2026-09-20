package AtividadesGpt.Projetos.ProjetoSistemaVeiculos.dominio;

public class Carro extends Veiculo{
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, TipoCombustivel tipoCombustivel, int numeroPortas) {
        super(marca, modelo, ano, tipoCombustivel);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Número de portas: " + this.numeroPortas);
    }
}