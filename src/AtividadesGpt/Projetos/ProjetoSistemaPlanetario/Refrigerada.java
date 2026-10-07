package AtividadesGpt.Projetos.ProjetoSistemaPlanetario;

public class Refrigerada extends Cargas {
    private double valorExtraCombustivel;

    public Refrigerada(int codigo, String nome, double peso, double distancia, double valorExtraCombustivel) {
        super(codigo, nome, peso, distancia);
        this.valorExtraCombustivel = valorExtraCombustivel;
    }

    @Override
    public double calcularCustoTransporte() {
        return getPeso() * getDistancia() + (valorExtraCombustivel * getDistancia());
    }

}
