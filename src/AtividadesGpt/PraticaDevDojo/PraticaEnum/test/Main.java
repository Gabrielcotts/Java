package AtividadesGpt.PraticaDevDojo.PraticaEnum.test;

import AtividadesGpt.PraticaDevDojo.PraticaEnum.dominio.Alerta;
import AtividadesGpt.PraticaDevDojo.PraticaEnum.dominio.NivelAlerta;

public class Main {
    public static void main(String[] args) {
        Alerta[] alertas = {
                new Alerta(3, "Estamos tendo uma inundação, por favor dirijam-se em direção a saída!", NivelAlerta.PERIGO),
                new Alerta(4, "Estamos tendo um incêndio, por favor dirijam-se em direção a saída!", NivelAlerta.CRITICO),
                new Alerta(1, "Estamos tendo uma um pequeno vazamento na pia do banheiro masculino," + " por favor não utilizem essa pia!", NivelAlerta.INFORMATIVO),
                new Alerta(2, "Elevador em manutenção", NivelAlerta.ATENCAO)
        };

        for (Alerta alerta : alertas) {
            System.out.println(alerta);
            System.out.println("--------");
        }

        NivelAlerta[] nivelAlertas = new NivelAlerta[3];


            nivelAlertas[0] = NivelAlerta.buscarPorDescricao("ATENÇÃO!");
            nivelAlertas[1] = NivelAlerta.valueOf("INFORMATIVO");
            nivelAlertas[2] = NivelAlerta.buscarPorDescricao("Pequisa teste!");


        for (NivelAlerta nivelAlerta : nivelAlertas) {
            if (nivelAlerta != null) {
                System.out.println("Código " + nivelAlerta.getCOD() +
                        ", " + nivelAlerta.getNOME_RELATORIO());
            } else {
                System.out.println("Nivel de alerta não encontrado.");
            }
        }

        System.out.println("------------");
        for (NivelAlerta nivelAlerta : NivelAlerta.values()) {
            System.out.println("Código " + nivelAlerta.getCOD() +
                    ", " + nivelAlerta.getNOME_RELATORIO());

        }
    }
}
