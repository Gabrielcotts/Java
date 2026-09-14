package DevDojo.JavaCore.JmodificadorFinal.test;

import DevDojo.JavaCore.JmodificadorFinal.dominio.Carro;
import DevDojo.JavaCore.JmodificadorFinal.dominio.Comprador;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro = new Carro();
//        System.out.println(carro.VELOCIDADE_LIMITE);
        System.out.println(Carro.VELOCIDADE_LIMITE);
//        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Gabriel");
        System.out.println(carro.COMPRADOR);
    }
}
