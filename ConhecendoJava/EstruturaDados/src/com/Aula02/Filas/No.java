package com.Aula02.Filas;

public class No<T> {
    private T object;
    private No<T> refNo;

    public No() {
    }

    public No(T object) {
        this.refNo = null;
        this.object = object;
    }

    /**
     * @return the object
     */
    public T getObject() {
        return object;
    }

    /**
     * @param object the object to set
     */
    public void setObject(T object) {
        this.object = object;
    }

    /**
     * @return the refNo
     */
    public No<T> getRefNo() {
        return refNo;
    }

    /**
     * @param refNo the refNo to set
     */
    public void setRefNo(No<T> refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No [object=" + object + "]";
    }

}
