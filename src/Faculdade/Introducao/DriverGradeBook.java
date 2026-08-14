package Faculdade.Introducao;

 class DriverGraeBook {
    public static void main(String[] args) {
        GradeBook meuDiario = new GradeBook();

        String nomeDoCurso = "Engenharia de Software";
        meuDiario.displayMessage(nomeDoCurso);
    }
}

class GradeBook {
    public void displayMessage(String nomeCurso) {
        System.out.printf("Bem vindo ao Diario de Classe de %s%n", nomeCurso);
    }
}