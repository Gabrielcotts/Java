package Faculdade.GestaoVeiculos.test;

import Faculdade.GestaoVeiculos.dominio.Caminhao;
import Faculdade.GestaoVeiculos.dominio.Carro;
import Faculdade.GestaoVeiculos.dominio.CarroEletrico;
import Faculdade.GestaoVeiculos.dominio.Conectavel;
import Faculdade.GestaoVeiculos.dominio.Eletrico;
import Faculdade.GestaoVeiculos.dominio.Moto;
import Faculdade.GestaoVeiculos.dominio.Rastreavel;
import Faculdade.GestaoVeiculos.dominio.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 0, 4);
        Moto moto = new Moto("Honda", "CG 160", 2023, 0, true);
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2021, 0, 30);
        CarroEletrico carroEletrico = new CarroEletrico("BYD", "Dolphin", 2024, 0, 4);

        carro.acelerar(20);
        carro.acelerar();
        carro.acelerar(5, 4);
        carro.frear(10);

        moto.acelerar(15);
        caminhao.acelerar(10);
        carroEletrico.acelerar(25);

        List<Veiculo> frota = new ArrayList<>();
        frota.add(carro);
        frota.add(moto);
        frota.add(caminhao);
        frota.add(carroEletrico);

        System.out.println("=== FROTA ===");

        for (Veiculo veiculo : frota) {
            veiculo.imprimirDados();
            veiculo.realizarManutencao();
            System.out.println("---------");
        }

        System.out.println("Quantidade de veículos: " + frota.size());

        System.out.println("---------");
        System.out.println("Busca por marca/modelo: Toyota");
        buscarVeiculos(frota, "Toyota");

        System.out.println("---------");
        System.out.println("Busca por marca/modelo: Dolphin");
        buscarVeiculos(frota, "Dolphin");

        System.out.println("---------");

        for (Veiculo veiculo : frota) {
            if (veiculo instanceof Eletrico) {
                Eletrico eletrico = (Eletrico) veiculo;
                eletrico.carregarBateria();
                System.out.println("Bateria: " + eletrico.getNivelBateria() + "%");
            }

            if (veiculo instanceof Conectavel) {
                Conectavel conectavel = (Conectavel) veiculo;
                conectavel.conectarInternet();
            }

            if (veiculo instanceof Rastreavel) {
                Rastreavel rastreavel = (Rastreavel) veiculo;
                System.out.println("Localização: " + rastreavel.obterLocalizacao());
            }
        }
    }

    public static void buscarVeiculos(List<Veiculo> frota, String busca) {
        boolean encontrou = false;

        for (Veiculo veiculo : frota) {
            if (veiculo.getMarca().toLowerCase().contains(busca.toLowerCase()) ||
                    veiculo.getModelo().toLowerCase().contains(busca.toLowerCase())) {
                veiculo.imprimirDados();
                System.out.println("---------");
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum veículo encontrado.");
        }
    }
}
