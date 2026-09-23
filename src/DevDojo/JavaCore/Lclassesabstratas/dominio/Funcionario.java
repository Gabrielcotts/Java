package DevDojo.JavaCore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    /*Uma classe abstrata pode ter métodos concretos e abstratos,
    mas uma classe concreta só pode ter métodoso concretos
    e não pode possuir métodos abstratos*/

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    public abstract void calcularBonus();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void imprimirDados() {
        System.out.println("Imprimindo...");
    }
}
