package Faculdade.GestaoVeiculos.dominio;

public class Caminhao extends Veiculo {

    public Caminhao(String marca, String modelo, int ano, double velocidadeAtual) {
        super(marca, modelo, ano, velocidadeAtual);
    }

    public Caminhao() {
        super();
    }

    @Override
    public void exibirDados() {
        System.out.println("=== CAMINHAO ===");
        super.exibirDados();
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Verificação dos freios e dos pneus.");
    }
}