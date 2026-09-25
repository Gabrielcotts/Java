package academiaHerois.cadastroHerois;

public abstract class Heroi {
    private String nome;
    private int nivel;
    private int vida;
    private int mana;
    private String classe;
    private Missao missao;

    public Heroi(String nome, int nivel, int vida, int mana, String classe) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.mana = mana;
        this.classe = classe;
    }

    public Heroi() {
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Mana: " + mana);
        System.out.println("Classe: " + classe);
    }

    public void atacar() {
        System.out.println(nome + " realizou um ataque.");
    }

    public void atacar(int dano) {
        System.out.println(nome + " realizou um ataque de " + dano + " de dano.");
    }

    // Cada classe de herói terá sua própria forma de calcular o poder.
    public abstract int calcularPoder();

    public void participarMissao(Missao missao) {
        if (this.missao == null) {
            this.missao = missao;
            System.out.println(nome + " foi cadastrado na missão.");
        } else {
            System.out.println(nome + " já possui uma missão.");
        }
    }

    public void exibirMissao() {
        if (missao != null) {
            System.out.println("Missão: " + missao.getNomeMissao());
            System.out.println("Dificuldade: " + missao.getDificuldade());
            System.out.println("Recompensa: " + missao.getRecompensaOuro() + " ouro");
            System.out.println("Concluida: " + missao.isConcluida());
        } else {
            System.out.println(nome + " não possui uma missão.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getClasse() {
        return classe;
    }

    public Missao getMissao() {
        return missao;
    }
}