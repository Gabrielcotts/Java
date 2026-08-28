package Faculdade.Geometria.dominio.Quadrado;

public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    public Quadrado() {}

    public double calcularArea(){
        return lado * lado;
    }

    public double perimetro(){
        return 4 * lado;
    }

    public void imprimeDadosQuadrado(){
        System.out.println("Lado: " + lado);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + perimetro());
    }


    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
