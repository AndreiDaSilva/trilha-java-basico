import java.util.Scanner;

public class Exercio3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int numero;
        int count = 0;
        int maior = 0;
        int media = 0;
        do {
            System.out.println("Digite o numero: ");
            numero = tec.nextInt();
            media += numero;
            if (numero > maior) {
                maior = numero;
            }
            count++;
        } while (count < 5);

        System.out.println("Média dos numeros digitados: " + (media / count));
        System.out.println("Maior numero digitado: " + maior);

    }
}
