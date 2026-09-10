package Faculdade.ClasseAbstrata_Interface.dominio;

public abstract class Curso {
    private String nome;
    private int codigo;
    private int duracaoSemestres;

    public Curso(String nome, int codigo, int duracaoSemestres) {
        this.nome = nome;
        this.codigo = codigo;
        this.duracaoSemestres = duracaoSemestres;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getDuracaoSemestres() {
        return duracaoSemestres;
    }

    // Método concreto
    public void exibirInformacoes() {
        System.out.println("Código: " + codigo + " | Curso: " + nome + " | Duração: " + duracaoSemestres + " semestres");
    }

    // Método abstrato (será implementado pelas subclasses)
    public abstract double calcularMensalidade();
}
