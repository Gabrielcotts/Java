package Faculdade.GestaoVeiculos.dominio;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    public Veiculo(String marca, String modelo, int ano, double velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano);

        if (velocidadeAtual < 0) {
            throw new IllegalArgumentException("A velocidade não pode ser negativa.");
        }

        this.velocidadeAtual = velocidadeAtual;
    }

    public Veiculo() {
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", velocidadeAtual=" + velocidadeAtual +
                '}';
    }

    public void acelerar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor da aceleração não pode ser negativo.");
        }

        velocidadeAtual += valor;
    }

    public void acelerar() {
        acelerar(10);
    }

    public void acelerar(double valor, int repeticoes) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor da aceleração não pode ser negativo.");
        }

        if (repeticoes < 0) {
            throw new IllegalArgumentException("O número de repetições não pode ser negativo.");
        }

        for (int i = 0; i < repeticoes; i++) {
            acelerar(valor);
        }
    }

    public void frear(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor da frenagem não pode ser negativo.");
        }

        velocidadeAtual -= valor;

        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

    public boolean validarVelocidade() {
        return velocidadeAtual >= 0;
    }

    public void imprimirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidadeAtual + " km/h");
    }

    public abstract void realizarManutencao();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano >= 1886) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano inválido.");
        }
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
}