package DevDojo.JavaCore.Kenum.dominio;

public class Cliente_Com_Enum02 {
    // public enum TipoPagamento{
    //     DEBITO, CREDITO
    // }

    private String nome;
    private  TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente_Com_Enum02(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente_Com_Enum02{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteNomeRelatorio=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
