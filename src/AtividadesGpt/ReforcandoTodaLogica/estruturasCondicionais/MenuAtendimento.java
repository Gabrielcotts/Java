package AtividadesGpt.ReforcandoTodaLogica.estruturasCondicionais;

public class MenuAtendimento {
    public static void main(String[] args) {


        int opcaoMenu = 5;
        double saldoInicial = 1000.0;
        double valorOperacao = 250.0;
        double saldoAtual;

        switch (opcaoMenu) {
            case 1:
                System.out.println("Saldo atual disponível para consulta!");
                System.out.println("Saldo: " + saldoInicial);
                break;

            case 2:
                saldoAtual = saldoInicial + valorOperacao;

                System.out.println("--- BANCO JAVA ---");
                System.out.println("Operação: Depósito");
                System.out.println("Valor depositado: " + valorOperacao);
                System.out.println("Novo saldo: " + saldoAtual);
                break;

            case 3:
                saldoAtual = saldoInicial - valorOperacao;

                System.out.println("--- BANCO JAVA ---");
                System.out.println("Operação: Saque");
                System.out.println("Valor sacado: " + valorOperacao);
                System.out.println("Novo saldo: " + saldoAtual);
                break;

            case 4:
                System.out.println("Transferindo para um de nossos especialistas...");
                break;

            default:
                System.out.println("Opção inválida! Por favor, escolha um número de 1 a 4.");
                break;


        }

    }
}
