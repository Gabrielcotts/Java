package Faculdade.ClasseAbstrata_Interface.dominio;

public class Bacharelado extends Curso implements FormacaoProfissional {

    public Bacharelado(String nome, int codigo, int duracaoSemestres) {
        super(nome, codigo, duracaoSemestres);
    }

    @Override
    public double calcularMensalidade() {
        double valorBase = 1200.00;
        if (getDuracaoSemestres() > 8) {
            return valorBase * 1.10;
        }
        return valorBase;
    }

    @Override
    public void descreverFormacao() {
        System.out.println("Formação: Ampla em determinada área do conhecimento.");
    }
}