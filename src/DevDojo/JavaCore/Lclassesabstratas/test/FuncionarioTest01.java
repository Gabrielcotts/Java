package DevDojo.JavaCore.Lclassesabstratas.test;

import DevDojo.JavaCore.Lclassesabstratas.dominio.Desenvolvedor;
import DevDojo.JavaCore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Freia" , 5000.00 );
        Desenvolvedor desenvolvedor = new Desenvolvedor("Aroldo", 12000.00);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprimirDados();
        desenvolvedor.imprimirDados();
    }
}
