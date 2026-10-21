package AtividadesGpt.PraticaDevDojo.PraticaInterfaces.dominio;

public interface Acoplavel {
    void acoplarNaEstacao();

    default void alertaAcoplagem(){
        System.out.println("Alerta: Procedimento de acoplagem iniciado.");
    }
}
