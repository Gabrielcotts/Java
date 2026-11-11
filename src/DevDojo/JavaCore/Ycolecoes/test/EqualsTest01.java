package DevDojo.JavaCore.Ycolecoes.test;

import DevDojo.JavaCore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("11 Pro", "iPhone");
        Smartphone s2 = new Smartphone("11 Pro", "iPhone");

        System.out.println(s1.equals(s2));

//        String nome01 = "Gabriel Cotts";
//        String nome02 = "Gabriel Cotts";
//
//        System.out.println(nome01.equals(nome02));
    }
}
