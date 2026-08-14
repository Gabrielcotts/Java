package Faculdade;

import javax.swing.*;

public class TelaAdicao {
    public static void main(String[] args) {
        String firstNumber;
        String secondNumber;
        int number1, number2, sum;

        firstNumber = JOptionPane.showInputDialog("Digite o primeiro número inteiro");
        secondNumber = JOptionPane.showInputDialog("Digite o segundo número inteiro");

        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);

        sum = number1 + number2;
        JOptionPane.showMessageDialog(null, "A soma é: " + sum, "Resultado", JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
}