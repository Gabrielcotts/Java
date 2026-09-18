package DevDojo.JavaCore.Kenum.test;

import DevDojo.JavaCore.Kenum.dominio.Cliente_Com_Enum01;
import DevDojo.JavaCore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
/*        Cliente_Sem_Enum cliente011 = new Cliente_Sem_Enum("Luciene", "PESSOA_FISICA");
        Cliente_Sem_Enum cliente012 = new Cliente_Sem_Enum("Erivaldo", "PESSOA_JURIDICA");
        Cliente_Sem_Enum cliente013 = new Cliente_Sem_Enum("Tonhão", "Pessoa fizica");
        Cliente_Sem_Enum cliente014 = new Cliente_Sem_Enum("Eva", "pessoa Juridica");

        System.out.println(cliente011);
        System.out.println(cliente012);
        System.out.println("-----------");
        System.out.println(cliente013);
        System.out.println(cliente014);

 */

        Cliente_Com_Enum01 cliente01 = new Cliente_Com_Enum01("Luciene", TipoCliente.PESSOA_FISICA);
        Cliente_Com_Enum01 cliente02 = new Cliente_Com_Enum01("Erivaldo", TipoCliente.PESSOA_JURIDICA);
        Cliente_Com_Enum01 cliente03 = new Cliente_Com_Enum01("Tonhão", TipoCliente.PESSOA_FISICA);
        Cliente_Com_Enum01 cliente04 = new Cliente_Com_Enum01("Eva", TipoCliente.PESSOA_FISICA);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(cliente03);
        System.out.println(cliente04);

    }
}
