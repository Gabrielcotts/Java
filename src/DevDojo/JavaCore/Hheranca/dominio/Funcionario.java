package DevDojo.JavaCore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome){
        super(nome);
    }

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    /*
        Exemplo 01
         public void imprimeDados(){
            System.out.println(this.salario);
         }

        Exemplo 02
            public void imprimeDados2(){
            System.out.println(this.salario);
        }
     */
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome);
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
