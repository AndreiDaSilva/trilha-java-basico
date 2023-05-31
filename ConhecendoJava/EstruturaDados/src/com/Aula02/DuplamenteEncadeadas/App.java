package com.Aula02.DuplamenteEncadeadas;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();
        Random random = new Random(95);
        int numero = 0;
        for (int i = 0; i < 10; i++) {
            numero = random.nextInt(89) + 10;
            lista.add(numero);
            System.out.println(numero);
        }

        System.out.println(lista);
        System.out.println(lista.Size());
        lista.add(48, 5);
        System.out.println(lista);
        System.out.println(lista.Size());
        lista.remove(4);
        System.out.println(lista);
        System.out.println(lista.Size());
        System.out.println(lista.get(9));

    }
}
