package DevDojo.JavaCore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    // private -> defaullt -> protected -> public
    @Override
    public void carregar() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe DatabaseLoader");
    }
}
