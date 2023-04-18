import java.util.Random;

public class Exercicio3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numAleatorios = new int[20];

        for (int i = 0; i < numAleatorios.length; i++) {
            numAleatorios[i] = random.nextInt(100);
        }

        System.out.print("\nAntecessor ");
        for (int numero : numAleatorios) {
            System.out.print(--numero + " ");
        }

        System.out.print("\nNúmeros Ra ");
        for (int numeros : numAleatorios) {
            System.out.print(numeros + " ");
        }

        System.out.print("\nSucessores ");
        for (int numero : numAleatorios) {
            System.out.print(++numero + " ");
        }

    }
}
