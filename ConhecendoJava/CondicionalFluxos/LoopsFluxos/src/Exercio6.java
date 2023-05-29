import java.util.Scanner;

public class Exercio6 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Fatorial: ");
        int fatorial = tec.nextInt();
        int resultado = 1;
        for (int i = fatorial; i > 0; i--) {
            resultado *= i;
        }
        System.out.println("Fatorial de " + fatorial + " = " + resultado);
    }

}
