package DevDojo.JavaCore.Minterfaces.dominio;

public class CarregadorBanco_de_Dados implements CarregadorDados{
    @Override
    public void carregar() {
        System.out.println("Carregando dados do banco de dados");
    }
}
