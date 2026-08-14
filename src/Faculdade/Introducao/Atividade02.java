package Faculdade.Introducao;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        String s = "Hello World";

        Scanner sc = new Scanner(s);

        System.out.println(" " + sc.hasNext());

        System.out.println(" " + sc.nextLine());

        System.out.println(" " + sc.hasNextInt());

        sc.close();
    }
}