package com.Aula02.ListaEncadeadas;

public class App {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println(lista.get(3));

        System.out.println(lista);

        System.out.println(lista.remove(0));
        System.out.println(lista);
        System.out.println(lista.remove(5));

        System.out.println(lista);

    }
}
