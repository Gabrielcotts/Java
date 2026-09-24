package academiaHerois.cadastroHerois;

public class Guerreiro extends Heroi {
    private int forca;
    private int resistencia;
    private int energia;

    public Guerreiro(String nome, int nivel, int vida, int mana,
                     int forca, int resistencia, int energia) {

        super(nome, nivel, vida, mana, "Guerreiro");

        this.forca = forca;
        this.resistencia = resistencia;
        this.energia = energia;
    }

    public Guerreiro() {
        super();
    }

    @Override
    public void exibirDados() {
        System.out.println("=== GUERREIRO ===");
        super.exibirDados();
        System.out.println("Forca: " + forca);
        System.out.println("Resistencia: " + resistencia);
        System.out.println("Energia: " + energia);
        System.out.println("Poder total: " + calcularPoder());
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " atacou com sua espada.");
    }

    @Override
    public int calcularPoder() {
        return getNivel() + forca + resistencia + energia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}