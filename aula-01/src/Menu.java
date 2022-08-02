package src;

import java.util.Scanner;

public class Menu {

    public static Scanner entrada = new Scanner(System.in);

    public static void principal() {
        int opcao = -1;

        String[] opcoes = {
                "Criar estrutura com tamanho",
                "Exibir tamanho da estrutura",
                "Exibir numero de itens",
                "Adiciona um dado a uma posição especifica",
                "Adiciona um dado na ultima posição",
                "Adiciona um dado depois da ultima posição",
                "Recupera dado de uma posição",
                "Remove uma posição especifica"
        };

        while (opcao == -1) {

            System.out.println("Menu principal");

            String cor = "\033[1;34m";
            String reset = "\033[0m";

            System.out.println(cor);

            for (int i = 0; i < opcoes.length; i++) {
                int id = i + 1;
                System.out.println(" | " + id + " | " + opcoes[i]);
            }

            System.out.println(reset);

            System.out.println("Escolha uma opção:");

            opcao = Menu.entrada.nextInt();

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
                System.out.println("nao sei");
                break;
        }

    }

    public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void criarEstrutura() {

    }

    public static void exibirEstrutura() {

    }

    public static void exibirQuantidade() {

    }

    public static void adicionarPosicao() {

    }

    public static void adicionarUltima() {

    }

    public static void adicionarDepois() {

    }

    public static void removerPosicao() {

    }

    public static void recuperarPosicao() {

    }

}
