package DevDojo.JavaCore.Minterfaces.test;

import DevDojo.JavaCore.Minterfaces.dominio.DatabaseLoader;
import DevDojo.JavaCore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.carregar();
        fileLoader.carregar();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
