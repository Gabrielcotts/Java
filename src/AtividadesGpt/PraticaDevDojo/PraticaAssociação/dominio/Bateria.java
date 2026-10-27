package AtividadesGpt.PraticaDevDojo.PraticaAssociacao.dominio;

public class Bateria {
    private final double CAPACIDADE_MAX;
    private double capacidadeAtual;

    public Bateria() {
        this.CAPACIDADE_MAX = 100;
        this.capacidadeAtual = 100;
    }

    public Bateria(double CAPACIDADE_MAX, double capacidadeAtual) {
        if (capacidadeAtual < 0 || capacidadeAtual > CAPACIDADE_MAX) {
            throw new IllegalArgumentException(
                    "Capacidade atual da bateria tem que estar entre 0 e " + CAPACIDADE_MAX
            );
        }
        this.CAPACIDADE_MAX = CAPACIDADE_MAX;
        this.capacidadeAtual = capacidadeAtual;
    }

    public double consumirEnergia(double energiaConsumida) {
        this.capacidadeAtual -= energiaConsumida;
        return capacidadeAtual;
    }

    public double recarregar() {
        this.capacidadeAtual = this.CAPACIDADE_MAX;
        return capacidadeAtual;
    }

    @Override
    public String toString() {
        return "===== Bateria =====" +

                "\nCapacidade máxima = " + CAPACIDADE_MAX  + "% "+
                "\nCapacidade atual = " + capacidadeAtual + "% ";
    }

    public double getCAPACIDADE_MAX() {
        return CAPACIDADE_MAX;
    }

    public double getCapacidadeAtual() {
        return capacidadeAtual;
    }
}