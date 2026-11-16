package AtividadesGpt.ReforcandoTodaLogica.estruturasCondicionais;

public class CalculadoraImposto {
    public static void main(String[] args) {
        // salário
        double salario = 1621.00;
        int totalMesesAno = 12;
        double salarioAnual = salario * totalMesesAno;

        // impostos
        double imposto;

        if (salarioAnual >= 0 && salarioAnual <= 34712) {
            imposto = 0.097;
        } else if (salarioAnual > 34712 && salarioAnual <= 68507) {
            imposto = 0.3735;
        } else {
            imposto = 0.4950;
        }

        // desconto do imposto sobre o salário anual
        double descontoImposto = salarioAnual * imposto;

        //Isenção
        String statusIsencao = (imposto == 0.097) ? "Isento de taxa alta" : "Taxação elevada";

        System.out.println("--- RELATÓRIO ---");
        System.out.println("Salário anual " + salarioAnual);
        System.out.println("Valor do imposto " + descontoImposto);
        System.out.println("Status do Contribuinte: " + statusIsencao);
    }
}
