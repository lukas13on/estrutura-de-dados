public class ExercicioTres {
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        int valor;

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz.length; y++) {
                valor = x+y;
                System.out.print(" " + valor + " ");
            }
            System.out.println();
        }

    }
}