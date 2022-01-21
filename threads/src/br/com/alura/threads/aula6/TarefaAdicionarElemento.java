package br.com.alura.threads.aula6;

public class TarefaAdicionarElemento implements Runnable {

    private Lista lista;
    private int indexThread;

    public TarefaAdicionarElemento(Lista lista, int indexThread) {
        this.lista = lista;
        this.indexThread = indexThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            lista.adicionaElementos("Thread " + indexThread + " - " + i);
        }
    }

}
