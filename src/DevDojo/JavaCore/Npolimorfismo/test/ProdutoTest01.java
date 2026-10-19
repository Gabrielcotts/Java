package DevDojo.JavaCore.Npolimorfismo.test;

import DevDojo.JavaCore.Npolimorfismo.dominio.Computador;
import DevDojo.JavaCore.Npolimorfismo.dominio.Tomate;
import DevDojo.JavaCore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
   public static void main(String[] args) {
       Computador computador = new Computador("G15", 5400);
       Tomate tomate = new Tomate("Italiano", 14);

       CalculadoraImposto.calcularImpostoComputador(computador);
       System.out.println("-------------");
       CalculadoraImposto.calcularImpostoTomate(tomate);

    }
}
