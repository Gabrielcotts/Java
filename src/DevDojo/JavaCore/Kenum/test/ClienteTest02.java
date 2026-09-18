package DevDojo.JavaCore.Kenum.test;

import DevDojo.JavaCore.Kenum.dominio.Cliente_Com_Enum02;
import DevDojo.JavaCore.Kenum.dominio.Cliente_Com_Enum02.TipoPagamento;
import DevDojo.JavaCore.Kenum.dominio.TipoCliente;

public class ClienteTest02 {
    public static void main(String[] args) {
        Cliente_Com_Enum02 cliente01 = new Cliente_Com_Enum02("Luciene", TipoCliente.PESSOA_FISICA,
                TipoPagamento.DEBITO);

        Cliente_Com_Enum02 cliente02 = new Cliente_Com_Enum02("Erivaldo", TipoCliente.PESSOA_JURIDICA,
                TipoPagamento.CREDITO);

        System.out.println(cliente01);
        System.out.println(cliente02);

    }
}
