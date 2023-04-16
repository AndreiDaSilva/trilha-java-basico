import java.util.Scanner;

public class Exercio2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int nota;

        System.out.println("Digite uma nota entre 0 e 10: ");
        nota = tec.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Nota invalida! Digite uma nota entre 0 e 10: ");
            nota = tec.nextInt();
        }
    }
}
