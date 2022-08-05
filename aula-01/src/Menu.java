package src;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Menu {

    private Scanner entrada = new Scanner(System.in);
    private Vetor vetor = new Vetor();

    public static String[] opcoes = {
            "Criar estrutura",
            "Exibir estrutura",
            "Exibir tamanho",
            "Alterar um dado em uma posição especifica",
            "Adicionar um dado na primeira posição",
            "Adicionar um dado na ultima posição",
            "Adicionar um dado antes da primeira posição",
            "Adicionar um dado depois da ultima posição",
            "Recuperar os dados de uma posição",
            "Remover uma posição especifica"
    };

    public static String retorno = "Retornando ao menu pricipal...";
    public static String pressione = "Pressione qualquer tecla para continuar...";

    public void principal() {

        int opcao = -1;

        while (opcao == -1) {

            limparTela();
            Menu.divisor();
            System.out.println("Menu principal");
            Menu.divisor();

            String cor = "\033[1;34m";
            String reset = "\033[0m";

            System.out.print(cor);

            for (int i = 0; i < opcoes.length; i++) {
                System.out.println(" | " + i + " | " + opcoes[i]);
            }

            System.out.print(reset);

            Menu.divisor();

            System.out.println("Escolha uma opção:");

            opcao = this.entrada.nextInt();

            if (opcao < 0 || opcao >= opcoes.length) {
                opcao = -1;
            }

            limparTela();
        }

        switch (opcao) {
            case 0:
                criarEstrutura();
                break;
            case 1:
                exibirEstrutura();
                break;
            case 2:
                exibirTamanho();
                break;
            case 3:
                adicionarPosicao();
                break;
            case 4:
                adicionarPrimeira();
                break;
            case 5:
                adicionarUltima();
                break;
            case 6:
                adicionarInicio();
                break;
            case 7:
                adicionarFim();
                break;
            case 8:
                recuperarPosicao();
                break;
            case 9:
                removerPosicao();
                break;
            default:
                System.out.println("Opção desconhecida");
                break;
        }

    }

    public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private void criarEstrutura() {

        int tamanho = -1;

        while (tamanho == -1) {

            Menu.titulo(Menu.opcoes[0]);
            System.out.println("Informe o tamanho:");

            tamanho = this.entrada.nextInt();

            if (tamanho == 0) {
                Menu.limparTela();
                System.out.println(Menu.retorno);
                Menu.aguardar(2);
                this.principal();
            }

            if (tamanho < 0) {
                tamanho = -1;
            }

            limparTela();
        }

        this.vetor.criar(tamanho);
        Menu.resposta("Vetor criado, tamanho: " + tamanho);

        this.pressione();

    }

    private void exibirEstrutura() {

        Menu.titulo(Menu.opcoes[1]);

        System.out.println(" | Posição | Valor ");
        Menu.divisor();
        for (int posicao = 0; posicao < this.vetor.tamanho(); posicao++) {
            int dado = this.vetor.dados()[posicao];
            Menu.resposta(" | " + posicao + " | " + dado + " | ");
        }

        this.pressione();

    }

    private void exibirTamanho() {

        Menu.titulo(Menu.opcoes[2]);

        int tamanho = this.vetor.tamanho();
        Menu.resposta("Tamanho : " + tamanho);

        this.pressione();

    }

    private void adicionarPosicao() {
        int posicao = -1;
        int dado = -1;

        while (posicao == -1) {

            Menu.titulo(Menu.opcoes[3] + "[1/2]");
            System.out.println("Informe a posição:");

            posicao = this.entrada.nextInt();

            if (posicao == 0) {
                Menu.limparTela();
                System.out.println(Menu.retorno);
                Menu.aguardar(2);
                this.principal();
            }

            if (posicao < 0) {
                posicao = -1;
            }

            limparTela();
        }

        while (dado == -1) {

            Menu.titulo(Menu.opcoes[3] + "[2/2]");
            System.out.println("Informe o valor:");

            dado = this.entrada.nextInt();

            if (dado == 0) {
                Menu.limparTela();
                System.out.println(Menu.retorno);
                Menu.aguardar(2);
                this.principal();
            }

            if (dado < 0) {
                dado = -1;
            }

            limparTela();
        }

        this.vetor.mudar(posicao, dado);
        Menu.resposta("Vetor alterado, posicao: " + posicao + ", valor: " + dado);

        this.pressione();

    }

    private void adicionarPrimeira() {
        int dado = -1;

        while (dado == -1) {

            Menu.titulo(Menu.opcoes[4]);
            System.out.println("Informe o valor");

            dado = this.entrada.nextInt();

            if (dado < 0) {
                dado = -1;
            }

            limparTela();
        }

        this.vetor.primeiro(dado);
        Menu.resposta("Valor alterado na primeira posição: " + dado);

        this.pressione();

    }

    private void adicionarUltima() {
        int dado = -1;

        while (dado == -1) {

            Menu.titulo(Menu.opcoes[5]);
            System.out.println("Informe o valor");

            dado = this.entrada.nextInt();

            if (dado < 0) {
                dado = -1;
            }

            limparTela();
        }

        this.vetor.ultimo(dado);
        Menu.resposta("Valor alterado na ultima posição: " + dado);

        this.pressione();

    }

    private void adicionarInicio() {
        int dado = -1;

        while (dado == -1) {

            Menu.titulo(Menu.opcoes[6]);
            System.out.println("Informe o valor");

            dado = this.entrada.nextInt();

            if (dado < 0) {
                dado = -1;
            }

            limparTela();
        }

        this.vetor.inicio(dado);
        Menu.resposta("Valor adiocionado ao início: " + dado);

        this.pressione();

    }

    private void adicionarFim() {
        int dado = -1;

        while (dado == -1) {

            Menu.titulo(Menu.opcoes[7]);
            System.out.println("Informe o valor");

            dado = this.entrada.nextInt();

            if (dado < 0) {
                dado = -1;
            }

            limparTela();
        }

        this.vetor.fim(dado);
        Menu.resposta("Valor adiocionado ao final: " + dado);

        this.pressione();

    }

    private void recuperarPosicao() {
        int posicao = -1;

        while (posicao == -1) {

            Menu.titulo(Menu.opcoes[8]);
            System.out.println("Informe a posição");

            posicao = this.entrada.nextInt();

            if (posicao < 0) {
                posicao = -1;
            }

            limparTela();
        }

        int valor = this.vetor.recuperar(posicao);
        Menu.resposta("Valor recuperado da posição [" + posicao + "]: " + valor);

        this.pressione();
    }

    private void removerPosicao() {
        int posicao = -1;

        while (posicao == -1) {

            Menu.titulo(Menu.opcoes[9]);
            System.out.println("Informe a posição");

            posicao = this.entrada.nextInt();

            if (posicao < 0) {
                posicao = -1;
            }

            limparTela();
        }

        this.vetor.apagar(posicao);
        Menu.resposta("Posicao removida: " + posicao);

        this.pressione();

    }

    public static void aguardar(int segundos) {
        try {
            TimeUnit.SECONDS.sleep(segundos);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public void pressione() {
        Menu.divisor();
        System.out.println(Menu.pressione);

        try {
            System.in.read();
            System.out.println(Menu.retorno);
            this.principal();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void titulo(String titulo) {
        String cor = "\033[1;34m";
        String reset = "\033[0m";
        Menu.divisor();
        System.out.print(cor);
        System.out.println(titulo);
        System.out.print(reset);
        Menu.divisor();
    }

    public static void resposta(String titulo) {
        String cor = "\033[0;32m";
        String reset = "\033[0m";
        System.out.print(cor);
        System.out.println(titulo);
        System.out.print(reset);
    }

    public static void divisor() {
        System.out.println("--------------------------------------");
    }

}
