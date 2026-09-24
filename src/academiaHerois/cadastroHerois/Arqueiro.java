package academiaHerois.cadastroHerois;

public class Arqueiro extends Heroi {
    private int precisao;
    private int agilidade;
    private int concentracao;

    public Arqueiro(String nome, int nivel, int vida, int mana,
                    int precisao, int agilidade, int concentracao) {

        super(nome, nivel, vida, mana, "Arqueiro");

        this.precisao = precisao;
        this.agilidade = agilidade;
        this.concentracao = concentracao;
    }

    public Arqueiro() {
        super();
    }

    @Override
    public void exibirDados() {
        System.out.println("=== ARQUEIRO ===");
        super.exibirDados();
        System.out.println("Precisao: " + precisao);
        System.out.println("Agilidade: " + agilidade);
        System.out.println("Concentracao: " + concentracao);
        System.out.println("Poder total: " + calcularPoder());
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " atacou com seu arco.");
    }

    @Override
    public int calcularPoder() {
        return getNivel() + precisao + agilidade + concentracao;
    }

    public int getPrecisao() {
        return precisao;
    }

    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getConcentracao() {
        return concentracao;
    }

    public void setConcentracao(int concentracao) {
        this.concentracao = concentracao;
    }
}