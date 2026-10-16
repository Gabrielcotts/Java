package AtividadesGpt.Projetos.ProjetoSistemaPlanetario.dominio.status;

public interface Status {
    default void verificarStatus(StatusCarga statusCarga) {
        if (statusCarga != null) {
            System.out.println("Status verificado: " + statusCarga.getDescricao());
        } else {
            System.out.println("Nenhum status fornecido.");
        }
    }
}
