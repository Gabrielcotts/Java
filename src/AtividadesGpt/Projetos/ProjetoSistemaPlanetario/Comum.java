package AtividadesGpt.Projetos.ProjetoSistemaPlanetario;

public class Comum extends Cargas {

    public Comum(int codigo, String nome, double peso, double distancia) {
        super(codigo, nome, peso, distancia);
    }

    @Override
    public double calcularCustoTransporte() {
        return getPeso() * getDistancia();
    }
}
