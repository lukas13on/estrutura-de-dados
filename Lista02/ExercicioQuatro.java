import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {

        int[][] matriz = new int[5][5];
        int valor;
        Scanner entrada = new Scanner(System.in);
        int informado;
        int posicaoX = -1;
        int posicaoY = -1;

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz.length; y++) {
                valor = ExercicioQuatro.aleatorio(0, 50);
                matriz[x][y] = valor;
                System.out.print(" "+valor+" ");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        System.out.println("Informe o valor para localizar:");
        informado =entrada.nextInt();

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz.length; y++) {
                if (matriz[x][y] == informado) {
                    posicaoX = x;
                    posicaoY = y;
                }
            }
            System.out.println();
        }

        if (posicaoX != -1 && posicaoY != -1) {
            System.out.println("Valor na posição X:"+posicaoX+", Y: "+posicaoY);
        } else {
            System.out.println("Valor informado não foi encontrado.");
        }

    }

    /**
     * Retorna um numero aleatorio inteiro entre um intervalo
     * 
     * @param inicio
     * @param fim
     * @return
     */
    public static int aleatorio(int inicio, int fim) {
        return inicio + (int) (Math.random() * ((fim - inicio) + 1));
    }
}