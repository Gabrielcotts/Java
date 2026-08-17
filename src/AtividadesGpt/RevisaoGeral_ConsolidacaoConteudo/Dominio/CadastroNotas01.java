package AtividadesGpt.RevisaoGeral_ConsolidacaoConteudo.Dominio;

public class CadastroNotas01 {
    private String nomeAluno;
    private double[] notas;

    public CadastroNotas01(String nomeAluno, double[] nota) {
        this.nomeAluno = nomeAluno;
        this.notas = nota;
    }

    public CadastroNotas01() {
    }

    public boolean validarNota() {
        if (this.notas == null || this.notas.length == 0) {
            return false;
        }
        for (double n : notas) {
            if (n < 0 || n > 10) {
                return false;
            }
        }
        return true;
    }

    public double notaMedia() {
        double media = 0;

        for (double m : notas) {
            media += m;
        }
        media /= notas.length;
        return media;
    }

    public double maiorNota() {
        double maior = this.notas[0];

        for (double m : notas) {
            if (m > maior) {
                maior = m;
            }
        }
        return maior;
    }

    public double menorNota() {
        double menor = notas[0];

        for (double m : notas) {
            if (m < menor) {
                menor = m;
            }
        }
        return menor;
    }

    public void verificarSituacao() {
        double media = this.notaMedia();

          if (media >= 7) {
            System.out.println("O aluno " + this.nomeAluno + " está aprovado!");
        } else if (media >= 5) {
            System.out.println("O aluno " + this.nomeAluno + " está de recuperação!");
        } else {
            System.out.println("O aluno " + this.nomeAluno + " está reprovado!");
        }
    }

    public void imprimeDados() {
        if (!validarNota()) {
            System.out.println("Nota inválida!");
            return;
        }

        System.out.println("---- DADOS DO ALUNO ----");

        System.out.println("Nome do aluno - " + this.nomeAluno);
        System.out.println("Maior nota - " + maiorNota());
        System.out.println("Menor nota - " + menorNota());
        System.out.println("Nota média - " + notaMedia());

        System.out.println("---- SITUAÇÃO ACADÊMICA ----\n");
        verificarSituacao();
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double[] getNota() {
        return notas;
    }

    public void setNota(double[] nota) {
        this.notas = nota;
    }
}
