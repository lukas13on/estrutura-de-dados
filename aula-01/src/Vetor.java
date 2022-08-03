package src;

/**
 * Objeto que cria e manipula Vetor
 */
public class Vetor {

    private int[] dados;

    public int[] criar(int tamanho) {
        return this.dados = new int[tamanho];
    }

    public int mudar(int posicao, int dado) {
        return this.dados[posicao] = dado;
    }

    public int recuperaDado(int posicao) {
        return this.dados[posicao];
    }

    public void mostraQuantidade() {
        System.out.println(this.dados.length);
    }

    public void mostraVetor() {
        for (int x = 0; x < this.dados.length; x++) {
            System.out.println("posicao: " + x + " | valor: " + this.dados[x]);
        }
    }

    public int[] apagaDado(int posicao) {
        int[] novoArray = new int[this.dados.length - 1];
        int posicaoNova = 0;
        for (int x = 0; x < this.dados.length; x++) {
            if (x != posicao) {
                novoArray[posicaoNova] = this.dados[x];
                posicaoNova++;
            }
        }
        return this.dados = novoArray;
    }
}
