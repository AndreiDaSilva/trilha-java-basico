import java.util.Scanner;

public class Exercio1 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.print("Digite seu nome ou 0 para sair:");
            nome = tec.next();
            if (nome.equals("0"))
                break;
            System.out.print("Digite sua idade: ");
            idade = tec.nextInt();
        }

    }
}