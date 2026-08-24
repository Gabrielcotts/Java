package DevDojo.JavaCore.BintroduçãoDeMetodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double dividaDoisNumeros02(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }

        //Outro metodo

/*       if (num2 != 0){
            return num1/num2;
        }
       return 0;  */
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
            System.out.println(num1 / num2);
    }
     public void alteraDoisNumeros( int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNmeros ");
        System.out.println("Numero1 " + numero1);
        System.out.println("Numero2 " + numero2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs( /*double valor,*/ int... numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
