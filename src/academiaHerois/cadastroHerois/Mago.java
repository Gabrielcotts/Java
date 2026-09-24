package academiaHerois.cadastroHerois;

public class Mago extends Heroi {
    private int poderMagico;
    private int inteligencia;

    public Mago(String nome, int nivel, int vida, int mana,
                int poderMagico, int inteligencia) {

        super(nome, nivel, vida, mana, "Mago");

        this.poderMagico = poderMagico;
        this.inteligencia = inteligencia;
    }

    public Mago() {
        super();
    }

    @Override
    public void exibirDados() {
        System.out.println("=== MAGO ===");
        super.exibirDados();
        System.out.println("Poder Magico: " + poderMagico);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("Poder total: " + calcularPoder());
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " atacou com uma magia.");
    }

    @Override
    public int calcularPoder() {
        return getNivel() + poderMagico + inteligencia + getMana();
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
}