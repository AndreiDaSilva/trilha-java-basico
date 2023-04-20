package com.aula02.filas;

public class Main {

    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();
        Nome novoNome = new Nome();

        minhaFila.enqueue("1 - " + novoNome.gerarNome());
        minhaFila.enqueue("2 - " + novoNome.gerarNome());
        minhaFila.enqueue("3 - " + novoNome.gerarNome());
        minhaFila.enqueue("4 - " + novoNome.gerarNome());
        minhaFila.enqueue("5 - " + novoNome.gerarNome());
        minhaFila.enqueue("6 - " + novoNome.gerarNome());
        minhaFila.enqueue("7 - " + novoNome.gerarNome());
        
        System.out.println(minhaFila);
        
        System.out.println(minhaFila.dequeue());
        
        System.out.println(minhaFila);
        
        minhaFila.enqueue("8 - " + novoNome.gerarNome());
        
        System.out.println(minhaFila);
        
        System.out.println(minhaFila.first());

        System.out.println(minhaFila);

    }
}
