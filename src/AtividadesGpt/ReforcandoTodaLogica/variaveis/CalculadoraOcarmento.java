package AtividadesGpt.ReforcandoTodaLogica.variaveis;

public class CalculadoraOcarmento {
    public static void main(String[] args) {
        String nome = "Gabriel Cotts dos Anjos";
        double salarioRecebido = 1000.00;
        double gastosTotais = 920.50;
        double porcentagemGasta = (gastosTotais / salarioRecebido) * 100;
        boolean poupancaSaudavel = porcentagemGasta <= 70;

        System.out.println("--- RELATÓRIO FINANCEIRO ---");
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salarioRecebido);
        System.out.println("Gastos: " + gastosTotais);
        System.out.println("Comprometimento de renda: " + porcentagemGasta + "%");
        System.out.println("Poupança Saudável: " + poupancaSaudavel);
    }
}
