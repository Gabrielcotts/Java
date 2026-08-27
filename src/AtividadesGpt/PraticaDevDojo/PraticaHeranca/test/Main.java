package AtividadesGpt.PraticaDevDojo.PraticaHeranca.test;

import AtividadesGpt.PraticaDevDojo.PraticaHeranca.dominio.Funcionario;
import AtividadesGpt.PraticaDevDojo.PraticaHeranca.dominio.Gerente;

public class Main {
   public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();

        funcionario.setNome("Gabriel");
        funcionario.setIdade(21);
        funcionario.imprimeDados();

        System.out.println("---------");
        gerente.setNome("Gabriel");
        gerente.setIdade(21);
        gerente.setSetor("Gerente");
        gerente.imprimeDadosGerente();
    }
}
