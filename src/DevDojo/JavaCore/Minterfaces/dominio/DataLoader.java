package DevDojo.JavaCore.Minterfaces.dominio;

public interface DataLoader {
    /*public abstract*/ void carregar();

    /*public*/ default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }
}
