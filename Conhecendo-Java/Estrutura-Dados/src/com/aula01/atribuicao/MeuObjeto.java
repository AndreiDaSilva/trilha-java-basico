package com.aula01.atribuicao;

public class MeuObjeto {
    Integer num;

    public MeuObjeto(Integer num) {
        this.num = num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String toString() {
        return this.num.toString();
    }
}