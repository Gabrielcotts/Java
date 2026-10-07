package AtividadesGpt.Projetos.ProjetoSistemaPlanetario;

public abstract class Cargas {
    private int codigo;
    private String nome;
    private double peso;
    private double distancia;

    public Cargas(int codigo, String nome, double peso, double distancia) {
        this.codigo = codigo;
        this.nome = nome;
        this.peso = peso;
        this.distancia = distancia;
    }

    public abstract double calcularCustoTransporte();

    public void imprimeDados(){
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Peso: " + this.peso);
        System.out.println("Distância: " + this.distancia);
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
}
