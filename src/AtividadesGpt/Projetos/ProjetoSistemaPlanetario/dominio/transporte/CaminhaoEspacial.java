package AtividadesGpt.Projetos.ProjetoSistemaPlanetario.dominio.transporte;

public class CaminhaoEspacial extends Transportes {

    private final double VELOCIDADE_LIMITE_RODOVIA;
    private final double VELOCIDADE_LIMITE_ESTRADA_TERRA;

    public CaminhaoEspacial(String nome) {
        super(nome);
        this.VELOCIDADE_LIMITE_RODOVIA = 90;
        this.VELOCIDADE_LIMITE_ESTRADA_TERRA = 60;
    }

    @Override
    public void acelerar(double incremento, String tipoPista) {
        double limiteAtual = tipoPista.equalsIgnoreCase("rodovia") ? VELOCIDADE_LIMITE_RODOVIA : VELOCIDADE_LIMITE_ESTRADA_TERRA;

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
