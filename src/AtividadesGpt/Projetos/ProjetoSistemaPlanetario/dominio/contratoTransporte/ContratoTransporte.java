package AtividadesGpt.Projetos.ProjetoSistemaPlanetario.dominio.contratoTransporte;

public interface ContratoTransporte {
    void iniciarTransporte(String origem, String destino);
    void atualizarStatus(String novoStatus);
    boolean verificarDisponibilidade();
}