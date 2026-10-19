package AtividadesGpt.Projetos.ProjetoSistemaPlanetario.dominio.cargas;

import AtividadesGpt.Projetos.ProjetoSistemaPlanetario.dominio.status.StatusCarga;

public class Refrigerada extends Cargas {
    private double valorExtraCombustivel;

    public Refrigerada(int codigo, String nome, double peso, double distancia, TiposCargas tiposCargas, StatusCarga statusCarga, double valorExtraCombustivel) {
        super(codigo, nome, peso, distancia, tiposCargas, statusCarga);
        this.valorExtraCombustivel = valorExtraCombustivel;
    }

    @Override
    public double calcularCustoTransporte() {
        return getPeso() * getDistancia() + (valorExtraCombustivel * getDistancia());
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Taxa extra de combustível refrigerado: R$ " + this.valorExtraCombustivel + " por unidade de distância");
    }

    public double getValorExtraCombustivel() {
        return valorExtraCombustivel;
    }

    public void setValorExtraCombustivel(double valorExtraCombustivel) {
        this.valorExtraCombustivel = valorExtraCombustivel;
    }
}
