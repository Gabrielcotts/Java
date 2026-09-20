package AtividadesGpt.Projetos.ProjetoSistemaVeiculos.dominio;

public enum TipoCombustivel {
    GASOLINA(1, "Gasolina"),
    ETANOL(2, "Etanol"),
    DIESEL(3, "Diesel"),
    ELETRICO(4, "Elétrico"),
    FLEX(5, "Flex");

    private final int codigo;
    private final String nomeRelatorio;

    TipoCombustivel(int codigo, String nomeRelatorio) {
        this.codigo = codigo;
        this.nomeRelatorio = nomeRelatorio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
