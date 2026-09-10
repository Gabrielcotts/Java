package Faculdade.ClasseAbstrata_Interface.test;

import Faculdade.ClasseAbstrata_Interface.dominio.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Armazenando os objetos em um ArrayList
        ArrayList<Curso> listaDeCursos = new ArrayList<>();

        // Criando um objeto de cada tipo
        listaDeCursos.add(new CursoTecnologo("Análise e Desenvolvimento de Sistemas", 101, 5));
        listaDeCursos.add(new Bacharelado("Engenharia de Software", 102, 10));
        listaDeCursos.add(new Licenciatura("Letras - Português", 103, 8));

        System.out.println("=== SISTEMA DE CURSOS SUPERIORES ===\n");

        // Percorrendo a lista utilizando um for (enhanced for loop)
        for (Curso curso : listaDeCursos) {
            // Exibindo as informações básicas
            curso.exibirInformacoes();

            // Exibindo a mensalidade formatada com duas casas decimais
            System.out.printf("Mensalidade: R$ %.2f\n", curso.calcularMensalidade());

            // Verificando se o curso implementa a interface e chamando o método
            if (curso instanceof FormacaoProfissional) {
                ((FormacaoProfissional) curso).descreverFormacao();
            }

            System.out.println("--------------------------------------------------");
        }
    }
}