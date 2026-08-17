package Faculdade.Pratica.Janelas;

import javax.swing.*;
import java.awt.Toolkit;

public class NomeUsuario {
    public static void main(String[] args) {
        String nomeUsuario = JOptionPane.showInputDialog("Digite seu nome ");

        if (nomeUsuario == null || nomeUsuario.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Usuário não pode ser nulo ou vazio!",
                    "Erro de Validação",
                    JOptionPane.ERROR_MESSAGE);
                    Toolkit.getDefaultToolkit().beep();
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Olá, " + nomeUsuario + "!\nSeja Bem-vindo(a)!",
                    "Boas-vindas",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        System.exit(0);
    }
}
