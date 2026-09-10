package Faculdade.ClasseAbstrata_Interface.dominio;

public class Licenciatura extends Curso implements FormacaoProfissional {

    public Licenciatura(String nome, int codigo, int duracaoSemestres) {
        super(nome, codigo, duracaoSemestres);
    }

    @Override
    public double calcularMensalidade() {
        double valorBase = 900.00;
        return valorBase * 0.95;
    }

    @Override
    public void descreverFormacao() {
        System.out.println("Formação: Voltada principalmente para a docência.");
    }
}
