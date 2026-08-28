package Faculdade.Geometria.Test;

import Faculdade.Geometria.dominio.Circulo.Circulo;
import Faculdade.Geometria.dominio.Quadrado.Quadrado;
import Faculdade.Geometria.dominio.Triangulo.Triangulo;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(6);
        Triangulo triangulo = new Triangulo(5, 6, 9, 7, 12);
        Circulo circulo = new Circulo(8);

        System.out.println("---------");
        circulo.imprimeDadosCirculo();
        System.out.println("---------");
        quadrado.imprimeDadosQuadrado();
        System.out.println("---------");
        triangulo.imprimeDadosTriangulo();



    }
}
