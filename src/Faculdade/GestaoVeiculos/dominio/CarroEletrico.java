package Faculdade.GestaoVeiculos.dominio;

public class CarroEletrico extends Carro implements Eletrico, Conectavel, Rastreavel {
    private int nivelBateria;

    public CarroEletrico(String marca, String modelo, int ano, double velocidadeAtual, int quantidadePortas) {
        super(marca, modelo, ano, velocidadeAtual, quantidadePortas);
        this.nivelBateria = 0;
    }

    public CarroEletrico() {
    }

    @Override
    public void imprimirDados() {
        System.out.println("=== CARRO ELETRICO ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Velocidade: " + getVelocidadeAtual() + " km/h");
        System.out.println("Portas: " + getQuantidadePortas());
        System.out.println("Nivel da bateria: " + nivelBateria + "%");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Verificação da bateria, pneus e sistema elétrico.");
    }

    @Override
    public void carregarBateria() {
        nivelBateria = 100;
    }

    @Override
    public int getNivelBateria() {
        return nivelBateria;
    }

    @Override
    public void conectarInternet() {
        System.out.println("Veículo conectado.");
    }

    @Override
    public String obterLocalizacao() {
        return "Brasília-DF";
    }
}
