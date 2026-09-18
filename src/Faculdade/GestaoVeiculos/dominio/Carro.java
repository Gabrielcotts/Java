package Faculdade.GestaoVeiculos.dominio;

public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int ano, double velocidadeAtual, int quantidadePortas) {
        super(marca, modelo, ano, velocidadeAtual);
        this.quantidadePortas = quantidadePortas;
    }

    public Carro() {
    }

    @Override
    public void imprimirDados() {
        System.out.println("=== CARRO ===");
        super.imprimirDados();
        System.out.println("Portas: " + quantidadePortas);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Troca de óleo e verificação dos freios.");
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
}