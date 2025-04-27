package queue;

import java.util.LinkedList;

public class Queue<Trem> {

    private LinkedList<Trem> fila;

    public Queue() {
        this.fila = new LinkedList<>();
    }

    public void enfileirar(Trem x) {
        this.fila.addLast(x);  
    }

    public Trem desenfileirar() throws Exception {
        if (this.estaVazia()) {
            throw new Exception("A fila está vazia, não é possível desenfileirar.");
        }

        return this.fila.removeFirst();  
    }

    public boolean estaVazia() {
        return this.fila.isEmpty();
    }

    public int tamanho() {
        return this.fila.size();
    }
}
