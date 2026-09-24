package academiaHerois.cadastroHerois;

public class Missao {
    private String nomeMissao;
    private String dificuldade;
    private int recompensaOuro;
    private boolean iniciada;
    private boolean concluida;

    public Missao(String nomeMissao, String dificuldade, int recompensaOuro) {
        this.nomeMissao = nomeMissao;
        this.dificuldade = dificuldade;
        this.recompensaOuro = recompensaOuro;
        this.iniciada = false;
        this.concluida = false;
    }

    public Missao() {
    }

    public void iniciarMissao() {
        if (concluida) {
            System.out.println("Essa missão já foi concluida.");
            return;
        }

        if (!iniciada) {
            iniciada = true;
            System.out.println("Missão iniciada: " + nomeMissao);
        } else {
            System.out.println("Essa missão já foi iniciada.");
        }
    }

    public void concluirMissao() {
        if (!iniciada) {
            System.out.println("A missão ainda não foi iniciada.");
            return;
        }

        if (!concluida) {
            concluida = true;
            System.out.println("Missão concluida!");
            System.out.println("Recompensa: " + recompensaOuro + " ouro");
        } else {
            System.out.println("Essa missão já foi concluida.");
        }
    }

    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getRecompensaOuro() {
        return recompensaOuro;
    }

    public void setRecompensaOuro(int recompensaOuro) {
        this.recompensaOuro = recompensaOuro;
    }

    public boolean isIniciada() {
        return iniciada;
    }

    public boolean isConcluida() {
        return concluida;
    }
}