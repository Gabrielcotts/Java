package AtividadesGpt.PraticaDevDojo.PraticaInterfaces.dominio;

import AtividadesGpt.PraticaDevDojo.PraticaAbstrata.dominio.Nave;

public class NaveMilitar extends Nave implements Acoplavel, GerenciadorEnergia {
    private int poderAtaque;

    public NaveMilitar(String nome, double capacidadeCarga, int poderAtaque) {
        super(nome, capacidadeCarga);
        this.poderAtaque = poderAtaque;
    }

    @Override
    public void realizarMissao() {
        System.out.println("A nave militar está patrulhando o perímetro com " + this.poderAtaque + " de poder de ataque.");
    }

    @Override
    public void acoplarNaEstacao() {
        System.out.println("A nave militar ativou as travas magnéticas de segurança.");
    }

    @Override
    public void recarregarEnergia() {
        System.out.println("Os escudos e reatores principais estão sendo reabastecidos.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
