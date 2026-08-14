package Faculdade.Introducao;

public class TamanhoFor {
    public static void main(String[] args) {
        int tamanho = 12;
        int[] c = new int[tamanho];

        for (int i = 0; i < c.length; i++) {
            System.out.println((i + 1) + "º posição ");
        }
        System.out.println();

        int[] vet = {1, 2, 5, 10, 15, 20, 32};
        for (int i : vet) {
            System.out.printf("%d. ", i);
        }

    }
}
