package br.com.alura.threads4;

import java.util.List;

public class TarefaAdicionarElemento implements Runnable {

    private List<String> lista;
    private int indexThread;

    public TarefaAdicionarElemento(List<String> lista, int indexThread) {
        this.lista = lista;
        this.indexThread = indexThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            lista.add("Thread " + indexThread + " - " + i);
        }
    }

}
