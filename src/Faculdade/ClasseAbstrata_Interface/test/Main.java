package Faculdade.ClasseAbstrata_Interface.test;

import Faculdade.ClasseAbstrata_Interface.dominio.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Curso> listaDeCursos = new ArrayList<>();

        listaDeCursos.add(new CursoTecnologo("Análise e Desenvolvimento de Sistemas", 101, 5));
        listaDeCursos.add(new Bacharelado("Engenharia de Software", 102, 10));
        listaDeCursos.add(new Licenciatura("Letras - Português", 103, 8));

        System.out.println("=== SISTEMA DE CURSOS SUPERIORES ===\n");

        for (Curso curso : listaDeCursos) {
            curso.exibirInformacoes();
            System.out.printf("Mensalidade: R$ %.2f\n", curso.calcularMensalidade());

            if (curso instanceof FormacaoProfissional) {
                ((FormacaoProfissional) curso).descreverFormacao();
            }
            System.out.println("--------------------------------------------------");
        }
    }
}