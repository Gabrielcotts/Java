//Código para maior entendimento de POO

package DevDojo.JavaCore.BintroduçãoDeMetodos.test;

import DevDojo.JavaCore.BintroduçãoDeMetodos.dominio.Calculadora;


public class CalculadoraTest05 {
    public static void main(String... args) {

        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println("\nCalculadoratest05");
        System.out.println(a);
        System.out.println(b);


        System.out.println("--------------");
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);

        System.out.println("-------------");
        calculadora.somaVarArgs(/*valor,*/1,2,3,4,5,6,7);
    }
}
