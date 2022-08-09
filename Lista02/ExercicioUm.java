import src.Vetor;

public class ExercicioUm {
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        Vetor valores = new Vetor(0);
        int valor;

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz.length; y++) {
                valor = ExercicioUm.aleatorio(0, 20);
                if (valor > 10) {
                    valores.fim(valor);
                }
                System.out.print(" "+valor+" ");
            }
            System.out.println();
        }

        System.out.println("------------------------");

        System.out.println("Menores que 10:");

        for (int test : valores.dados()) {
            System.out.println(test);
        }
        
        System.out.println("------------------------");
        
        System.out.println("Total menor que 10:");
        System.out.println(valores.tamanho());

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