package AtividadesGpt.PraticaDevDojo.PraticaHeranca.test;

import AtividadesGpt.PraticaDevDojo.PraticaHeranca.dominio.ContaPoupanca;

public class ContaPoupancaTest {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(5886401, 516.74, 5);
        contaPoupanca.imprimirSaldo();
        System.out.println("--------------");
        contaPoupanca.imprimirDados();
    }
}
