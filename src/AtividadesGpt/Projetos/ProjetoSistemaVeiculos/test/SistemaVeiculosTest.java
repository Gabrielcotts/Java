package AtividadesGpt.Projetos.ProjetoSistemaVeiculos.test;

import AtividadesGpt.Projetos.ProjetoSistemaVeiculos.dominio.Carro;
import AtividadesGpt.Projetos.ProjetoSistemaVeiculos.dominio.Moto;

import static AtividadesGpt.Projetos.ProjetoSistemaVeiculos.dominio.TipoCombustivel.*;

public class SistemaVeiculosTest {
    public static void main(String[] args) {
        Carro carro01 = new Carro(
                "Fiat",
                "Dobló",
                2001,
                GASOLINA,
                4

        );

        Carro carro02 = new Carro(
                "Volkswagen",
                "Gol",
                2003,
                FLEX,
                4
        );

        Carro carro03 = new Carro(
                "Chevrolet",
                "Onix",
                2024,
                FLEX,
                4
        );


        Moto moto01 = new Moto(
                "Honda",
                "CG 125 Titan KS",
                2000,
                GASOLINA,
                124
        );

        Moto moto02 = new Moto(
                "Yamaha",
                "YS 250 Fazer Blueflex",
                2013,
                FLEX,
                249
        );

        Moto moto03 = new Moto(
                "BMW",
                " R1300 GS Triple Black",
                2024,
                GASOLINA,
                1300
        );

        System.out.println("==== CARROS ====");
        System.out.println("----------------");
        carro01.imprimeDados();
        carro01.imprimeLimiteVelocidade(120);
        System.out.println("----------------");
        carro02.imprimeDados();
        carro02.imprimeLimiteVelocidade(120);
        System.out.println("----------------");
        carro03.imprimeDados();
        carro03.imprimeLimiteVelocidade(120);
        System.out.println("----------------");

        System.out.println("==== MOTOS ====");
        System.out.println("----------------");
        moto01.imprimeDados();
        moto01.imprimeLimiteVelocidade(120);
        System.out.println("----------------");
        moto02.imprimeDados();
        moto02.imprimeLimiteVelocidade(120);
        System.out.println("----------------");
        moto03.imprimeDados();
        moto03.imprimeLimiteVelocidade(120);
        System.out.println("----------------");

    }
}