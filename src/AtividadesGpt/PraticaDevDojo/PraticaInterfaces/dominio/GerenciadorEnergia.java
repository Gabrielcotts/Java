package AtividadesGpt.PraticaDevDojo.PraticaInterfaces.dominio;

public interface GerenciadorEnergia {
    void recarregarEnergia();

    static void exibirAvisoConsumo(){
        System.out.println("Aviso Geral: Economizem energia nos setores secundários.");
    }
}
