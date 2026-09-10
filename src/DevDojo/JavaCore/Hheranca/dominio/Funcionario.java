package DevDojo.JavaCore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionário");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionário 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de Funcionário 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de Funcionário");
    }

//    public Funcionario(String nome, String cpf) {
//        super(nome, cpf);
//    }

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
