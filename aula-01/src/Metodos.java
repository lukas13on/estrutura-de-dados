package src;

import java.util.Scanner;

public class Metodos {

    public static int[] vetor;

    public static void main(String[] args) {
        System.out.println("Criado o vetor!");
        criaVetor();

        System.out.println("Adicionado a posicao [0] o valor [5]");
        mudaDado(0, 5);

        System.out.println("Adicionado a posicao [2] o valor [2]");
        mudaDado(2, 2);

        System.out.println("Adicionado a posicao [4] o valor [7]");
        mudaDado(4, 7);

        System.out.println("Vetor antes de apagar:");
        mostraVetor();

        System.out.println("Itens armazenados antes de apagar:");
        mostraQuantidade();

        apagaDado(4);

        System.out.println("Vetor depois de apagar:");
        mostraVetor();

        System.out.println("Itens armazenados depois de apagar");
        mostraQuantidade();
    }

    public static int[] criaVetor() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor:");
        int tamanhoVetor = entrada.nextInt();
        return Metodos.vetor = new int[tamanhoVetor];
    }

    public static int mudaDado(int posicao, int dado) {
        return Metodos.vetor[posicao] = dado;
    }

    public static int recuperaDado(int posicao) {
        return Metodos.vetor[posicao];
    }

    public static void mostraQuantidade() {
        System.out.println(Metodos.vetor.length);
    }

    public static void mostraVetor() {
        for (int x = 0; x < Metodos.vetor.length; x++) {
            System.out.println("posicao: " + x + " | valor: " + Metodos.vetor[x]);
        }
    }

    public static int[] apagaDado(int posicao) {
        int[] novoArray = new int[Metodos.vetor.length - 1];
        int posicaoNova = 0;
        for (int x = 0; x < Metodos.vetor.length; x++) {
            if (x != posicao) {
                novoArray[posicaoNova] = Metodos.vetor[x];
                posicaoNova++;
            }
        }
        return Metodos.vetor = novoArray;
    }
}
