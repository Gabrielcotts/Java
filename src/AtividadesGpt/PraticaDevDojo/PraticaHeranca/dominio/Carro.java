package AtividadesGpt.PraticaDevDojo.PraticaHeranca.dominio;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, int numeroPortas) {
        super(marca, modelo);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Número de portas: " + this.numeroPortas);
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
