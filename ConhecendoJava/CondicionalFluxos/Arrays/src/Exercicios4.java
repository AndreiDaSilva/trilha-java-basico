import java.util.Random;

public class Exercicios4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][][] numAleatorios = new int[4][4][4];

        for (int i = 0; i < numAleatorios.length; i++) {
            for (int j = 0; j < numAleatorios[i].length; j++) {
                for (int k = 0; k < numAleatorios.length; k++) {
                    numAleatorios[i][j][k] = random.nextInt(9);
                }
            }
        }

        System.out.println("Matriz: ");
        for (int[][] linha : numAleatorios) {
            for (int coluna[] : linha) {
                for (int is : coluna) {
                    System.out.print(is + " ");
                }
            }
            System.out.println();
        }
    }
}
