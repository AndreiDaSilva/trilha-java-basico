package com.Aula02.ListaCirculares;

public class No<T> {
    private T conteudo;
    private No<T> noProximo;
    
    public No(T conteudo){
        this.noProximo = null;
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
    public No<T> getNoProximo() {
        return noProximo;
    }

    /**
     * @param noProximo the noProximo to set
     */
    public void setNoProximo(No<T> noProximo) {
        this.noProximo = noProximo;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }

    
    
}
