package AtividadesGpt.PraticaDevDojo.PraticaAssociacao.dominio;

public class RoboExplorador {
    private final int CODIGO_IDENTIFICADOR;
    private String nome;
    private final Bateria bateria;
    private static final double CONSUMO_ENERGIA_POR_KM = 0.035;
    private double deslocamentoTotal = 0.0;

    public RoboExplorador(int CODIGO_IDENTIFICADOR, String nome) {
        this.CODIGO_IDENTIFICADOR = CODIGO_IDENTIFICADOR;
        this.nome = nome;
        this.bateria = new Bateria(200, 150);
    }

    public RoboExplorador(int CODIGO_IDENTIFICADOR, String nome, Bateria bateria) {
        this.CODIGO_IDENTIFICADOR = CODIGO_IDENTIFICADOR;
        this.nome = nome;
        this.bateria = bateria;
    }

    public double mover(double quilometros) {
        if (quilometros <= 0){
            throw new IllegalArgumentException("A distância de deslocamento deve ser maior que zero!");
        }
        double energiaGasta = quilometros * CONSUMO_ENERGIA_POR_KM;

        if (this.bateria.getCapacidadeAtual() < energiaGasta) {
            System.out.println("Robô " + nome + " não tem bateria suficiente para esta viagem!");
            throw new IllegalArgumentException("Bateria insuficiente!");
        }
        this.bateria.consumirEnergia(energiaGasta);
        this.deslocamentoTotal += quilometros;
        return deslocamentoTotal;
    }

    public void recarregarBateria() {
        this.bateria.recarregar();
        System.out.println("O robô " + this.nome + " teve sua bateria totalmente recarregada!");
        System.out.println(bateria);
    }

    @Override
    public String toString() {
        return
                "CODIGO_IDENTIFICADOR - " + CODIGO_IDENTIFICADOR +
                        "\nnome - " + nome +
                        "\n" + bateria +
                        "\n------------------------" +
                        "\ndeslocamentoTotal - " + deslocamentoTotal;
    }
}