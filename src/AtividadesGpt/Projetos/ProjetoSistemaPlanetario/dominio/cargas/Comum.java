package AtividadesGpt.Projetos.ProjetoSistemaPlanetario.dominio.cargas;

import AtividadesGpt.Projetos.ProjetoSistemaPlanetario.dominio.status.StatusCarga;

public class Comum extends Cargas {

    public Comum(int codigo, String nome, double peso, double distancia, TiposCargas tiposCargas, StatusCarga statusCarga) {
        super(codigo, nome, peso, distancia, tiposCargas, statusCarga);
    }

    @Override
    public double calcularCustoTransporte() {
        return getPeso() * getDistancia();
    }
}
