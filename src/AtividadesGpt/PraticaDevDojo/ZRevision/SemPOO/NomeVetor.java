package AtividadesGpt.PraticaDevDojo.ZRevision.SemPOO;

import java.util.Scanner;

public class NomeVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[6];

        System.out.println("Digite seu nome: ");
//        for (int i = 0; i < nome.length; i++) {
//            System.out.print((i + 1) + "° - nome: ");
//
//            nome[i] = scanner.nextLine();
//        }
//        System.out.println();
//
//        System.out.println("--- Nomes ---");
//        for (String s : nome) {
//            System.out.println("Nome - " + s);
//        }

//        for (int i = 0; i < nome.length; i++) {
//            System.out.println((i + 1) + "° nome - " + nome[i]);
//        }

        for (int i = 0; i < nome.length; i++) {
            System.out.print((i + 1) + "° - nome: ");

            nome[i] = scanner.nextLine();
        }
        System.out.println();

        System.out.println("--- Nomes na ordem inversa ---");
        for (int i = nome.length - 1; i >= 0; i--) {
            System.out.println((i + 1) + "° nome - " + nome[i]);
        }




    }
}
