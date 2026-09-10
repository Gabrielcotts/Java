/* bloco de inicialização de instância, como uma boa prática ele costumar ser
utilizado após os atributos e antes dos contrutores*/
package DevDojo.JavaCore.Fmodificadorestatico.dominio;

public class Anime {

    private String nome;
//  private int[] episodios = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    private static int[] episodios;
    /*    0 - Bloco de inicialização estático é executado quando a JVM carregar a classe
          1 - Alocado em memória para o objeto.
          2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado.
          3 - Bloco de inicialização é executado.
          4 - Contrutor é executado
                                                                         */
   static {
        System.out.println("Dentro do bloco de inicialização estático 1");
        episodios = new int[148];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;

        }
    }
    static {
        System.out.println("Dentro do bloco de inicialização estático 2");

    }
    static {
        System.out.println("Dentro do bloco de inicialização estático 3");

    }

    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }




    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodios: Anime.episodios) {
            System.out.print(episodios + ". ");
        }
        System.out.println();
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return Anime.episodios;
    }
}
