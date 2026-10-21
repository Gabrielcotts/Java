package DevDojo.JavaCore.Npolimorfismo.dominio;

public class Tomate extends Produto {
    private static final double IMPOSTO = 0.06;
    private String dataValidade;

    public Tomate(String nome, double valor){
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate.");
        return this.valor * IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }
}
