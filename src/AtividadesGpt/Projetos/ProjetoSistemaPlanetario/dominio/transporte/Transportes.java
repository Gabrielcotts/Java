package AtividadesGpt.Projetos.ProjetoSistemaPlanetario.dominio.transporte;

public abstract class Transportes {
    protected String nome;
    protected double velocidadeAtual;

    public Transportes(String nome) {
        this.nome = nome;
    }

    public abstract void acelerar(double incremento, String tipoPista);

    public abstract void mover();

    public String getNome() {
        return nome;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}
