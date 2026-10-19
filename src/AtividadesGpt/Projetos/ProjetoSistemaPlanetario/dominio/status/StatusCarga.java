package AtividadesGpt.Projetos.ProjetoSistemaPlanetario.dominio.status;

public enum StatusCarga {
    AGUARDANDO(1, "Aguardando!"),
    EM_PREPARACAO(2, "Em preparação!"),
    EM_TRANSITO(3,"Em trânsito!"),
    ENTREGUE(4, "Entregue!"),
    CANCELADA(5, "Cancelada!");

    private final int codigoStatus;
    private final String descricao;

    StatusCarga(int codigoStatus, String descricao) {
        this.codigoStatus = codigoStatus;
        this.descricao = descricao;
    }

    public int getCodigoStatus() {
        return codigoStatus;
    }

    public String getDescricao() {
        return descricao;
    }
}
