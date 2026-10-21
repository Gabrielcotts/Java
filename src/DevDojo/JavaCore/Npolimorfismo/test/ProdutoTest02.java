package DevDojo.JavaCore.Npolimorfismo.test;

import DevDojo.JavaCore.Npolimorfismo.dominio.Computador;
import DevDojo.JavaCore.Npolimorfismo.dominio.Produto;
import DevDojo.JavaCore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto01 = new Computador("Ryzen 9", 3000.00);
        System.out.println(produto01.getNome());
        System.out.println(produto01.getValor());
        System.out.println(produto01.calcularImposto());

        System.out.println("--------------------");

        Produto produto02 = new Tomate("Americano", 12.9);
        System.out.println(produto02.getNome());
        System.out.println(produto02.getValor());
        System.out.println(produto02.calcularImposto());

    }
}
