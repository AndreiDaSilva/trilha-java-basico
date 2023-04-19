package com.aula01.projetoNo;

public class No {
    private String conteudo;
    private No proximoNo;

    public No(String conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    /**
     * @return the conteudo
     */
    public String getConteudo() {
        return conteudo;
    }

    /**
     * @param conteudo the conteudo to set
     */
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    /**
     * @return the proximoNo
     */
    public No getProximoNo() {
        return proximoNo;
    }

    /**
     * @param proximoNo the proximoNo to set
     */
    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }

}