package AtividadesGpt.PraticaDevDojo.PraticaHeranca.dominio;

public class Conta {
    protected int numero;
    protected double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public final void imprimirSaldo(){
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: R$ " + this.saldo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
