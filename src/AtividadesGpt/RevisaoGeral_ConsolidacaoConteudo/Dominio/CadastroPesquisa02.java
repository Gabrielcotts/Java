package AtividadesGpt.RevisaoGeral_ConsolidacaoConteudo.Dominio;

public class CadastroPesquisa02 {
    public double[] numeros = new double[10];

    public CadastroPesquisa02(double[] numeros) {
        this.numeros = numeros;
    }
    public CadastroPesquisa02(){}





    public double[] getNumeros() {
        return numeros;
    }

    public void setNumeros(double[] numeros) {
        this.numeros = numeros;
    }
}
