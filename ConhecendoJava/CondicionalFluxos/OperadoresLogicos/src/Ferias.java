import java.util.Scanner;

public class Ferias {

    private static String nomeMes(int mes) {
        String nomeMes = "";
        if (mes == 1) {
            nomeMes = "Janeiro";
        } else if (mes == 2) {
            nomeMes = "Fevereiro";
        } else if (mes == 3) {
            nomeMes = "Março";
        } else if (mes == 3) {
            nomeMes = "Março";
        } else if (mes == 4) {
            nomeMes = "Abril";
        } else if (mes == 5) {
            nomeMes = "Maio";
        } else if (mes == 6) {
            nomeMes = "Junho";
        } else if (mes == 7) {
            nomeMes = "Julho";
        } else if (mes == 8) {
            nomeMes = "Agosto";
        } else if (mes == 9) {
            nomeMes = "Setembro";
        } else if (mes == 10) {
            nomeMes = "Outubro";
        } else if (mes == 11) {
            nomeMes = "Novembro";
        } else if (mes == 12) {
            nomeMes = "Dezembro";
        } else {
            nomeMes = "Numero invalido, informe um numero entre 1 e 12";
        }
        return nomeMes;
    }

    private static String diaSemana(int diaSemana) {
        String semana = "";

        switch (diaSemana) {
            case 1:
                semana = "Segunda";
                break;
            case 2:
                semana = "Terça";
                break;
            case 3:
                semana = "Quarta";
                break;
            case 4:
                semana = "Quinta";
                break;
            case 5:
                semana = "Sexta";
                break;
            case 6:
                semana = "Sábado";
                break;
            case 7:
                semana = "Domingo";
                break;
            default:
                semana = "Numero invalido, informe um numero entre 1 e 7";
                break;
        }

        return semana;
    }

    private static void ehFerias(int mes){
        switch (mes) {
            case 6:
            case 12:
            System.out.println("Férias");    
                break;
            default:
            if (mes < 6) {
                mes = 6 - mes;
            } else {
                mes = 12 - mes;
            }
            System.out.println("Faltam " + mes + " meses para férias");
                break;
        }
    }   

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int mes;
        int semana;

        System.out.println("Informe o numero do mês entre 1 a 12:");
        mes = scn.nextInt();

        System.out.println("Informe o numero da semana entre 1 a 7:");
        semana = scn.nextInt();

        System.out.println(nomeMes(mes));
        System.out.println(diaSemana(semana));
        ehFerias(mes);
    }

}
