package DevDojo.JavaCore.JmodificadorFinal.dominio;

//public final class Carro {
public class Carro {
    private String nome;
    public final Comprador COMPRADOR = new Comprador();

//    public static final double VELOCIDADE_LIMITE = 250;

//    public final double VELOCIDADE_LIMITE;
//    {
//        VELOCIDADE_LIMITE = 250;
//    }

//    // outro método
//    public final double VELOCIDADE_LIMITE;
//    public Carro() {
//        VELOCIDADE_LIMITE = 250;
//    }

    public static final double VELOCIDADE_LIMITE;
    static {
        VELOCIDADE_LIMITE = 250;
    }

    public final void imprimeDados(){
        System.out.println("Nome: " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
