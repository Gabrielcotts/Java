package AtividadesGpt.PraticaDevDojo.PraticaAssociacao.dominio;

public class RoboLunar extends RoboExplorador {
    private String equipamentoCientifico;

    public RoboLunar(int CODIGO_IDENTIFICADOR, String nome, Bateria bateria, String equipamentoCientifico) {
        super(CODIGO_IDENTIFICADOR, nome, bateria);
        this.equipamentoCientifico = equipamentoCientifico;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEquipamento Cíentifico - " + equipamentoCientifico;
    }
}
