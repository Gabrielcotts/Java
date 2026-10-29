package DevDojo.JavaCore.Npolimorfismo.servico;

import DevDojo.JavaCore.Npolimorfismo.dominio.Computador;
import DevDojo.JavaCore.Npolimorfismo.dominio.Produto;
import DevDojo.JavaCore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
//    public static void calcularImpostoComputador(Computador computador) {
//        System.out.println("Relatório de imposto do computador");
//        double imposto = computador.calcularImposto();
//        System.out.println("Computador " + computador.getNome());
//        System.out.println("Valor " + computador.getValor());
//        System.out.println("Imposto a ser pago " + imposto);
//    }
//
//    public static void calcularImpostoTomate(Tomate tomate) {
//        System.out.println("Relatório de imposto do computador");
//        double imposto = tomate.calcularImposto();
//        System.out.println("Tomate " + tomate.getNome());
//        System.out.println("Valor " + tomate.getValor() + " kg");
//        System.out.println("Imposto a ser pago " + imposto);
//    }

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório imposto");
        double imposto = produto.calcularImposto();

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto: " + imposto);
    }
}
