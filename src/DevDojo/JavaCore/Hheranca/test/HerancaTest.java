package DevDojo.JavaCore.Hheranca.test;

import DevDojo.JavaCore.Hheranca.dominio.Endereco;
import DevDojo.JavaCore.Hheranca.dominio.Funcionario;
import DevDojo.JavaCore.Hheranca.dominio.Pessoa;

public class HerancaTest {
    static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua pacheco");
        endereco.setCep("170349-054");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Nathaly");
        pessoa.setCpf("991.184.174-12");

        pessoa.setEndereco(endereco);
        pessoa.imprimeDados();
        System.out.println("-----------");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Gabriel");
        funcionario.setCpf("132.187.525-21");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1080.52);
        funcionario.imprimeDados();
    }
}
