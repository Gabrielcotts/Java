package Faculdade.Geometria.dominio.Circulo;

public class Circulo {
    private static double pi = 3.14;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    public Circulo(){}

    public double calcularArea(){
        return pi * Math.pow(raio, 2);
    }

    public double calcularPerimetro(){
        return 2 * pi * raio;
    }

    public void imprimeDadosCirculo(){
        System.out.println("Raio: " + this.raio);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }


    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        Circulo.pi = pi;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
