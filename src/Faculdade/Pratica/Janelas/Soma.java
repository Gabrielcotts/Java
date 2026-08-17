package Faculdade.Pratica.Janelas;

import javax.swing.*;

public class Soma {
    public static void main(String[] args) {
        double num1, num2, soma;

        String entradaNum1 = JOptionPane.showInputDialog("Digite um número ");
        String entradaNum2 = JOptionPane.showInputDialog("Digite outro número");

        if (entradaNum1 == null || entradaNum2 == null || entradaNum1.isEmpty() || entradaNum2.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Entrada inválida! Você deve digitar dois números.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            num1 = Double.parseDouble(entradaNum1);
            num2 = Double.parseDouble(entradaNum2);

            soma = num1 + num2;

            JOptionPane.showMessageDialog(null,
                    "A soma é: "
                            + soma, "Resultado", JOptionPane.PLAIN_MESSAGE);
        }
        System.exit(0);
    }
}
