package br.com.alura.threads.aula6;

public class TarefaImprimir implements Runnable {

    private Lista lista;

    public TarefaImprimir(Lista lista) {
        this.lista = lista;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        synchronized (lista) {
            if (!lista.estaCheia()) {
                try {
                    System.out.println(name + "Aguardando notificação.");
                    lista.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < lista.tamanho(); i++) {
                System.out.println((i + 1) + " - " + lista.pegaElemento(i));
            }
        }
    }

}
