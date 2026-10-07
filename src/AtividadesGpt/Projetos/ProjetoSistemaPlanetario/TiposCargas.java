package AtividadesGpt.Projetos.ProjetoSistemaPlanetario;

public enum TiposCargas {
    COMUM(2, "Carga comum"),
    PERIGOSA(2, "Carga perigosa"),
    REFRIGERADA(3, "Carga refrigerada");

    private final int CODIGO_TIPO_CARGA;
    private final String NOME_CARGA;

    TiposCargas(int CODIGO_TIPO_CARGA, String NOME_CARGA ) {
        this.CODIGO_TIPO_CARGA = CODIGO_TIPO_CARGA;
        this.NOME_CARGA = NOME_CARGA;
    }

    public int getCODIGO_TIPO_CARGA() {
        return CODIGO_TIPO_CARGA;
    }

    public String getNOME_CARGA() {
        return NOME_CARGA;
    }
}

