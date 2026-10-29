package DevDojo.JavaCore.Npolimorfismo.dominio;

public class Televisao extends Produto{
    private final double IMPOSTO_TV = 0.18;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da televisao");
        return this.valor * IMPOSTO_TV;
    }
}
