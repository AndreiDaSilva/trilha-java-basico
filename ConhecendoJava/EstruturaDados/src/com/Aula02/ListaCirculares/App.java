package com.Aula02.ListaCirculares;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        ListaCircular<Integer> listaCircular = new ListaCircular<>();
        Random random = new Random();
        
        System.out.println(listaCircular);

        for (int i = 0; i < 10; i++) {
            listaCircular.add(random.nextInt(89) + 10);
        }
        System.out.println(listaCircular);
        System.out.println(listaCircular.size());
        listaCircular.add(5);
        System.out.println(listaCircular);
        System.out.println(listaCircular.size());
        listaCircular.remove(4);
        System.out.println(listaCircular);
        System.out.println(listaCircular.size());
        System.out.println(listaCircular.get(9));
    }
}
