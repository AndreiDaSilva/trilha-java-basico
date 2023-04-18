import java.util.Scanner;

public class Exercicio2 {

    private static boolean ehVogal(String letra) {
        String[] vogal = { "a", "e", "i", "o", "u" };
        boolean ehVogal = false;

        for (int i = 0; i < vogal.length; i++) {
            if (letra.equalsIgnoreCase(vogal[i])) {
                ehVogal = true;
            }
        }
        return ehVogal;

    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdConsoantes = 0;
        int count = 0;
        do {
            System.out.print("Digite uma letra: ");
            String letra = tec.next();
            if (!ehVogal(letra)) {
                consoantes[qtdConsoantes] = letra;
                qtdConsoantes++;
            }
        } while (count++ < consoantes.length);

        for (String consoante : consoantes) {
            if (consoante != null)
                System.out.println(consoante);
        }
        System.out.println("Quantidade de consoante: " + qtdConsoantes);
    }
}
