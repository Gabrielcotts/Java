package AtividadesGpt.Projetos.ProjetoSistemaVeiculos.dominio;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, TipoCombustivel tipoCombustivel, int cilindradas) {
        super(marca, modelo, ano, tipoCombustivel);
        this.cilindradas = cilindradas;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Cilindradas: " + this.cilindradas);
    }
}