public class App {
    public static void main(String[] args) throws Exception {
        int intUm = 10;
        int intDois = 20;

        float floatUm = 4.5f;
        float floatDois = 3.5f;

        double doubleUm = 59.78;

        char charUm = 'x';
        char charDois = 'y';

        String stringUm = "Fulano";
        String stringDois = "Beltrano";
        String stringTres = "Fulano";

        boolean booleanUm = true;
        boolean booleanDois = false;
        boolean booleanTres = true;
        boolean booleanQuatro = false;

        long longUm = 1597L;
        long longDois = 8997L;

        byte byteUm = 1;

        short shortUm = 25;

        System.out.println("intUm == intDois " + (intUm == intDois));
        System.out.println("intUm != intDois " + (intUm != intDois));
        System.out.println("intUm >  intDois " + (intUm > intDois));
        System.out.println("intUm <= intDois " + (intUm <= intDois));

        System.out.println("floatUm == floatDois " + (floatUm == floatDois));
        System.out.println("floatUm != floatDois " + (floatUm != floatDois));
        System.out.println("floatUm >  floatDois " + (floatUm >= floatDois));
        System.out.println("floatUm <= floatDois " + (floatUm < floatDois));

        System.out.println("charUm == charDois " + (charUm == charDois));
        System.out.println("charUm != charDois " + (charUm != charDois));
        System.out.println("charUm >  charDois " + (charUm >= charDois));
        System.out.println("charUm <= charDois " + (charUm < charDois));

        System.out.println("charUm == charDois " + (charUm == charDois));
        System.out.println("charUm != charDois " + (charUm != charDois));
        System.out.println("charUm >  charDois " + (charUm >= charDois));
        System.out.println("charUm <= charDois " + (charUm < charDois));

        System.out.println("stringUm == stringDois " + (stringUm == stringDois));
        System.out.println("stringUm == stringTres " + (stringUm == stringTres));
        System.out.println("stringUm !=  stringDois " + (stringUm != stringDois));

        System.out.println("booleanUm == booleanDois " + (booleanUm == booleanDois));
        System.out.println("booleanUm != booleanDois " + (booleanUm != booleanDois));

        System.out.println("longUm > floatDois " + (longUm > floatDois));
        System.out.println("doubleUm == shortUm " + (doubleUm == shortUm));

        System.out.println("longDois == intUm " + (longDois == intUm));
        System.out.println("longUm != intDois " + (longUm != intDois));
        System.out.println("byteUm >  shortUm " + (byteUm >= shortUm));

        /*
         * Operadores lógicos
         */

        System.out.println("booleanUm && booleanDois " + (booleanUm && booleanDois));
        System.out.println("booleanUm && booleanTres " + (booleanUm && booleanTres));

        System.out.println("booleanUm || booleanDois " + (booleanUm || booleanDois));
        System.out.println("booleanDois || booleanQuatro " + (booleanDois || booleanQuatro));

        System.out.println("booleanUm ^ booleanDois " + (booleanUm ^ booleanDois));
        System.out.println("booleanUm ^ booleanTres " + (booleanUm ^ booleanTres));

        System.out.println("!booleanUm " + (!booleanUm));
        System.out.println("!booleanDois " + (!booleanDois));

    }
}
