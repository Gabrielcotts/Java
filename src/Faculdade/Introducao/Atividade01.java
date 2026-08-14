package Faculdade.Introducao;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, soma;

        System.out.println("Digite um numero inteiro: ");
        num1 = sc.nextInt();


        System.out.println("Digite outro numero inteiro: ");
        num2 = sc.nextInt();

        soma = num1 + num2;
        System.out.println("Resultado: " + soma);

        sc.close();

    }
}