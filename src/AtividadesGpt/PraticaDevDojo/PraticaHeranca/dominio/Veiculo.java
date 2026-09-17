package AtividadesGpt.PraticaDevDojo.PraticaHeranca.dominio;

public class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void imprimeDados(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
