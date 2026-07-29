package AtividadesGpt.PraticaDevDojo.ZRevision.dominio;

public class Assento {
    private int numero;
    private boolean ocupado;

    public Assento(int numero) {
        this.numero = numero;
        this.ocupado = false;
    }

    public Assento() {
    }

    public void ocupar() {
        if (this.ocupado) {
            System.out.println("Assento " + this.numero + " já está ocupado!");
            return;
        }

        this.ocupado = true;
        System.out.println("Assento " + this.numero + " ocupado com sucesso!");
    }

    public void liberar() {
        if (!this.ocupado) {
            System.out.println("Assento " + this.numero + " já está livre!");
            return;
        }

        this.ocupado = false;
        System.out.println("Assento " + this.numero + " liberado com sucesso!");
    }

    public void imprimeDados() {
        System.out.println("Assento " + this.numero + " - " + (this.ocupado ? "Ocupado" : "Disponível"));
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}