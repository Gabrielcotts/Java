package DevDojo.JavaCore.Minterfaces.test;

import DevDojo.JavaCore.Minterfaces.dominio.CarregadorArquivo;
import DevDojo.JavaCore.Minterfaces.dominio.CarregadorBanco_de_Dados;

public class CarregadorDadosTest01 {
    public static void main(String[] args) {
        CarregadorBanco_de_Dados carregadorDados = new CarregadorBanco_de_Dados();
        CarregadorArquivo carregadorArquivo = new CarregadorArquivo();
        carregadorDados.carregar();
        carregadorArquivo.carregar();
    }
}
