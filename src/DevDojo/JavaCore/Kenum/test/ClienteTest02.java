package DevDojo.JavaCore.Kenum.test;

import DevDojo.JavaCore.Kenum.dominio.Cliente_Com_Enum02;
import DevDojo.JavaCore.Kenum.dominio.TipoCliente;
import DevDojo.JavaCore.Kenum.dominio.TipoPagamento;

public class ClienteTest02 {
    public static void main(String[] args) {
        Cliente_Com_Enum02 cliente01 = new Cliente_Com_Enum02("Luciene", TipoCliente.PESSOA_FISICA,
                TipoPagamento.DEBITO);

        Cliente_Com_Enum02 cliente02 = new Cliente_Com_Enum02("Erivaldo", TipoCliente.PESSOA_JURIDICA,
                TipoPagamento.CREDITO);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente00 = TipoCliente.valueOf("PESSOA_JURIDICA");
        System.out.println(tipoCliente00.getNomeRelatorio());

        TipoCliente tipoCliente01 = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente01.getNomeRelatorio());

        System.out.println("--------------");

        TipoCliente tipoCliente02 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente02);
        TipoCliente tipoCliente03 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Jurídica");
        System.out.println(tipoCliente03);
    }
}
