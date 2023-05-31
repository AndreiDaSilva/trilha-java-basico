package com.Aula02.DuplamenteEncadeadas;

public class NoDuplo<T> {
    private T conteudo;
    private NoDuplo<T> noProximo;
    private NoDuplo<T> noPrevio;

    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;
    }

    /**
     * @return the conteudo
     */
    public T getConteudo() {
        return conteudo;
    }

    /**
     * @param conteudo the conteudo to set
     */
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    /**
     * @return the noProximo
     */
    public NoDuplo<T> getNoProximo() {
        return noProximo;
    }

    /**
     * @param noProximo the noProximo to set
     */
    public void setNoProximo(NoDuplo<T> noProximo) {
        this.noProximo = noProximo;
    }

    /**
     * @return the noPrevio
     */
    public NoDuplo<T> getNoPrevio() {
        return noPrevio;
    }

    /**
     * @param noPrevio the noPrevio to set
     */
    public void setNoPrevio(NoDuplo<T> noPrevio) {
        this.noPrevio = noPrevio;
    }

    @Override
    public String toString() {
        return "NoDuplo [conteudo=" + conteudo + "]";
    }

}