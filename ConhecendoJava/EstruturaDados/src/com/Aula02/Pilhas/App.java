package com.Aula02.Pilhas;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new No(random.nextInt(9)));
        minhaPilha.push(new No(random.nextInt(9)));
        minhaPilha.push(new No(random.nextInt(9)));
        minhaPilha.push(new No(random.nextInt(9)));
        minhaPilha.push(new No(random.nextInt(9)));
        minhaPilha.push(new No(random.nextInt(9)));

        System.out.println(minhaPilha);

        System.out.println(minhaPilha.pop());

        System.out.println(minhaPilha);

        minhaPilha.push(new No(9));

        System.out.println(minhaPilha);
    }
    
}
