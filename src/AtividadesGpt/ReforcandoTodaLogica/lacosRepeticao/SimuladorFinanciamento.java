package AtividadesGpt.ReforcandoTodaLogica.lacosRepeticao;

public class SimuladorFinanciamento {
    public static void main(String[] args) {

        double valorTotal = 10000.0;

        double parcelas;
        int quantidadeParcelas = 12;

        System.out.println("--- OPÇÕES DE FINANCIAMENTO ---");
        for (int i = 1; i <= quantidadeParcelas; i++) {
            parcelas = valorTotal / i;

            if (parcelas < 1000) {
                System.out.println("Parcela deve ser maior que mil!");
                break;
            }

            System.out.println(i + "x de R$ " + parcelas);
        }

    }
}
