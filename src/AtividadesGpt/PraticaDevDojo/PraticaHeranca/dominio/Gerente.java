package AtividadesGpt.PraticaDevDojo.PraticaHeranca.dominio;

public class Gerente extends Funcionario{
    private String setor;

    public void imprimeDadosGerente(){
//        super.imprimeDados();
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Setor: " + this.setor);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
