package Faculdade.ClasseAbstrata_Interface.dominio;

public class CursoTecnologo extends Curso implements FormacaoProfissional {

    public CursoTecnologo(String nome, int codigo, int duracaoSemestres) {
        super(nome, codigo, duracaoSemestres);
    }

    @Override
    public double calcularMensalidade() {
        return 800.00;
    }

    @Override
    public void descreverFormacao() {
        System.out.println("Formação: Mais curta e voltada ao mercado de trabalho.");
    }
}
