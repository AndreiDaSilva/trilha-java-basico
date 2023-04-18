public class Exercicio1 {
    public static void main(String[] args) {
        int[] vetor = { -5, 10, -45, 10, 78 };

        System.out.print("Vetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i]);
            if (i != 0)
                System.out.print(", ");
            else
                System.out.print(".");
        }
    }
}
