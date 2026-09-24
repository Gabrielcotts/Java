package Faculdade.AcademiaHerois.test;

import academiaHerois.cadastroHerois.Arqueiro;
import academiaHerois.cadastroHerois.Guerreiro;
import academiaHerois.cadastroHerois.Heroi;
import academiaHerois.cadastroHerois.Mago;
import academiaHerois.cadastroHerois.Missao;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Heroi[] herois = new Heroi[20];

        int quantidadeHerois = 0;

        int opcao;

        do {
            System.out.println();
            System.out.println("=================================");
            System.out.println(" ACADEMIA DE HEROIS DE ARCADIA");
            System.out.println("=================================");
            System.out.println("1. Cadastrar heroi");
            System.out.println("2. Listar herois");
            System.out.println("3. Buscar heroi pelo nome");
            System.out.println("4. Exibir estatisticas gerais");
            System.out.println("5. Cadastrar missao para heroi");
            System.out.println("6. Iniciar missao");
            System.out.println("7. Concluir missao");
            System.out.println("8. Exibir missao do heroi");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    if (quantidadeHerois >= 20) {
                        System.out.println("Limite de 20 herois atingido.");
                        break;
                    }

                    System.out.println();
                    System.out.println("=== CADASTRO DE HEROI ===");

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Nivel: ");
                    int nivel = scanner.nextInt();

                    System.out.print("Vida: ");
                    int vida = scanner.nextInt();

                    System.out.print("Mana: ");
                    int mana = scanner.nextInt();

                    System.out.println("1. Guerreiro");
                    System.out.println("2. Mago");
                    System.out.println("3. Arqueiro");
                    System.out.print("Escolha a classe: ");

                    int classe = scanner.nextInt();

                    Heroi novoHeroi = null;

                    if (classe == 1) {

                        System.out.print("Forca: ");
                        int forca = scanner.nextInt();

                        System.out.print("Resistencia: ");
                        int resistencia = scanner.nextInt();

                        System.out.print("Energia: ");
                        int energia = scanner.nextInt();

                        novoHeroi = new Guerreiro(
                                nome,
                                nivel,
                                vida,
                                mana,
                                forca,
                                resistencia,
                                energia
                        );

                    } else if (classe == 2) {

                        System.out.print("Poder Magico: ");
                        int poderMagico = scanner.nextInt();

                        System.out.print("Inteligencia: ");
                        int inteligencia = scanner.nextInt();

                        novoHeroi = new Mago(
                                nome,
                                nivel,
                                vida,
                                mana,
                                poderMagico,
                                inteligencia
                        );

                    } else if (classe == 3) {

                        System.out.print("Precisao: ");
                        int precisao = scanner.nextInt();

                        System.out.print("Agilidade: ");
                        int agilidade = scanner.nextInt();

                        System.out.print("Concentracao: ");
                        int concentracao = scanner.nextInt();

                        novoHeroi = new Arqueiro(
                                nome,
                                nivel,
                                vida,
                                mana,
                                precisao,
                                agilidade,
                                concentracao
                        );

                    } else {
                        System.out.println("Classe invalida.");
                    }

                    if (novoHeroi != null) {
                        herois[quantidadeHerois] = novoHeroi;
                        quantidadeHerois++;

                        System.out.println("Heroi cadastrado com sucesso.");
                    }

                    break;

                case 2:

                    System.out.println();
                    System.out.println("=== LISTA DE HEROIS ===");

                    if (quantidadeHerois == 0) {
                        System.out.println("Nenhum heroi cadastrado.");
                        break;
                    }

                    for (int i = 0; i < quantidadeHerois; i++) {
                        herois[i].exibirDados();
                        System.out.println("-------------------------");
                    }

                    break;

                case 3:

                    System.out.println();
                    System.out.print("Digite o nome do heroi: ");

                    String nomeBusca = scanner.nextLine();

                    Heroi heroiEncontrado = buscarHeroi(
                            herois,
                            quantidadeHerois,
                            nomeBusca
                    );

                    if (heroiEncontrado != null) {
                        System.out.println("Heroi encontrado:");
                        heroiEncontrado.exibirDados();
                    } else {
                        System.out.println("Heroi nao encontrado.");
                    }

                    break;

                case 4:

                    exibirEstatisticas(
                            herois,
                            quantidadeHerois
                    );

                    break;

                case 5:

                    System.out.println();
                    System.out.print("Nome do heroi: ");

                    String nomeHeroiMissao = scanner.nextLine();

                    Heroi heroiMissao = buscarHeroi(
                            herois,
                            quantidadeHerois,
                            nomeHeroiMissao
                    );

                    if (heroiMissao == null) {
                        System.out.println("Heroi nao encontrado.");
                        break;
                    }

                    if (heroiMissao.getMissao() != null) {
                        System.out.println("Esse heroi ja possui uma missao.");
                        break;
                    }

                    System.out.print("Nome da missao: ");
                    String nomeMissao = scanner.nextLine();

                    System.out.print("Dificuldade: ");
                    String dificuldade = scanner.nextLine();

                    System.out.print("Recompensa em ouro: ");
                    int recompensa = scanner.nextInt();
                    scanner.nextLine();

                    Missao missao = new Missao(
                            nomeMissao,
                            dificuldade,
                            recompensa
                    );

                    heroiMissao.participarMissao(missao);

                    break;

                case 6:

                    System.out.print("Nome do heroi: ");
                    String nomeInicio = scanner.nextLine();

                    Heroi heroiInicio = buscarHeroi(
                            herois,
                            quantidadeHerois,
                            nomeInicio
                    );

                    if (heroiInicio == null) {
                        System.out.println("Heroi nao encontrado.");
                    } else if (heroiInicio.getMissao() == null) {
                        System.out.println("Esse heroi nao possui uma missao.");
                    } else {
                        heroiInicio.getMissao().iniciarMissao();
                    }

                    break;

                case 7:

                    System.out.print("Nome do heroi: ");
                    String nomeConclusao = scanner.nextLine();

                    Heroi heroiConclusao = buscarHeroi(
                            herois,
                            quantidadeHerois,
                            nomeConclusao
                    );

                    if (heroiConclusao == null) {
                        System.out.println("Heroi nao encontrado.");
                    } else if (heroiConclusao.getMissao() == null) {
                        System.out.println("Esse heroi nao possui uma missao.");
                    } else {
                        heroiConclusao.getMissao().concluirMissao();
                    }

                    break;

                case 8:

                    System.out.print("Nome do heroi: ");
                    String nomeConsulta = scanner.nextLine();

                    Heroi heroiConsulta = buscarHeroi(
                            herois,
                            quantidadeHerois,
                            nomeConsulta
                    );

                    if (heroiConsulta == null) {
                        System.out.println("Heroi nao encontrado.");
                    } else {
                        heroiConsulta.exibirMissao();
                    }

                    break;

                case 0:

                    System.out.println("Encerrando sistema...");

                    break;

                default:

                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    public static Heroi buscarHeroi(
            Heroi[] herois,
            int quantidadeHerois,
            String nome
    ) {

        for (int i = 0; i < quantidadeHerois; i++) {

            if (herois[i].getNome().equalsIgnoreCase(nome)) {
                return herois[i];
            }
        }

        return null;
    }

    public static void exibirEstatisticas(
            Heroi[] herois,
            int quantidadeHerois
    ) {

        System.out.println();
        System.out.println("========= RELATORIO =========");

        if (quantidadeHerois == 0) {
            System.out.println("Nenhum heroi cadastrado.");
            return;
        }

        int quantidadeGuerreiros = 0;
        int quantidadeMagos = 0;
        int quantidadeArqueiros = 0;

        int somaNiveis = 0;

        Heroi heroiMaisForte = herois[0];

        int missoesConcluidas = 0;

        for (int i = 0; i < quantidadeHerois; i++) {

            Heroi heroi = herois[i];

            somaNiveis += heroi.getNivel();

            if (heroi instanceof Guerreiro) {
                quantidadeGuerreiros++;
            } else if (heroi instanceof Mago) {
                quantidadeMagos++;
            } else if (heroi instanceof Arqueiro) {
                quantidadeArqueiros++;
            }

            if (heroi.calcularPoder() >
                    heroiMaisForte.calcularPoder()) {

                heroiMaisForte = heroi;
            }

            if (heroi.getMissao() != null &&
                    heroi.getMissao().isConcluida()) {

                missoesConcluidas++;
            }
        }

        double mediaNivel =
                (double) somaNiveis / quantidadeHerois;

        System.out.println(
                "Total de Herois: " + quantidadeHerois
        );

        System.out.println(
                "Quantidade de Guerreiros: " +
                        quantidadeGuerreiros
        );

        System.out.println(
                "Quantidade de Magos: " +
                        quantidadeMagos
        );

        System.out.println(
                "Quantidade de Arqueiros: " +
                        quantidadeArqueiros
        );

        System.out.println(
                "Media de nivel: " +
                        mediaNivel
        );

        System.out.println(
                "Heroi mais forte: " +
                        heroiMaisForte.getNome()
        );

        System.out.println(
                "Missoes concluidas: " +
                        missoesConcluidas
        );
    }
}