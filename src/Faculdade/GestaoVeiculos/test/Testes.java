package Faculdade.GestaoVeiculos.test;

import Faculdade.GestaoVeiculos.dominio.Carro;
import Faculdade.GestaoVeiculos.dominio.CarroEletrico;
import Faculdade.GestaoVeiculos.dominio.Moto;
import Faculdade.GestaoVeiculos.dominio.Veiculo;

public class Testes {
    public static void main(String[] args) {

        testarAceleracao();
        testarFrenagem();
        testarAno();
        testarPolimorfismo();

        System.out.println("Todos os testes foram executados.");
    }

    public static void testarAceleracao() {

        Carro carro = new Carro(
                "Toyota",
                "Corolla",
                2022,
                0,
                4
        );

        carro.acelerar(10, 4);

        if (carro.getVelocidadeAtual() != 40) {
            throw new IllegalStateException(
                    "Erro no teste de aceleração repetida."
            );
        }

        try {
            carro.acelerar(-5);

            throw new IllegalStateException(
                    "A aceleração negativa deveria gerar erro."
            );

        } catch (IllegalArgumentException e) {
            System.out.println("Teste de aceleração negativa: OK");
        }
    }

    public static void testarFrenagem() {

        Carro carro = new Carro(
                "Toyota",
                "Corolla",
                2022,
                20,
                4
        );

        carro.frear(50);

        if (carro.getVelocidadeAtual() != 0) {
            throw new IllegalStateException(
                    "A velocidade não poderia ficar negativa."
            );
        }

        try {
            carro.frear(-5);

            throw new IllegalStateException(
                    "A frenagem negativa deveria gerar erro."
            );

        } catch (IllegalArgumentException e) {
            System.out.println("Teste de frenagem negativa: OK");
        }
    }

    public static void testarAno() {

        Carro carro = new Carro();

        try {
            carro.setAno(1800);

            throw new IllegalStateException(
                    "Ano inválido deveria gerar erro."
            );

        } catch (IllegalArgumentException e) {
            System.out.println("Teste de ano inválido: OK");
        }
    }

    public static void testarPolimorfismo() {

        Veiculo veiculo = new CarroEletrico(
                "BYD",
                "Dolphin",
                2024,
                0,
                4
        );

        veiculo.exibirDados();
        veiculo.realizarManutencao();

        CarroEletrico carroEletrico = (CarroEletrico) veiculo;

        carroEletrico.carregarBateria();

        if (carroEletrico.getNivelBateria() != 100) {
            throw new IllegalStateException(
                    "Erro no teste da interface Eletrico."
            );
        }

        System.out.println("Teste da interface Eletrico: OK");

        Moto moto = new Moto(
                "Honda",
                "CG 160",
                2023,
                0,
                true
        );

        Veiculo outroVeiculo = moto;

        outroVeiculo.exibirDados();
        outroVeiculo.realizarManutencao();
    }
}