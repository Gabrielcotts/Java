package AtividadesGpt.PraticaDevDojo.PraticaAssociação.dominio;

public class RoboExplorador {
    private final int CODIGO_IDENTIFICADOR;
    private String nome;
    private final Bateria bateria;
    private static final double CONSUMO_ENERGIA_POR_KM = 0.0035;
    private double deslocamentoTotal = 0.0;

    public RoboExplorador(int CODIGO_IDENTIFICADOR, String nome) {
        this.CODIGO_IDENTIFICADOR = CODIGO_IDENTIFICADOR;
        this.nome = nome;
        this.bateria = new Bateria();
    }

    public RoboExplorador(int CODIGO_IDENTIFICADOR, String nome, Bateria bateria) {
        this.CODIGO_IDENTIFICADOR = CODIGO_IDENTIFICADOR;
        this.nome = nome;
        this.bateria = bateria;
    }


    public double mover(double quilometros) {
        double energiaGasta = quilometros * CONSUMO_ENERGIA_POR_KM;

        if (this.bateria.getCapacidadeAtual() < energiaGasta) {
            System.out.println("Robô " + nome + " não tem bateria suficiente para esta viage!");
            return 0;
        }
        this.bateria.consumirEnergia(energiaGasta);
        this.deslocamentoTotal += quilometros;
        return energiaGasta;
    }

    @Override
    public String toString() {
        return

                " ===== RoboExplorador =====" +
                "\nCODIGO_IDENTIFICADOR - " + CODIGO_IDENTIFICADOR +
                "\nnome - " + nome +
                "\n" + bateria +
                "\n------------------------" +
                "\ndeslocamentoTotal - " + deslocamentoTotal;
    }
}
