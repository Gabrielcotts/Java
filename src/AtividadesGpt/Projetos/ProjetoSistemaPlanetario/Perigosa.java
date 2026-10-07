package AtividadesGpt.Projetos.ProjetoSistemaPlanetario;

public class Perigosa extends Cargas{
    private static final double TAXA_ADICIONAL_PERIGO = 0.30;

    public Perigosa(int codigo, String nome, double peso, double distancia) {
        super(codigo, nome, peso, distancia);
    }

    @Override
    public double calcularCustoTransporte() {
        double custoBase = getPeso() * getDistancia();
        return custoBase + (custoBase * TAXA_ADICIONAL_PERIGO);
    }
}
