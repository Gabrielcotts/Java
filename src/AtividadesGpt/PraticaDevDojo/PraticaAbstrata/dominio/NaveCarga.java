package AtividadesGpt.PraticaDevDojo.PraticaAbstrata.dominio;

public class NaveCarga extends Nave {
    private String tipoCombustivel;

    public NaveCarga(String nome, double capacidadeCarga, String tipoCombustivel) {
        super(nome, capacidadeCarga);
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void realizarMissao() {
        System.out.println("A nave de carga está transportando suprimentos usando o combustível " + this.tipoCombustivel + ".");
    }

    @Override
    public String toString() {
        return super.toString(); /*+ " | Tipo de combustível: " + this.tipoCombustivel;*/
    }
}
