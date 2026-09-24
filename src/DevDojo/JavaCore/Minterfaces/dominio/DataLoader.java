package DevDojo.JavaCore.Minterfaces.dominio;

public interface DataLoader {
    /*public static final*/ int MAX_DATA_SIZE = 10;

    /*public abstract*/ void carregar();

    /*public*/ default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }

     static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
