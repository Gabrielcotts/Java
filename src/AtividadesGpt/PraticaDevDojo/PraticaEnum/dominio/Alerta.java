package AtividadesGpt.PraticaDevDojo.PraticaEnum.dominio;

public class Alerta {
    private final int COD_ALERTA;
    private String descricaoEvento;
    private NivelAlerta nivelAlerta;

    public Alerta(int COD_ALERTA, String descricaoEvento, NivelAlerta nivelAlerta) {
        this.COD_ALERTA = COD_ALERTA;
        this.descricaoEvento = descricaoEvento;
        this.nivelAlerta = nivelAlerta;
    }

    @Override
    public String toString() {
        return "Alerta{" +
                "COD_ALERTA=" + COD_ALERTA +
                ", descricaoEvento='" + descricaoEvento + '\'' +
                ", nivelAlerta=" + nivelAlerta +
                '}';
    }

    public int getCOD_ALERTA() {
        return COD_ALERTA;
    }

    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    public void setDescricaoEvento(String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }

    public NivelAlerta getNivelAlerta() {
        return nivelAlerta;
    }

    public void setNivelAlerta(NivelAlerta nivelAlerta) {
        this.nivelAlerta = nivelAlerta;
    }

}
