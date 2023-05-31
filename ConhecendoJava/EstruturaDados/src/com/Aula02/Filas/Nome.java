package com.Aula02.Filas;

import java.util.Random;

public class Nome {

    private static final Random random = new Random();

    public String gerarNome() {
        String nome = "";
        for (int i = 0; i < 6; i++) {
            nome += ((char)('a' + Math.abs(random.nextInt(26)))); 
        }

        return nome;
    }
}