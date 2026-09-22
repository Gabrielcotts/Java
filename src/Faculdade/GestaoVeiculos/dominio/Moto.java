package Faculdade.GestaoVeiculos.dominio;

public class Moto extends Veiculo {
    private boolean possuiPartidaEletrica;

    public Moto(String marca, String modelo, int ano, double velocidadeAtual, boolean possuiPartidaEletrica) {
        super(marca, modelo, ano, velocidadeAtual);
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }

    public Moto() {
        super();
    }

    @Override
    public void exibirDados() {
        System.out.println("=== MOTO ===");
        super.exibirDados();
        System.out.println("Possui partida eletrica: " + possuiPartidaEletrica);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Verificação da corrente e dos pneus.");
    }

    public boolean isPossuiPartidaEletrica() {
        return possuiPartidaEletrica;
    }

    public void setPossuiPartidaEletrica(boolean possuiPartidaEletrica) {
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }
}