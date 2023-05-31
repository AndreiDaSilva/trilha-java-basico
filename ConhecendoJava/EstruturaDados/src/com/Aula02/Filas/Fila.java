package com.Aula02.Filas;

public class Fila<T> {

    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(T object) {
        No<T> novoNo = new No<>(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila;
            No<T> noAuxiliar = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }

        return null;
    }

    public T first() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }

        return null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String msg = "";
        No<T> noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null) {
            while (true) {
                msg += "[No{objeto = " + noAuxiliar.getObject() + "}] -> ";
                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    msg += "null";
                    break;
                }

            }
        } else {
            msg = "null";
        }

        return msg;
    }

}
