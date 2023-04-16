import java.util.Scanner;

public class Exercio4 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int count = 0;
        int numero;
        int qtdPares = 0;
        int qtdImpares = 0;
        int numImpar[] = new int[10];
        int numPar[] = new int[10];

        System.out.println("Informe a quantidade de números a serem informados: ");
        int qtdNumeros = tec.nextInt();

        do {
            System.out.println("Numero ");
            numero = tec.nextInt();
            if (numero % 2 == 0)
                qtdPares++;
            else
                qtdImpares++;
        } while (++count < qtdNumeros);

        System.out.println("Quantidade de par: " + qtdPares);
        System.out.println("Quantidade de impar: " + qtdImpares);

    }
}
