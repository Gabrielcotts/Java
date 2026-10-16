package AtividadesGpt.Projetos.ProjetoSistemaPlanetario.dominio.cargas;

import AtividadesGpt.Projetos.ProjetoSistemaPlanetario.dominio.status.StatusCarga;

public class Perigosa extends Cargas{
    private static final double TAXA_ADICIONAL_PERIGO = 0.30;

    public Perigosa(int codigo, String nome, double peso, double distancia, TiposCargas tiposCargas, StatusCarga statusCarga) {
        super(codigo, nome, peso, distancia, tiposCargas, statusCarga);
    }

    @Override
    public double calcularCustoTransporte() {
        double custoBase = getPeso() * getDistancia();
        return custoBase + (custoBase * TAXA_ADICIONAL_PERIGO);
    }

}
