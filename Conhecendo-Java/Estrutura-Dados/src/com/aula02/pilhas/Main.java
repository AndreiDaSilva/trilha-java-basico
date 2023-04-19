package com.aula02.pilhas;

import java.util.Random;

public class Main {
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
