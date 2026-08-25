package DevDojo.JavaCore.Gassociacao.ZSeminarios.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;


    public Seminario(String titulo, Local local){
        this.titulo = titulo;
         this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public Seminario(){}

    public void imprimeDadosSeminario(){
        System.out.println("Título: " + this.titulo);
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setAlunos(Aluno[] alunos){
        this.alunos = alunos;
    }
    public Aluno[] getAlunos(){
        return this.alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
