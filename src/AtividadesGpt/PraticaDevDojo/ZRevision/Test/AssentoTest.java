package AtividadesGpt.PraticaDevDojo.ZRevision.test;

import AtividadesGpt.PraticaDevDojo.ZRevision.dominio.Assento;

import java.util.Scanner;

public class AssentoTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Assento[] assentos = new Assento[20];


        for (int i = 0; i < assentos.length; i++) {
            assentos[i] = new Assento(i + 1);
        }

        while (true) {

            System.out.println("\n------ MENU ------");
            System.out.println("1 - Reservar assento");
            System.out.println("2 - Listar todos os assentos");
            System.out.println("3 - Mostrar assentos ocupados");
            System.out.println("4 - Mostrar assentos disponíveis");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Programa encerrado!");
                break;
            }

            switch (opcao) {

                case 1:

                    System.out.print("Digite o número do assento (1 a 20): ");
                    int numero = scanner.nextInt();

                    boolean encontrado = false;

                    for (Assento assento : assentos) {

                        if (assento.getNumero() == numero) {
                            assento.ocupar();
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Assento inexistente!");
                    }

                    break;

                case 2:

                    for (Assento assento : assentos) {
                        assento.imprimeDados();
                    }

                    break;

                case 3:

                    System.out.println("Assentos ocupados:");

                    for (Assento assento : assentos) {
                        if (assento.isOcupado()) {
                            assento.imprimeDados();
                        }
                    }

                    break;

                case 4:

                    System.out.println("Assentos disponíveis:");

                    for (Assento assento : assentos) {
                        if (!assento.isOcupado()) {
                            assento.imprimeDados();
                        }
                    }

                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        }

        scanner.close();
    }
}