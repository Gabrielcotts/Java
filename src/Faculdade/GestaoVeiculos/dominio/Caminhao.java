package Faculdade.GestaoVeiculos.dominio;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, double velocidadeAtual, double capacidadeCarga) {
        super(marca, modelo, ano, velocidadeAtual);
        this.capacidadeCarga = capacidadeCarga;
    }

    public Caminhao() {
    }

    @Override
    public void imprimirDados() {
        System.out.println("=== CAMINHAO ===");
        super.imprimirDados();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Verificação dos freios, pneus e capacidade de carga.");
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}