package Faculdade;

import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua primeira nota (0 a 10): ");
        nota1 = sc.nextDouble();

        System.out.println("Digite sua segunda nota (0 a 10): ");
        nota2 = sc.nextDouble();

        System.out.println("Digite sua terceira nota (0 a 10): ");
        nota3 = sc.nextDouble();

        if (nota1 > 10 || nota2 > 10 || nota3 > 10) {
            System.out.println("Nota não pode ser maior que 10!");
            return;
        }
        if (nota1 < 0 || nota2 < 0 || nota3 < 0){
            System.out.println("Nota não pode ser menor que zero!");
            return;
        }

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Nome: " + nome);
        System.out.printf("Média: %.2f%n", media);
        System.out.print("Situação: ");
        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 5) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }

        sc.close();
    }
}