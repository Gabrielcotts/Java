package AtividadesGpt.PraticaDevDojo.PraticaEnum.dominio;

public enum NivelAlerta {
    INFORMATIVO(1,"Informativo"),
    ATENCAO(2, "ATENÇÃO!"),
    PERIGO(3, "PERIGO!"),
    CRITICO(4, "CRÍTICO!");

    private final int COD;
    private final String NOME_RELATORIO;

    NivelAlerta(int COD, String NOME_RELATORIO) {
        this.COD = COD;
        this.NOME_RELATORIO = NOME_RELATORIO;
    }

    public int getCOD() {
        return COD;
    }

    public String getNOME_RELATORIO() {
        return NOME_RELATORIO;
    }


    //precisei de ajuda da IA para esse método completo
    public static NivelAlerta buscarPorDescricao(String decricaoBusca){
        if (decricaoBusca == null){
            return null;
        }

        for (NivelAlerta nivelAlerta : NivelAlerta.values()) {
            if (nivelAlerta.getNOME_RELATORIO().equalsIgnoreCase(decricaoBusca)){
                return nivelAlerta;
            }
        }
        return null;
    }

}
