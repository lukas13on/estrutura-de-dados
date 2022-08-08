package src;

/**
 * Objeto que manipula um Vetor unidimencional de numeros inteiros
 */
public class Vetor {

    /**
     * Define o vetor como vazio por padrão
     */
    private int[] dados = {};

    /**
     * Cria um vetor de tamanho especifico, começando pelo zero
     * 
     * @param tamanho ex: tamanho 5 resulta em 6 (0-5) posições
     * @returns Vetor
     */
    public Vetor criar(int tamanho) {
        this.dados = new int[tamanho];
        return this;
    }

    /**
     * Altera uma posicao os dados de uma determinada posição,
     * caso a posição não exista, ela é criada.
     * 
     * @param posicao
     * @param dado
     * @return Vetor
     */
    public Vetor alterar(int posicao, int dado) {
        this.dados[posicao] = dado;
        return this;
    }

    /**
     * Retorna o tamanho atual do vetor
     * 
     * @return int
     */
    public int tamanho() {
        return this.dados.length;
    }

    /**
     * Recupera o valor de uma determinada posição
     * @param posicao
     * @return int
     */
    public int recuperar(int posicao) {
        if(this.existe(posicao)){
            return this.dados[posicao];
        } else {
            return -1;
        } 
    }
    
    /**
     * Recupera os dados brutos do vetor
     * 
     * @return int
     */
    public int[] dados() {
        return this.dados;
    }

    /**
     * Apaga uma determinada posição
     * @param posicao
     * @return Vetor
     */
    public Vetor apagar(int posicao) {
        if (this.existe(posicao)) {

            int[] novoVetor = new int[this.dados.length - 1];
            int posicaoNova = 0;

            for (int x = 0; x < this.dados.length; x++) {
                if (x != posicao) {
                    novoVetor[posicaoNova] = this.dados[x];
                    posicaoNova++;
                }
            }

            this.dados = novoVetor;
        }

        return this;
    }

    /**
     * Altera a primeira posição com um determinado dado
     * @param dado
     * @return Vetor
     */
    public Vetor primeiro(int dado) {
        this.dados[0] = dado;
        return this;
    }

    /**
     * Altera a última posição com um determinado dado
     * @param dado
     * @return Vetor
     */
    public Vetor ultimo(int dado) {
        this.dados[this.dados.length - 1] = dado;
        return this;
    }

    /**
     * Adiciona um determinado dado após a última posição
     * @param dado
     * @return Vetor
     */
    public Vetor fim(int dado) {
        int tamanhoAntigo = this.dados.length;
        int novoTamanho = tamanhoAntigo + 1;
        int[] novoVetor = new int[novoTamanho];
        for (int i = 0; i < tamanhoAntigo; i++) {
            novoVetor[i] = this.dados[i];
        }
        novoVetor[tamanhoAntigo] = dado;
        this.dados = novoVetor;
        return this;
    }

    /**
     * Adiciona um determinado dado antes da primeira posição
     * @param dado
     * @return Vetor
     */
    public Vetor inicio(int dado) {
        int novoTamanho = this.dados.length + 1;
        int[] novoVetor = new int[novoTamanho];
        novoVetor[0] = dado;
        for (int i = 1; i < novoTamanho; i++) {
            novoVetor[i] = this.dados[i - 1];
        }
        this.dados = novoVetor;
        return this;
    }

    /**
     * Aloca um tamanho especifico para o vetor com os dados já contidos
     * @param tamanho
     * @return Vetor
     */
    public Vetor alocar(int tamanho) {
        int novoVetor[] = new int[tamanho];
        int tamanhoVetor = this.tamanho();
        tamanhoVetor = tamanhoVetor > tamanho ? tamanho : tamanhoVetor;
        for (int posicao = 0; posicao < tamanhoVetor; posicao++) {
            if(this.existe(posicao)){
                novoVetor[posicao] = this.dados[posicao];
            }
        }
        this.dados = novoVetor;
        return this;
    }
    
    /**
     * Verifica se uma posicao existe no vetor atual
     * @param posicao
     * @return boolean
     */
    public boolean existe(int posicao) {
        return posicao >= 0 && posicao < this.tamanho();
    }

}
