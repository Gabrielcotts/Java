package Faculdade.test;

import Faculdade.dominio.Aluno;
import Faculdade.dominio.Professor;

import java.util.Scanner;

public class Instituicao {
    public static void main(String[] args) {

        Professor professor = new Professor();
        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do professor: ");
        professor.setNome(sc.nextLine());

        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(sc.nextLine());

        System.out.println();
        System.out.println("----- Dados do professor e do aluno -----");
        System.out.println("O nome do professor: " + professor.getNome());
        System.out.println("O nome do aluno: " + aluno.getNome());

        sc.close();
    }
}