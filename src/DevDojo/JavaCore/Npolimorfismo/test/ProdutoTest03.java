package DevDojo.JavaCore.Npolimorfismo.test;

import DevDojo.JavaCore.Npolimorfismo.dominio.Computador;
import DevDojo.JavaCore.Npolimorfismo.dominio.Produto;
import DevDojo.JavaCore.Npolimorfismo.dominio.Tomate;
import DevDojo.JavaCore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto computador = new Computador("Ryzen 9", 3000.00);

        Tomate tomate = new Tomate("Americano", 12.9);
        tomate.setDataValidade("11/11/2026");

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------");
        CalculadoraImposto.calcularImposto(tomate);

    }
}
