package src;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Menu {

    private Scanner entrada = new Scanner(System.in);
    private Vetor vetor = new Vetor();

    public static String[] opcoes = {
            "Criar estrutura com tamanho",
            "Exibir tamanho da estrutura",
            "Exibir numero de itens",
            "Adiciona um dado a uma posição especifica",
            "Adiciona um dado na ultima posição",
            "Adiciona um dado depois da ultima posição",
            "Recupera dado de uma posição",
            "Remove uma posição especifica"
    };

    public static String retorno = "Retornando ao menu pricipal...";
    public static String pressione = "Pressione qualquer tecla para continuar...";

    public void principal() {

        int opcao = -1;

        while (opcao == -1) {

            limparTela();
            System.out.println("Menu principal");

            String cor = "\033[1;34m";
            String reset = "\033[0m";

            System.out.print(cor);

            for (int i = 0; i < opcoes.length; i++) {
                int id = i + 1;
                System.out.println(" | " + id + " | " + opcoes[i]);
            }

            System.out.print(reset);

            System.out.println("Escolha uma opção:");

            opcao = this.entrada.nextInt();

            if (opcao == 0 || opcao > (opcoes.length - 1)) {
                opcao = -1;
            }

            limparTela();
        }

        switch (opcao) {
            case 1:
                criarEstrutura();
                break;
            case 2:
                exibirEstrutura();
                break;
            case 3:
                exibirQuantidade();
                break;
            case 4:
                adicionarPosicao();
                break;
            case 5:
                adicionarUltima();
                break;
            case 6:
                adicionarDepois();
                break;
            case 7:
                recuperarPosicao();
                break;
            case 8:
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

            System.out.println(Menu.opcoes[0]);
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
        System.out.println("Vetor criado");
        System.out.println(Menu.retorno);
        Menu.aguardar(2);
        this.principal();
    }

    private void exibirEstrutura() {

        System.out.println(Menu.opcoes[1]);

        this.vetor.mostraVetor();

        System.out.println(Menu.pressione);

        try {
            System.in.read();
            System.out.println(Menu.retorno);
            this.principal();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void exibirQuantidade() {

        System.out.println(Menu.opcoes[2]);

        this.vetor.mostraQuantidade();

        System.out.println(Menu.pressione);

        try {
            System.in.read();
            System.out.println(Menu.retorno);
            this.principal();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void adicionarPosicao() {
        int tamanho = -1;
        int dados = -1;

        while (tamanho == -1) {

            System.out.println(Menu.opcoes[3]+"[1/2]");
            System.out.println("Informe a posição:");

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

        while (dados == -1) {

            System.out.println(Menu.opcoes[3]+"[2/2]");
            System.out.println("Informe o valor:");

            dados = this.entrada.nextInt();

            if (dados == 0) {
                Menu.limparTela();
                System.out.println(Menu.retorno);
                Menu.aguardar(2);
                this.principal();
            }

            if (dados < 0) {
                dados = -1;
            }

            limparTela();
        }

        this.vetor.criar(tamanho);
        System.out.println("Vetor criado");
        System.out.println(Menu.retorno);
        Menu.aguardar(2);
        this.principal();
    }

    private void adicionarUltima() {

    }

    private void adicionarDepois() {

    }

    private void removerPosicao() {

    }

    private void recuperarPosicao() {

    }

    public static void aguardar(int segundos) {
        try {
            TimeUnit.SECONDS.sleep(segundos);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

}
