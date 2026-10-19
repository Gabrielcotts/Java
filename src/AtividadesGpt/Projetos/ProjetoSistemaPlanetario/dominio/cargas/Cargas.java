package AtividadesGpt.Projetos.ProjetoSistemaPlanetario.dominio.cargas;

import AtividadesGpt.Projetos.ProjetoSistemaPlanetario.dominio.status.StatusCarga;

public abstract class Cargas {
    protected int codigo;
    protected String nome;
    protected double peso;
    protected double distancia;
    private TiposCargas tiposCargas;
    private StatusCarga statusCarga;

    public Cargas(int codigo, String nome, double peso, double distancia, TiposCargas tiposCargas) {
        this.codigo = codigo;
        this.nome = nome;
        this.peso = peso;
        this.distancia = distancia;
        this.tiposCargas = tiposCargas;
        this.statusCarga = StatusCarga.AGUARDANDO;
    }

    public Cargas(int codigo, String nome, double peso, double distancia, TiposCargas tiposCargas, StatusCarga statusCarga) {
        this.codigo = codigo;
        this.nome = nome;
        this.peso = peso;
        this.distancia = distancia;
        this.tiposCargas = tiposCargas;
        this.statusCarga = statusCarga;
    }

    public abstract double calcularCustoTransporte();

    public void imprimeDados(){
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + (this.tiposCargas != null ? this.tiposCargas.getNOME_CARGA() : "Não definido"));
        System.out.println("Status: " + (this.statusCarga != null ? this.statusCarga.getDescricao() : "Não definido"));
        System.out.println("Peso: " + this.peso + " kg");
        System.out.println("Distância: " + this.distancia);
        System.out.println("Custo de Transporte: R$ " + String.format("%.2f", calcularCustoTransporte()));
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public TiposCargas getTiposCargas() {
        return tiposCargas;
    }

    public void setTiposCargas(TiposCargas tiposCargas) {
        this.tiposCargas = tiposCargas;
    }

    public StatusCarga getStatusCarga() {
        return statusCarga;
    }

    public void setStatusCarga(StatusCarga statusCarga) {
        this.statusCarga = statusCarga;
    }
}
