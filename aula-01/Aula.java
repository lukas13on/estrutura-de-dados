import java.util.Scanner;

public class Aula {

    public static int[] vetor;

    public static void main(String[] args) {
        criaVetor();
        adicionaDado(0, 1);
        adicionaDado(1, 2);
        apagaDado(0);
        System.out.println("Numero de itens armazenados:");
        mostraQuantidade();
        System.out.println("Vetor produzido:");
        mostraVetor();
    }

    public static int[] criaVetor() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor:");
        int tamanhoVetor = entrada.nextInt();
        return Aula.vetor = new int[tamanhoVetor];
    }

    public static int adicionaDado(int posicao, int dado) {
        return Aula.vetor[posicao] = dado;
    }

    public static int recuperaDado(int posicao) {
        return Aula.vetor[posicao];
    }

    public static void mostraQuantidade() {
        System.out.println(Aula.vetor.length);
    }

    public static void mostraVetor() {
        for (int x = 0; x < Aula.vetor.length; x++) {
            System.out.println("posicao: " + x + " | valor: " + Aula.vetor[x]);
        }
    }

    public static int[] apagaDado(int posicao) {
        int[] novoArray = new int[Aula.vetor.length - 1];
        int posicaoNova = 0;
        for (int x = 0; x < Aula.vetor.length; x++) {
            if (x != posicao) {
                novoArray[posicaoNova] = Aula.vetor[x];
                posicaoNova++;
            }
        }
        return Aula.vetor = novoArray;
    }
}
