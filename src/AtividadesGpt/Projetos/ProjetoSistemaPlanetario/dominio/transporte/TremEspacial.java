package AtividadesGpt.Projetos.ProjetoSistemaPlanetario.dominio.transporte;

public class TremEspacial extends Transportes {

    private final double VELOCIDADE_LIMITE_TRILHO_PRINCIPAL;
    private final double VELOCIDADE_LIMITE_TRECHO_SERRA;

    public TremEspacial(String nome) {
        super(nome);
        this.VELOCIDADE_LIMITE_TRILHO_PRINCIPAL = 80;
        this.VELOCIDADE_LIMITE_TRECHO_SERRA = 40;
    }

    @Override
    public void acelerar(double incremento, String tipoPista) {
        double limiteAtual = tipoPista.equalsIgnoreCase("trilho principal") ? VELOCIDADE_LIMITE_TRILHO_PRINCIPAL : VELOCIDADE_LIMITE_TRECHO_SERRA;

        if (getVelocidadeAtual() + incremento <= limiteAtual) {
            setVelocidadeAtual(getVelocidadeAtual() + incremento);
        } else {
            setVelocidadeAtual(limiteAtual);
            System.out.println("Velocidade máxima de " + limiteAtual + "km/h atingida na " + tipoPista);
        }
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está transportando carga.");
    }
}
