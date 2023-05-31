package com.Aula02.Pilhas;

public class No {
    private int dado;
    private No refNo = null;


    public No(){

    }

    /**
     * @param dado
     */
    public No(int dado) {
        this.dado = dado;
    }

    /**
     * @return the dado
     */
    public int getDado() {
        return dado;
    }

    /**
     * @param dado the dado to set
     */
    public void setDado(int dado) {
        this.dado = dado;
    }

    /**
     * @return the refNo
     */
    public No getRefNo() {
        return refNo;
    }

    /**
     * @param refNo the refNo to set
     */
    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No [dado=" + dado + "]";
    }
}
