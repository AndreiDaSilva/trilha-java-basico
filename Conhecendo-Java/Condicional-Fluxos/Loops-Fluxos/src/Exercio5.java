import java.util.Scanner;

public class Exercio5 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Informe o numero da Tabuada: ");
        int numero = tec.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x "  + i + " = " + (numero * i));
        }
    }
}
