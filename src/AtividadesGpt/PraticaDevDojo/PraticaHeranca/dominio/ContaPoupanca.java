package AtividadesGpt.PraticaDevDojo.PraticaHeranca.dominio;

public class ContaPoupanca extends Conta{
    private float taxaRendimento;

    public ContaPoupanca(int numero, double saldo, float taxaRendimento) {
        super(numero, saldo);
        this.taxaRendimento = taxaRendimento;
    }

//    @Override
//    public void imprimirSaldo() {
//    }

    public void imprimirDados(){
        super.imprimirSaldo();
        System.out.println("Taxa de rendimento: " + this.taxaRendimento + "%");
    }

    public float getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(float taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}
