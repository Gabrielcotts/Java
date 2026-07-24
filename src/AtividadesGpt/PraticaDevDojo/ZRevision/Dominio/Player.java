package AtividadesGpt.PraticaDevDojo.ZRevision.dominio;

public class Player {
    private String nome;
    public int numeracao;

    public Player(String nome) {
        this.nome = nome;
    }
    public Player(){}

    public boolean validarNome(){
        return this.nome != null && !this.nome.isEmpty();
    }


    public void imprimeDados(){

        if (!validarNome()){
            System.out.println("Nome inválido!");
            return;
        }
        for (Object o : this.numeracao.le) {
            
        }
        System.out.println(( this.numeracao + 1) + " jogador - "  + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
